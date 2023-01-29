/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.image.BufferedImage;
import java.io.Serializable;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author malu
 */
@ManagedBean
@RequestScoped
public class Register {
private String fullName;
private BufferedImage b;
private String motherName;

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getHomeNo() {
        return homeNo;
    }

    public void setHomeNo(String homeNo) {
        this.homeNo = homeNo;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }
private String nationality;
private String homeNo;
private String hometown;

    public BufferedImage getB() {
        return b;
    }

    public void setB(BufferedImage b) {
        this.b = b;
    }
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
private String dateOfBirth;
private String college;
private String year;
private String department;
private String address;
private String id;
private String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    
    
     public void malu() {
         try{
  Register reg = new Register();
            DBConnection dbcon = new DBConnection();
            Connection con = dbcon.connMethod();
            String sql = "insert into STUDENTS(ID,FULLNAME,DATEOFBIRTH,COLLEGE,YEAR,DEPARTMENT,ADDRESS,GENDER,MOTHERNAME,NATIONALITY,HOMETOWN,HOMENO) values(?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
           
            ps.setString(1, id);
            ps.setString(2, fullName);  
            ps.setString(3, dateOfBirth);
            ps.setString(4, college);
            ps.setString(5, year);
            ps.setString(6, department);
            ps.setString(7, address);
            ps.setString(8,gender);
            ps.setString(9, motherName);
            ps.setString(10, nationality);
            ps.setString(11, hometown);
            ps.setString(12, homeNo);
             // ps.setBlob(8, (Blob) b);
            ps.executeUpdate();
            } catch (Exception e){
             System.out.println("there is aproblem");     
}
}
}