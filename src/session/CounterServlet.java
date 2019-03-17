package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CounterServlet
 */
@WebServlet("/CounterServlet")
public class CounterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CounterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// セッションの取得
		HttpSession session = request.getSession();

		// セッションからオブジェクトの取得
		Integer count = (Integer) session.getAttribute("count");

		// 一番初めのリクエストにはcountという名前のオブジェクトはないためnullとなる
		if (count == null) {
			count = new Integer(0);
		}

		// カウンタを+1
		count = new Integer(count.intValue() + 1);

		// セッションにオブジェクトの格納
		session.setAttribute("count", count);

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");

		// セッションIDの表示
		out.println("<p>sessionId=" + session.getId());

		// カウンタの表示
		out.print("<p>count=" + count);

		// このサーブレットへのリンクの表示
		String linkUrl = request.getRequestURI();
		out.println("<p><a href=\"" + linkUrl + "\">RELOAD</a>");
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
