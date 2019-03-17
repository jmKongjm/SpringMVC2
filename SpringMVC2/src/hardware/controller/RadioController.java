package hardware.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class RadioController {

	
	@RequestMapping("/radio")
	public String execute()
	{
		System.out.println("라디오 요청을 처리할께요~");
		return "radio/result";
	}
}
