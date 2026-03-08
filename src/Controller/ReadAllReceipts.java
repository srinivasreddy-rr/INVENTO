package Controller;

import Model.Database;
import Model.Receipt;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ReadAllReceipts {
    private ArrayList<Receipt>  receipts;
    public ReadAllReceipts(Database database) {
        String select = "SELECT * FROM `receipts` ;";
        ArrayList<Integer> cashierIDs = new ArrayList<>();
         receipts = new ArrayList<>();
        try {
            ResultSet rs = database.getStatement().executeQuery(select);
            while (rs.next()) {
                Receipt r = new Receipt();
                r.setID(rs.getInt("ID"));
                cashierIDs.add(rs.getInt("Cashier"));
                r.setTotal(rs.getDouble("Total"));
                r.setPayment(rs.getInt("Payment"));
                r.setPaid(rs.getDouble("Paid"));
                r.setChange(rs.getDouble("Chan"));
                receipts.add(r);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

            for (int i = 0; i < receipts.size(); i++) {
                receipts.get(i).setCashier(new ReadEmployee(cashierIDs.get(i), database).getEmployee());
           receipts.get(i).setProduct(new ReadReceiptProducts(receipts.get(i).getID(),database).getProducts());
            }

    }
    public  ArrayList<Receipt> getReceipts(){
        return receipts;
    }
}




