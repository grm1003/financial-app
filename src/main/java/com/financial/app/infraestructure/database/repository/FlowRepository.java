package com.financial.app.infraestructure.database.repository;


import com.financial.app.infraestructure.database.entity.FlowEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlowRepository extends JpaRepository<FlowEntity, Long>{
}
