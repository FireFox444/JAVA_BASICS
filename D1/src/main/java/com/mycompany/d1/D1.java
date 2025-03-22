/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.d1;

/**
 *
 * @author HP
 */
import java.util.*;
import java.sql.*;
public class D1 {

    public static void main(String[] args) {
        int ch=0;
        String sql;
        
        System.out.println("1.insert data");
         System.out.println("2.select data");
          System.out.println("3.update data");
           System.out.println("4.delete data");
            System.out.println("Enter choice");
            
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost/tybce","root","");
                Statement stmt=con.createStatement();
                ResultSet rs;
                
                Scanner sc=new Scanner(System.in);
                while(ch!=5)
                {
                    System.out.println("Enter 1. To insert \n2. Update\n3. Display\n5. Exit \n");
                    ch=sc.nextInt();
                switch(ch)
                {
                    case 1:
                        int rno,mno = 0;
                        String name,gender;
                        
                        System.out.println("Enter RollNO:");
                        rno=sc.nextInt();
                        
                         System.out.println("Enter Name:");
                        name=sc.next();
                        
                         System.out.println("Enter gender:");
                        gender=sc.next();
                        
                         System.out.println("Enter mobile no:");
                        mno=sc.nextInt();
                        
                        sql="insert into Student values ("+rno+",'"+name+"','"+gender+"',"+mno+")";
                        stmt.executeQuery(sql);
                        System.out.println("insert record");
                        break;
                        
                    case 2:
                        sql="select * from student ";
                        rs=stmt.executeQuery(sql);
                        System.out.println("-------------------------------------------------------");
                        while(rs.next())
                        {
                            System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getString(3)+""+rs.getInt(4));
                            System.out.println("-----------------------------------------------------------------");
                            
                        }
                        break;
                        
                    case 3:
                        int uid,umno;
                        String uname,ugn;
                        
                        System.out.println("Enter RollNO:");
                        uid=sc.nextInt();
                        
                         System.out.println("Enter Name:");
                        uname=sc.next();
                        
                         System.out.println("Enter gender:");
                        ugn=sc.next();
                        
                         System.out.println("Enter mobile no:");
                        umno=sc.nextInt();
                        
                        sql="update form student name='"+uname+"',gender='"+ugn+"',mobile no="+umno+",where roll="+uid+"";
                        stmt.executeUpdate(sql);
                        System.out.println("Update sucessfully");
                        break;
                        
                    case 4:
                        int did;
                        
                        System.out.println("Enter Roll no:");
                        did=sc.nextInt();
                        
                        sql="delete from student where roll="+did+"";
                        stmt.executeQuery(sql);
                        System.out.println("delete record");
                        break;
                        
                    case 5:
                        System.out.println("Thanks for programming");
                        break;
                    default:
                        System.out.println("Andha Ha kya Laura");
                        break;
                }
               
            }
            catch(Exception e)
            {
                    System.out.println(e);
            }
        }
    }
}
