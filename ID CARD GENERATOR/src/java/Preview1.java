
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

@ManagedBean
@SessionScoped
public class Preview1 {

    
String name,id,adress,dob,dp,coll,year,gen;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getAdress() {
            return adress;
        }

        public void setAdress(String adress) {
            this.adress = adress;
        }

        public String getDob() {
            return dob;
        }

        public void setDob(String dob) {
            this.dob = dob;
        }

        public String getDp() {
            return dp;
        }

        public void setDp(String dp) {
            this.dp = dp;
        }

        public String getColl() {
            return coll;
        }

        public void setColl(String coll) {
            this.coll = coll;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public String getGen() {
            return gen;
        }

        public void setGen(String gen) {
            this.gen = gen;
        }

         public List <Register> singleList;
    public List <Register> getsinglelist(){
    singleList = new ArrayList<>();
    try{
        
           DBConnection dbcon = new DBConnection();
            Connection con = dbcon.connMethod();
          
             PreparedStatement ps = con.prepareStatement("select ID,FULLNAME,DATEOFBIRTH,COLLEGE,YEAR,DEPARTMENT,ADDRESS,GENDER from STUDENTS where ID=?");
               ps.setString(1, id);
             ResultSet rs = ps.executeQuery();
          
                 while (rs.next()) {
             Register add = new Register();
               // add.setId(rs.getString("ID"));
                add.setFullName(rs.getString("FULLNAME"));
                add.setDateOfBirth(rs.getString("DATEOFBIRTH"));
                add.setCollege(rs.getString("COLLEGE"));
                add.setYear(rs.getString("YEAR"));
                add.setDepartment(rs.getString("DEPARTMENT"));
                add.setAddress(rs.getString("ADDRESS"));
                add.setGender(rs.getString("GENDER"));
           
                singleList.add(add);
            } 
             
    } catch (ClassNotFoundException | SQLException e) {
            System.out.println("here is the proplem");
                
        }
     
    return singleList;
    }
        
}    