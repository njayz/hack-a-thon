<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>

<%
 Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pha", "root", "root");
    
ResultSet rs=con.createStatement().executeQuery("select * from patient ");
%>
<html>
    <body><center><br><br><br><br>
        <h3>LIST OF patient</h3>
        <table cellpadding="1" cellspacing="2" width="100%">
            <thead>
                <tr>
                    <th colspan="1" bgcolor="#cccccc"align="center">mob </th>            
                    <th colspan="1" bgcolor="#cccccc"align="center">name</th>
                    <th colspan="1" bgcolor="#cccccc"align="center">city</th>
                    <th colspan="1" bgcolor="#cccccc"align="center">state</th>
                    <th colspan="1" bgcolor="#cccccc"align="center">email</th>
                  
                    
                </tr>
            </thead>
            <tbody>
<%
while(rs.next()){
            String mob=rs.getString(1);
            String name=rs.getString(3);
            String city=rs.getString(4);
            String state=rs.getString(5);
            String email=rs.getString(6);
          
%>
                <tr>
                    <td><%=mob%></td>
                    <td><%=name%></td>
                    <td><%=city%></td>
                    <td><%=state%></td>
                    <td><%=email%></td>
                   
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
