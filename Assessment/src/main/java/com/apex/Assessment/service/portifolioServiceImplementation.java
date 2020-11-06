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
	public List<String> findByAccountName(int AccountName) {
		// TODO Auto-generated method stub
		if(preo.findByAccountName(AccountName).isEmpty())
		{
			return null;
		}
		
		return preo.findByAccountName(AccountName);
	}

}
