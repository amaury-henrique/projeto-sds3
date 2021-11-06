package com.devsuperior.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dsvendas.dto.SaleSuccessDTO;
import com.devsuperior.dsvendas.dto.SaleSumDTO;
import com.devsuperior.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	
	@Query("Select new com.devsuperior.dsvendas.dto.SaleSumDTO(obj.seller,SUM(obj.amount))"
			+ " From Sale as obj group by obj.seller")
	List<SaleSumDTO> amountGroupBySeller();
	
	@Query("Select new com.devsuperior.dsvendas.dto.SaleSuccessDTO(obj.seller,SUM(obj.visited), SUM(obj.deals))"
			+ " From Sale as obj group by obj.seller")
	List<SaleSuccessDTO> sucessGroupBySeller();
	
	
	
}
