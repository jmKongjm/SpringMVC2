/*�� Ŭ������ Ŭ���̾�Ʈ�� ������ ��û �� ����Ʈ����
 * ���õ� ��û�� ó���ϴ� ��Ʈ�ѷ��̴�.
 * */

package hardware.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class SmartPhoneController {
	//�� �޼��忡�� ��û�� ó���ϰڴ�. 
	@RequestMapping("/smartphone")
	public String execute()
	{
		System.out.println("����Ʈ�� ��û�� ó���Ҳ���~");
		return "smart/result";
	}
}
