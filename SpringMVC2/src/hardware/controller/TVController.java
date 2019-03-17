package hardware.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class TVController {
	@RequestMapping("/tv")
	public String execute()
	{
		System.out.println("TV 요청을 처리할께요~");
		//tv 수리에 대한 결과 보여주기!!
		
		return "tv/result"; //return에 확장자를 명시하면 안 됨. 왜냐 확장자를 넣으면 의존적이게 됨. 확장자 전과 접두어를 어떻게 결합할 지를
		//잘 생각해야 한다. 이것을 front.xml에서 prefix와 suffix를 통해 주었다.  
	}
}
