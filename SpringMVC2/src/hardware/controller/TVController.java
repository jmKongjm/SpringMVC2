package hardware.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class TVController {
	@RequestMapping("/tv")
	public String execute()
	{
		System.out.println("TV ��û�� ó���Ҳ���~");
		//tv ������ ���� ��� �����ֱ�!!
		
		return "tv/result"; //return�� Ȯ���ڸ� �����ϸ� �� ��. �ֳ� Ȯ���ڸ� ������ �������̰� ��. Ȯ���� ���� ���ξ ��� ������ ����
		//�� �����ؾ� �Ѵ�. �̰��� front.xml���� prefix�� suffix�� ���� �־���.  
	}
}