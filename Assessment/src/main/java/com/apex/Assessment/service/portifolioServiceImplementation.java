package com.apex.Assessment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apex.Assessment.model.listdetails;
import com.apex.Assessment.model.portfolio;
import com.apex.Assessment.repository.portifolioRepository;

@Service
public class portifolioServiceImplementation implements portifolioService {
	
	@Autowired
	portifolioRepository preo;

	@Override
	public List<portfolio> list() {
		// TODO Auto-generated method stub
		return preo.findAll();
	}

	

	@Override
	public List<portfolio> findBylist(String keyword) {
		// TODO Auto-generated method stub
		System.out.println("inside Id"+keyword);
		if(preo.findBylist(keyword).isEmpty())
		{
			System.out.println("empty");
			return null;
		}
		
		return preo.findBylist(keyword);
	}

}
