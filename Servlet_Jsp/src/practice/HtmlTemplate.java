package practice;

import java.io.PrintWriter;

public class HtmlTemplate {
	//header
	public void header(PrintWriter out) {
		out.println("<!DOCTYPE HTML>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset = UTF-8'>");
		out.println("<title>ServletTask</title>");
		out.println("</head>");
		out.println("<body>");
	}

	//footer
	public void footer(PrintWriter out) {
		out.println("</body>");
		out.println("</html>");
	}

}
