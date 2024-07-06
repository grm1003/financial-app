package com.financial.app.infraestructure.database.repository;

import com.financial.app.infraestructure.database.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, String> {
}
