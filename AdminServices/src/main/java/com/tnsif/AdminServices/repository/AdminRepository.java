package com.tnsif.AdminServices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tnsif.AdminServices.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
	// Marker interface – inherits CRUD methods
}
