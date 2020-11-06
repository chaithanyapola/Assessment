package com.apex.Assessment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apex.Assessment.model.listdetails;
import com.apex.Assessment.model.portfolio;
import com.apex.Assessment.service.portifolioService;



@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1")
public class portifolioContoller {

	@Autowired
	portifolioService pservie;
	
	@GetMapping("/plist")
	
	public ResponseEntity<List<portfolio>> get()
	{

		System.out.println("inside controll");
		List<portfolio> list= pservie.list();
		return new ResponseEntity<List<portfolio>> (list,HttpStatus.OK);
	}
	
@GetMapping("/users/{AccountName}")
	
	public ResponseEntity<List<String>> getbyID(@PathVariable("AccountName") int AccountName) throws Exception
	{

		System.out.println("inside Id");
		List<String> list= pservie.findByAccountName(AccountName);
				System.out.println(list);
				
				if(list==null)
				{
				    throw new Exception("Fields are not exists");
				}
		return new ResponseEntity<List<String>>(list,HttpStatus.OK);
	}
	
}
