/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author RP~HiT
 */
public class searchp extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
           try {

            String mob=request.getParameter("mob");
            
             Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pha", "root", "root");


PreparedStatement ps=con.prepareStatement(" select * from ehaform where mob = ?");        
ps.setString(1,mob);
ResultSet rs=ps.executeQuery();
boolean found=rs.next();


if(found){
    
    
    
    
    
 out.println(" <body><center><br><br><br><br>");
    out.println( " <h3>medical histroy of user</h3>");
    
                int ms1=rs.getInt(2);
                String  ms3=rs.getString(3);
                int ms4=rs.getInt(4);
                String  ms5=rs.getString(5);
                String  ms6=rs.getString(6);
                String  ms7=rs.getString(7);
                String  ms8=rs.getString(8);
                String  ms9=rs.getString(9);
                String  ms10=rs.getString(10);
                String  ms11=rs.getString(11); 
                String  ms12=rs.getString(12);
                
                out.println("mobile no : "+rs.getString(1) +"<br>");
                out.println("age  : "+ms1+"<br>");
               
                out.println("sex : "+ms3+"<br>");
                out.println("weight : "+ms4+"<br>");
                out.println("past diseases : "+ms5+"<br>");
                out.println("current diseases : "+ms6+"<br>");
                out.println("vital : "+ms7+"<br>");
                out.println("medicean : "+ms8+"<br>");
                out.println("immunation : "+ms9+"<br>");
                out.println("company : "+ms10+"<br>");
                out.println("city : "+ms11+"<br>");
                out.println("city : "+ms12+"<br>");
                out.println("----------------------------<br>");
               

               
}
else{
                out.println("Invalid Roll No .......");
}
con.close();
    
        
        
        } catch (SQLException ex) {
            Logger.getLogger(searchp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(searchp.class.getName()).log(Level.SEVERE, null, ex);
        } finally {            
            out.close();
             }
    }  
        }

