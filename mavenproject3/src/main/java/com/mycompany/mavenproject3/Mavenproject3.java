/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject3;

/**
 *
 * @author HP
 */
import java.util.*;
import java.sql.*;
public class Mavenproject3 {

    public static void main(String[] args) {
        int ch;
        String sql;
        
        System.out.println("1.insert data");
        System.out.println("1.insert data");
        System.out.println("1.insert data");
        System.out.println("1.insert data");
        System.out.println("1.insert data");
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tybca","root","");
            Statement stmt=con.createStatement();
            ResultSet rs;
            
            Scanner sc=new Scanner(System.in);
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    int rno,mno;
                    String name,gn;
                    
                    System.out.println("Enter Roll No:");
                    rno=sc.nextInt();
                    
                     System.out.println("Enter Name:");
                    name=sc.next();
                    
                     System.out.println("Enter Gender:");
                    gn=sc.next();
                    
                     System.out.println("Enter Mobile:");
                    mno=sc.nextInt();
                    
                    sql="insert into student values ("+rno+",'"+name+"','"+gn+"',"+mno+")";
                    stmt.executeUpdate(sql);
                    System.out.println("insert complete");
                    break;
                    
                case 2:
                    sql="select * from student";
                    rs=stmt.executeQuery(sql);
                    System.out.println("----------------------------------------------------");
                    while(rs.next())
                    {
                       System.out.println(rs.getInt(1)+""+ rs.getString(2)+""+ rs.getString(3)+""+ rs.getInt(4));
                       System.out.println("-----------------------------------------------------");
                    }
                    break;
                    
                case 3:
                    int uid,umn;
                    String uname,ugn;
                                                            
                    System.out.println("Enter Roll No:");
                    uid=sc.nextInt();
                    
                     System.out.println("Enter Name:");
                    uname=sc.next();
                    
                     System.out.println("Enter Gender:");
                    ugn=sc.next();
                    
                     System.out.println("Enter Mobile:");
                    umn=sc.nextInt();
                    
                    sql="update from student set Name="+uname+",Gender="+ugn+",Mobile="+umn+" where roll="+uid+"";
                    stmt.executeUpdate(sql);
                    System.out.println("Update successful");
                    break;
                    
                case 4:
                    int did;
                    System.out.println("Enter Roll No:");
                    did=sc.nextInt();
                    
                    sql="delete from student  where roll"+did+"";
                    stmt.executeUpdate(sql);
                    System.out.println("delete recorde");
                    break;
                    
            }
            
        }catch(Exception e){System.out.println(e);}
    }
}
