package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*HttpServlet Ŭ������ ��� �޴� ��������
 * �� Ŭ������ ���� ������������ ���� ������ ������ �ȴ�. 
 * �� �����̶�? �ڹ��� Ŭ���� �� ���������� ����� �� �ִ� Ŭ����..
 * jsp�� ��� ���� ���� �������� ��ȯ�Ǿ� ����ȴ�.
 * ���� �Ʒ��� ���� ���谡 ����
 * jsp�� �����̾���!!
 */
public class MyServlet extends HttpServlet {
	@Override
	// Ŭ���̾�Ʈ�� ��û�� �޴� �޼���
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	PrintWriter out = 	resp.getWriter();//�������� ���ڿ��� ����ϱ� ���� ��½�Ʈ�� ����
	out.print("my server test");

	}
}
