package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*HttpServlet 클래스를 상속 받는 순간부터
 * 이 클래스는 오직 웹서버에서만 실행 가능한 서블릿이 된다. 
 * 즉 서블릿이란? 자바의 클래스 중 서버에서만 실행될 수 있는 클래스..
 * jsp는 사실 실행 전에 서블릿으로 변환되어 실행된다.
 * 따라서 아래의 같은 관계가 성립
 * jsp가 서블릿이었다!!
 */
public class MyServlet extends HttpServlet {
	@Override
	// 클라이언트의 요청을 받는 메서드
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	PrintWriter out = 	resp.getWriter();//브라우저에 문자열을 출력하기 위한 출력스트림 생성
	out.print("my server test");

	}
}
