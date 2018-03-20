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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author RP~HiT
 */
public class doctorinfo extends HttpServlet {

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
          
             Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pha", "root", "root");
    

PreparedStatement ps=con.prepareStatement("insert into doctorinfo values(?,?,?,?,?,?,?,?)");
   ps.setString(1, request.getParameter("mob"));
   ps.setString(2, request.getParameter("age"));
   ps.setString(3, request.getParameter("sex"));
   ps.setString(4, request.getParameter("name"));
   ps.setString(5, request.getParameter("speciality"));
   ps.setString(6, request.getParameter("quali"));
   ps.setString(7, request.getParameter("exp"));
   ps.setString(8, request.getParameter("hospital"));
   ps.executeUpdate();
   out.println( "You data submited succesfully"); 
                }
 
                catch (Exception ex) {
           out.println(ex);
        } finally {            
            out.close();
             
             
             
        }
    }
    }   
            