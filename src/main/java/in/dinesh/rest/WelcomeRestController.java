package in.dinesh.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	private Logger logger = LoggerFactory.getLogger(WelcomeRestController.class);

	public WelcomeRestController() {
		logger.info("***** WelcomeRestController :: Constructor *****");
	}

	@GetMapping
	public String welcomeMsg() {
		logger.info("***** welcomeMsg() execution start *****");
		String msg = "Hey [Kakarla Bhavya Sree, RollNo:204E1A0521 ],\r\n"
				+ "You know, life is like a journey, and some people make it truly special. For me, that's you. You're not just my best friend—you’re my safe place, my partner in crime, and my greatest cheerleader.\r\n"
				+ "From our endless talks to the crazy adventures, every moment we’ve shared has been unforgettable. I’m so grateful to have someone as amazing as you in my life.💛..!!";
		logger.info("***** welcomeMsg() execution end *****");
		String s = "hello";
		logger.info("******************************************************************");
		return msg;
	}
	
	@GetMapping("/greet")
	public String greetMsg() {
		logger.info("***** greetMsg() execution start *****");
		String msg = "Hi Naveen Bava,\r\n"
				+ "\r\n"
				+ "You are a protector, a mentor, and a friend,\r\n"
				+ "Through every twist and turn, on you I depend.\r\n"
				+ "Your laughter is the light, your words the guide,\r\n"
				+ "With you in my corner, I beam with pride.\r\n"
				+ "This is my way of saying thank you for being you,\r\n"
				+ "My amazing Bava, loyal and true.\r\n"
				+ "\r\n"
				+ "Writen By :\r\n"
				+ "\r\n"
				+ "Kakarla Bhavya Sree\r\n"
				+ "\r\n"
				+ "";
		System.out.println("testing git collaboration");
		logger.info("***** greetMsg() execution end *****");
		int i = 10;
		logger.info("***** greetMsg() execution successfull *****");
		boolean status = false;
		logger.info("***** ***************************** *****");
		return msg;
	}
	
	
}
