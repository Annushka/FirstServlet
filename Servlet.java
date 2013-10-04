/// Есть web страничка с формой и кнопочкой. Записываем в форму что-то, 
//нажимаем на кнопочку и после нажатия то, что было написано в форме отражается 
//в консоли нашего сервлета.

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
		Map<String,String[]> map = request.getParameterMap();
		System.out.println(map.get("text")[0] );
		
		//request.setAttribute("is_ok", true);
		
	}
}
