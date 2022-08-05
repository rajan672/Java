package icsd;
import java.io.IOException; 
import java.sql.Connection;
import java.sql.PreparedStatement; import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletConfig; import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet; import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest; import javax.servlet.http.HttpServletResponse;
import oracle.jdbc.pool.OracleDataSource;
@WebServlet("/Auth")
public class Auth extends HttpServlet {
Connection con=null;
PreparedStatement stmt=null; ResultSet rset=null;
public Auth() {
}
public Connection getDBCon()
{
Connection con=null;
try {
OracleDataSource ods=new OracleDataSource();
ods.setURL("jdbc:oracle:thin:@localhost:1521:xe"); con=ods.getConnection("hemant","icsd");
System.out.println("connection established successfully");
} catch (SQLException e) {
// TODO Auto-generated catch block e.printStackTrace();
}
return con;
}
public void init(ServletConfig config) throws ServletException
{
con=getDBCon(); try {
stmt=con.prepareStatement("insert into tbleit(name,password,email,country) values (?,?,?,?)");
} catch (SQLException e) {
// TODO Auto-generated catch block e.printStackTrace();
}
System.out.println("init method fired ");
}
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doPost(request, response);
}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
System.out.println("service method calelddddddddddddd"); String strUnm,strPwd,stremail,strcty; strUnm=request.getParameter("name"); strPwd=request.getParameter("password"); stremail=request.getParameter("email"); strcty=request.getParameter("country");
try {
stmt.setString(1, strUnm); stmt.setString(2, strPwd);
stmt.setString(3, stremail);
stmt.setString(4, strcty); stmt.executeUpdate();
} catch (SQLException e) {
// TODO Auto-generated catch block e.printStackTrace();
}
}
public void delete()
{
try
{
if(con!=null)
{
con.close();
}
if(stmt!=null)
{
stmt.close();
}
if(rset!=null)
{
rset.close();
}
}
catch(SQLException se)
{
}
System.out.println("destroy fired");
}
}
//Servlet code 2
package icsd;
import java.io.IOException;
import java.io.PrintWriter; import java.sql.Connection;
import java.sql.PreparedStatement; import java.sql.ResultSet;
import java.sql.SQLException; import java.util.List;
mport javax.servlet.ServletConfig;
import javax.servlet.ServletException; import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest; import javax.servlet.http.HttpServletResponse;
import oracle.jdbc.pool.OracleDataSource;
@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {
private static final long serialVersionUID = 1L; Connection con=null;
PreparedStatement stmt=null; ResultSet rset=null;
public ViewServlet() { super();
}
public Connection getDBCon()
{
Connection con=null; try {
OracleDataSource ods=new OracleDataSource(); ods.setURL("jdbc:oracle:thin:@localhost:1521:xe");
con=ods.getConnection("hemant","icsd"); System.out.println("connection established successfully");
} catch (SQLException e) {
// TODO Auto-generated catch block e.printStackTrace();
}
return con;
}
public void init(ServletConfig config) throws ServletException
{
con=getDBCon(); try {
stmt=con.prepareStatement("SELECT * FROM TBLEIT"); } catch (SQLException e) {
// TODO Auto-generated catch block e.printStackTrace();
}
System.out.println("init method fired ");
}
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
try
{
rset=stmt.executeQuery();
PrintWriter out=response.getWriter(); out.println("<html><head><title>Inbox</title></head><body>");
if(rset.next())
{
String strUnm=rset.getString("name"), strpwd=rset.getString("password"), strEmail=rset.getString("email"), strcty=rset.getString("country"); out.println("<b>Username : </b>"+strUnm+"<br>"); out.println("<b>Subject : </b>"+strpwd+"<br>"); out.println("<b>Email From : </b>"+strEmail+"<br>"); out.println("<b>Message : </b>"+strcty+"<br>");
}
out.println("</body></html>");
}
catch (SQLException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
public void destroy()
{
//resources dealloacte
try
{
if(con!=null)
{
con.close();
}
if(stmt!=null)
{
stmt.close();
}
if(rset!=null)
{
rset.close();
}
}
catch(SQLException se)
{
}
}	
}

