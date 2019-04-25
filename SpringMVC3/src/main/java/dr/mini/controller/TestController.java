package dr.mini.controller;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	@RequestMapping("/hello.do")
	public ModelAndView hello() { //�޼����� �Ű������� ������ ������� �ۼ� ����
		System.out.println("TestController �����!");
		ModelAndView mav=new ModelAndView("hello");
		mav.addObject("greeting",getGeeting());//${greeting}
		return mav;
	}
	
	private String getGeeting() {
		System.out.println("getGeeting() ȣ���!");
		int hour=Calendar.getInstance().get(Calendar.HOUR_OF_DAY);//�ð�
		if(hour >=6 && hour<=10) {
			return "���� ��ħ�Դϴ�.";
		}else if(hour >=12 && hour <=15) {
			return "���ɽĻ�� �ϼ̳���?";
		}else if(hour>=16 && hour <=22) {
			return "������ �Դϴ�.";
		}
		return "�ȳ��ϼ���?";
	}
}






