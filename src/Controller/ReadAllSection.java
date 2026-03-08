package Controller;

import Model.Database;
import Model.Product;
import Model.Section;

import java.sql.ResultSet;

import java.util.ArrayList;

public class ReadAllSection {
    private ArrayList<Section> sections;
    private Database database;
    public ReadAllSection( Database database) {
        this.database = database;
        String select = "SELECT * FROM `section`; ";
        
        sections = new ArrayList<>();
        try {
            ResultSet rs = database.getStatement().executeQuery(select);
            while (rs.next()) {
                Section section = new Section();
                section.setID(rs.getInt("ID"));
                section.setName(rs.getString("Name"));
                section.setDescription(rs.getString("Description"));
                sections.add(section);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void print(){
        for(Section s : sections){
            s.print();
        }
        System.out.println("-------------------------");
    }
    public void printWithProducts(){
        for(Section s : sections){
         s.setProducts(new ReadSectionProducts(s.getID(),database).getProducts());
        }
        for(Section s : sections){
            System.out.println(s.getName());
            for(int i = 0;i<s.getName().length();i++){
                System.out.print("-");
            }
            System.out.println();

            for(Product p : s.getProducts()){
                System.out.println(p.getID()+". "+p.getName()+"    "+p.getPrice()+"$");
            } System.out.println("-------------------------");
        }
    }
    public ArrayList<Integer> getIDs(){
        ArrayList<Integer> ids = new ArrayList<>();
        for(Section s : sections){
            ids.add(s.getID());
        }
        return ids;
    }
    public ArrayList<Section> getList(){
        return sections;
    }
}
