package dr.mini.controller;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	@RequestMapping("/hello.do")
	public ModelAndView hello() { //메서드명과 매개변수는 여러분 마음대로 작성 가능
		System.out.println("TestController 실행됨!");
		ModelAndView mav=new ModelAndView("hello");
		mav.addObject("greeting",getGeeting());//${greeting}
		return mav;
	}
	
	private String getGeeting() {
		System.out.println("getGeeting() 호출됨!");
		int hour=Calendar.getInstance().get(Calendar.HOUR_OF_DAY);//시간
		if(hour >=6 && hour<=10) {
			return "좋은 아침입니다.";
		}else if(hour >=12 && hour <=15) {
			return "점심식사는 하셨나요?";
		}else if(hour>=16 && hour <=22) {
			return "초저녁 입니다.";
		}
		return "안녕하세요?";
	}
}






