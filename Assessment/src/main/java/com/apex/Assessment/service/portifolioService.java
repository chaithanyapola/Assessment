package com.apex.Assessment.service;

import java.util.List;

import com.apex.Assessment.model.listdetails;
import com.apex.Assessment.model.portfolio;

public interface portifolioService {
	
	List<portfolio> list();
	
	List<portfolio> findBylist(String keyword);
}
