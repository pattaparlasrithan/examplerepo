<%@ page language="java" contentType="text/html; charset=ISO-8859-1" import="com.bank.dto.Translist,java.util.ArrayList"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Transaction Details</title>
</head>
<body>
  <h1 align="center">Displaying Transaction List</h1> 
      <table border ="1" width="500" align="center"> 
         <tr bgcolor="00FF7F"> 
         <th><b>Trans_ID</b></th> 
          <th><b>Account_No</b></th> 
          <th><b>Amount</b></th> 
          <th><b>Date</b></th>
          <th><b>Trans_Type</b></th>
         </tr> 
        <%-- Fetching the attributes of the request object 
             which was previously set by the servlet  
              "StudentServlet.java" 
        --%>  
        <%ArrayList<Translist> std =  
            (ArrayList<Translist>)request.getAttribute("data"); 
        for(Translist s:std){%> 
        <%-- Arranging data in tabular form 
        --%> 
            <tr> 
                <td><%=s.getTransid()%></td> 
                <td><%=s.getAccountno()%></td> 
                <td><%=s.getAmount()%></td>
                <td><%=s.getTdate()%></td>
                <td><%=s.getType()%></td>  
            </tr> 
            <%}%> 
        </table>  
        <hr/> 

</body>
</html>