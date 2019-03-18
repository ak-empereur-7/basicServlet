package session;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionListServlet
 */
@WebServlet("/SessionListServlet")
public class SessionListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 入力パラメータの取得
		String keyParam = request.getParameter("key");
		String valueParam = request.getParameter("value");

		// セッションの取得
		HttpSession session = request.getSession();

		// セッションにオブジェクトの格納
		if (keyParam != null) {
			session.setAttribute(keyParam, valueParam);
		}

		// フォームの出力
		response.setContentType("text/html; charset=utf-8");

		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<form action=\"\">");
		out.println("key <input type=\"text\" name=\"key\"><br>");
		out.println("value <input type=\"text\" name=\"value\"><br>");
		out.println("<input type=\"submit\" value=\"登録\">");
		out.println("</form>");

		// セッション属性のオブジェクト一覧を出力
		Enumeration<String> names = session.getAttributeNames();
		while (names.hasMoreElements()) {
			String key = names.nextElement();
			Object value = session.getAttribute(key);
			out.println(key + "=" + value + "<br>");
		}

		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
