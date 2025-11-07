package com.tnsif.AdminServices.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.AdminServices.entity.Admin;
import com.tnsif.AdminServices.repository.AdminRepository;

@Service
public class AdminService {

	@Autowired
	private AdminRepository adminRepository;

	// Retrieve all records
	public List<Admin> listAll() {
		return adminRepository.findAll();
	}

	// Retrieve by ID
	public Admin getAdminById(int id) {
		Optional<Admin> admin = adminRepository.findById(id);
		return admin.orElse(null);
	}

	// Insert new record
	public void saveAdmin(Admin admin) {
		adminRepository.save(admin);
	}

	// Update existing record
	public void updateAdmin(Admin admin) {
		adminRepository.save(admin);
	}

	// Delete record by ID
	public void deleteAdmin(int id) {
		adminRepository.deleteById(id);
	}
}

