<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>

<%
 Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pha", "root", "root");
    
ResultSet rs=con.createStatement().executeQuery("select * from doctorinfo ");
%>
<html>
    <body><center><br><br><br><br>
        <h3>LIST OF patient</h3>
        <table cellpadding="1" cellspacing="2" width="100%">
            <thead>
                <tr>
                    <th colspan="1" bgcolor="#cccccc"align="center">Mobile </th>            
                    <th colspan="1" bgcolor="#cccccc"align="center">Age</th>
                    <th colspan="1" bgcolor="#cccccc"align="center">Sex</th>
                    <th colspan="1" bgcolor="#cccccc"align="center">Name</th>
                    <th colspan="1" bgcolor="#cccccc"align="center">Speciality</th>
                    <th colspan="1" bgcolor="#cccccc"align="center">Qualification</th>
                    <th colspan="1" bgcolor="#cccccc"align="center">Experience</th>
                    <th colspan="1" bgcolor="#cccccc"align="center">Hospital </th>
                   
                    
                </tr>
            </thead>
            <tbody>
<%
while(rs.next()){
            String mob=rs.getString(1);
            String age=rs.getString(2);
            String sex=rs.getString(3);
            String name=rs.getString(4);
            String speciality=rs.getString(5);
            String quali=rs.getString(6);
            String exp=rs.getString(7);
            String hospital=rs.getString(8);
           
%>
                <tr>
                    <td><%=mob%></td>
                    <td><%=age%></td>
                    <td><%=sex%></td>
                    <td><%=name%></td>
                    <td><%=speciality%></td>
                    <td><%=quali%></td>
                    <td><%=exp%></td>
                    <td><%=hospital%></td>
                                </tr>
<%
}
%>                
        
            </tbody>
        </table>
    </center>
</form>
    </body>
</html>
