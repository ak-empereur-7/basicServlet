package validate;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EtoServlet
 */
@WebServlet("/EtoServlet")
public class EtoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	final static String[] ETOS = new String[] {
		"子",
		"丑",
		"寅",
		"卯",
		"辰",
		"巳",
		"午",
		"未",
		"申",
		"戌",
		"亥",
	};

	/**
     * @see HttpServlet#HttpServlet()
     */
    public EtoServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String yearStr = request.getParameter("year");

		String error = null;
		String etoText = null;

		if(yearStr == null || yearStr.length() == 0) {
			error = "何か入れてね";
		}

		if (error == null) {
			try {
				int year = Integer.parseInt(yearStr);

				if (year < 0) {
					error = "紀元前の人はサポート外です";
				} else {
					int index = (year * 8) % 12;
					etoText = ETOS[index];
				}
			} catch(NumberFormatException e) {
				error = "年を入れてください";
			}
		}

		response.setContentType("text/plain; charset=utf-8");
		PrintWriter out = response.getWriter();

		if (error != null) {
			out.println(error);
		} else {
			out.println("あなたの干支：" + etoText);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
