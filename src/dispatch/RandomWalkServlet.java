package dispatch;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RandomWalkServlet
 */
@WebServlet("/RandomWalkServlet")
public class RandomWalkServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	final static String[] PATHS = new String[] {
		"/FowardServletB",
		"/jsp/foward_ok.jsp",
	};

    /**
     * @see HttpServlet#HttpServlet()
     */
    public RandomWalkServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int index = new Random().nextInt(PATHS.length);
		String path = PATHS[index];

		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
