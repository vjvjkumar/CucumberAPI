package com.pim.migration.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class PIMController {
	
	@Autowired
	Configuration conf;
	
	@RequestMapping (method={RequestMethod.GET},value={"/version"})
	public String version(){
		return "1.0";
	}
	
	
	/**
	 * Test API for cucumber test
	 * @param response
	 * @return
	 */
    @RequestMapping(method = { RequestMethod.GET }, value = { "/customer" })
    public Customer getEmployee(HttpServletResponse response) {
        return new Customer("John","Doe","***-**-3124","Dallas,TX");
    }
    
    /**
	 * Test API for Weather test
	 * @param response
	 * @return
	 */
    @RequestMapping(method = { RequestMethod.GET }, value = { "/weather" })
    public WeatherResponse getweather(HttpServletResponse response) {
    	System.out.println(conf.getUrl());
    	RestTemplate restTemplate = new RestTemplate();
    	ResponseEntity<WeatherResponse> responseq= restTemplate.getForEntity(conf.getUrl() , WeatherResponse.class);
    	System.out.println(responseq.getBody());
    	WeatherResponse res=responseq.getBody();
    	System.out.println(res.getBase());
        return res;
    }

}
