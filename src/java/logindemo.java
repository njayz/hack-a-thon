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
 * @author RP~HIT
 */
public class logindemo extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            
            try
            {
           if(request.getParameter("user_type") != null){
           if(request.getParameter("user_type").equals("patient")){  
               String number=request.getParameter("number");
String pwd=request.getParameter("pwd");


            Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pha", "root", "root");

if(number.equalsIgnoreCase("rohitpatel@gmail.com")&&(pwd.equalsIgnoreCase("rphit123"))){
    PreparedStatement ps=con.prepareStatement("select * from patient where number=? and pwd=?");
                   
ps.setString(1, number);
ps.setString(2, pwd);
ResultSet rs=ps.executeQuery();
rs.next();
         
           String unm=rs.getString(1);
            request.getSession().setAttribute("username", unm);
            //String utype=rs.getString(5);
            //String status=rs.getString(7);  
            response.sendRedirect("adminhome.jsp");
            }     else{
     PreparedStatement ps=con.prepareStatement("select * from patient where number=? and pwd=?");
ps.setString(1, number);
ps.setString(2, pwd);
ResultSet rs=ps.executeQuery();
rs.next();
         
           String unm=rs.getString(1);
            request.getSession().setAttribute("username", unm);
                      
                            response.sendRedirect("patient.jsp");
}
            {
                out.println("<h2>Invalid User Details....</h2>");
                out.println("<a href=login.jsp>Try-Again</a>");
            }
            }
           if(request.getParameter("user_type").equals("doctor")){
            String number=request.getParameter("number");
String pwd=request.getParameter("pwd");


            Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pha", "root", "root");

if(number.equalsIgnoreCase("rohitpatel@gmail.com")&&(pwd.equalsIgnoreCase("rphit123"))){
    PreparedStatement ps=con.prepareStatement("select * from doctor where number=? and pwd=?");
                   
ps.setString(1, number);
ps.setString(2, pwd);
ResultSet rs=ps.executeQuery();
rs.next();
         
           String unm=rs.getString(1);
            request.getSession().setAttribute("username", unm);
            //String utype=rs.getString(5);
            //String status=rs.getString(7);  
            response.sendRedirect("adminhome.jsp");
            }     else{
     PreparedStatement ps=con.prepareStatement("select * from doctor where number=? and pwd=?");
ps.setString(1, number);
ps.setString(2, pwd);
ResultSet rs=ps.executeQuery();
rs.next();
         
           String unm=rs.getString(1);
            request.getSession().setAttribute("username", unm);
                      
                            response.sendRedirect("doctor.jsp");
}
       
                out.println("<h2>Invalid User Details....</h2>");
                out.println("<a href=login.jsp>Try-Again</a>");
            
            }
           }
            }
         catch (Exception ex) {
           out.println(ex);
         
           }finally {            
            out.close();
        }
            
    
    }
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(logindemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(logindemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

         
   