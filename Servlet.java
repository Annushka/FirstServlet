/// Есть web страничка с формой и кнопочкой. Записываем в форму что-то, 
//нажимаем на кнопочку и после нажатия то, что было написано в форме отражается 
//в консоли нашего сервлета.


// We already have a web page with form and button. 
//Write somthing to the form, push the button and after pushing that text, 
//that we have written to form is shown on eclipse console.


//Servlet.java 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class Servlet
 */
public class Servlet extends HttpServlet {

    public Servlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Map<String,String[]> map = request.getParameterMap();// key - is the title (in my case it is "text" ) and the value is that we have written in the form
		System.out.println(map.get("text")[0] ); // transferm to the console that was written to form
		
		//request.setAttribute("is_ok", true);
		//We already have the class, that implements the connection with already created database.
		//So, we write to database all text that was written to form on the dinamic page - wish.html
		
		//у нас уже есть класс TestDB, который реализует соединение с уже созданной базой данных.
		// Так мы записываем в базу то, что было введено в форму на нашей динамической страничке wish.html
		TestDB testDB = new TestDB();
		testDB.setValue(map.get("text")[0]);
		testDB.insert();
		
	}
}
