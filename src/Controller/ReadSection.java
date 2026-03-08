package Controller;

import Model.Database;
import Model.Section;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadSection {
    private Section section;
    public ReadSection(int ID, Database database){

        String select = "SELECT * FROM `section` WHERE `ID` = "+ID+";";
        try {
            ResultSet rs = database.getStatement().executeQuery(select);
            rs.next();
            section  = new Section();
            section.setID(rs.getInt("ID"));
            section.setName(rs.getString("Name"));
            section.setDescription(rs.getString("Description"));

        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public Section getSection(){
        return section;
    }
    public void print(){
        section.print();
    }
}
