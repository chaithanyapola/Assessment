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

	//@Query("SELECT r.SecurityID,r.CurrentPosition,r.CurrentPrice FROM portfolio r where r.AccountName = :AccountName")
	@Query("select po from portfolio po where po.SecurityID like %?1% "
			+"or po.AccountName like %?1%"
			+"or po.CurrentPosition like %?1%"
			+"or po.CurrentPrice like %?1%"
			+"or po.PortfolioName like %?1%"
			+"or po.SODPosition like %?1%"
			+"or po.Side like %?1%"
			+"or po.TotalPL like %?1%")
	List<portfolio> findBylist(@Param("keyword") String keyword);
}
