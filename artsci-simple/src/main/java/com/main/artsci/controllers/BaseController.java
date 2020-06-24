package com.main.artsci.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import springfox.documentation.swagger2.annotations.EnableSwagger2;

import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@EnableSwagger2
public class BaseController  {

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    public ResponseEntity<String> regions() {       	
    	return new ResponseEntity<String>("Hello Artsci! :)", HttpStatus.OK);
    }
    
    @RequestMapping(value = "/hello/name/{name}", method = RequestMethod.GET)
		public ResponseEntity<String> getRegionById(@PathVariable("name") String name) {		
		return new ResponseEntity<String>("Hello ".concat(name), HttpStatus.OK);
	}  

}
