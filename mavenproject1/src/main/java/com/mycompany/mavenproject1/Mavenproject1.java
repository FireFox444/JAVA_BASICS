 
package com.mycompany.mavenproject1;

/**
 *
 * @author HP
 */
import java.util.*;
import java.sql.*;

public class Mavenproject1 {

    public static void main(String[] args) {
     int ch;
     String sql;
     
        System.out.println("1.insert data");
        System.out.println("2.select data");
        System.out.println("3.update data");
        System.out.println("4.delete data");
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DirverManager.getConnection("jdbc:mysql://localhost:3306/tybca","root","");
            
            Statement stmt=con.createStatement();
            ResultSet rs;
           Scanner sc=new Scanner(System.in);
            
            ch=sc.nextInt();
            
            switch(ch){
                case 1:
                    int rno,mno;
                    String name,gn;
                    
                      System.out.println("enter your roll no");
                    rno=sc.nextInt();
                    
                    System.out.println("enter your name");
                    name=sc.next();

                     System.out.println("enter your gendar");
                    gn=sc.next();
                    
                      System.out.println("enter your moblie no");
                    mno=sc.nextInt();
                    
                    sql="insert into student values("+ rno +",'"+ name +"','"+ gn +"',"+ mno +")";
                    stmt.executeQuery(sql);
                    System.out.println("insert data");
                    break;
                    
                case 2:
                    sql="select * from student";
                    rs=stmt.executeQuery(sql);
                    System.out.println("------------------------------------");
                    while(rs.next())
                    {
                        System.out.println(rs.getInt(1)+" "+rs.getString(2)+""+rs.getString(3)+" "+rs.getInt(4));
                        System.out.println("------------------------------------------------------------------");
                        
                    }
                    break;
                    
                case 3:
                    int uid , umno;
                    String uname,ugn;
                    
                    System.out.println("Enetr roll no:");
                    uid=sc.nextInt();
                    
                    System.out.println("Enter name:");
                    uname=sc.next();
                    
                    System.out.println("Enetr gender:");
                    ugn=sc.next();
                    
                    System.out.println("Enter Mobile no:");
                    umno=sc.nextInt();
                    
                    sql="update student set name='"+uname+"', gender='"+ugn+"',monile="+umno+" where roll="+uid+"";
                    stmt.executeUpdate(sql);
                    System.out.println("update data");
                    break;
                    
                case 4:
                    int did;
                    
                    System.out.println("Enetr Roll no:");
                    did=sc.nextInt();
                    
                    sql="delete from student where roll no="+did+"";
                    stmt.executeQuery(sql);
                    System.out.println("record deleted.");
                    break;
                                                                  
            }
             
            
        }catch(Exception e){System.out.println(e);}
        
     
    }
}
