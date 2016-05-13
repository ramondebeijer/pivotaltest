package io.pivotal.demo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HelloWorldController {

	@RequestMapping(method=RequestMethod.GET, value="/")
	@ResponseBody
	public String helloWorld()
	{
		return "Hello World from Spring Boot. The current time is " + convertCalendarToDateTimeString(Calendar.getInstance());
	}
	
	private static String convertCalendarToDateTimeString(Calendar date)
	{
		if (date == null)
			return null;
		
		Date theDate = date.getTime();
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		return sdf.format(theDate);
	}
}

