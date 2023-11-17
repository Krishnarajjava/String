package com.api1MobileProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MobileController {
	@Autowired
	RestTemplate rt;
	@GetMapping("/getMobile")
	public String getMobile() {
		String url="http://ProductAPI/getMob";
		String a=rt.getForObject(url,String.class);
		return a;
	}

}
