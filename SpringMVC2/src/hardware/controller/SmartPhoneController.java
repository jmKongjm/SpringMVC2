/*이 클래스는 클라이언트의 수많은 요청 중 스마트폰과
 * 관련된 요청만 처리하는 컨트롤러이다.
 * */

package hardware.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class SmartPhoneController {
	//이 메서드에서 요청을 처리하겠다. 
	@RequestMapping("/smartphone")
	public String execute()
	{
		System.out.println("스마트폰 요청을 처리할께요~");
		return "smart/result";
	}
}
