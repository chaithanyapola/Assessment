package com.apex.Assessment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.apex.Assessment.model.listdetails;
import com.apex.Assessment.model.portfolio;

@Repository

public interface portifolioRepository extends JpaRepository<portfolio, String> {

	@Query("SELECT r.SecurityID,r.CurrentPosition,r.CurrentPrice FROM portfolio r where r.AccountName = :AccountName")
	List<String> findByAccountName(@Param("AccountName") int AccountName);
}
