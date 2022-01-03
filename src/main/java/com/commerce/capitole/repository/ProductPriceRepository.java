package com.commerce.capitole.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.commerce.capitole.entity.ProductPriceEntity;

public interface ProductPriceRepository extends JpaRepository<ProductPriceEntity, Integer> {
	
	@Query("from ProductPriceEntity where brand.id = :brandId and productId = :productId and startDate <= :date" +
			" and endDate >= :date order by priority desc")
	List<ProductPriceEntity> findByDateAndProductIdAndBrandId(@Param("brandId") Integer brandId,
															  @Param("productId") Integer productId,
															  @Param("date") LocalDateTime date );

}
