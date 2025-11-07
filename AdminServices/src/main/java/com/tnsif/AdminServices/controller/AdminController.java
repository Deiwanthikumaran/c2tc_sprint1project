package com.tnsif.AdminServices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.tnsif.AdminServices.entity.Admin;
import com.tnsif.AdminServices.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private AdminService adminService;

	// Get all admins
	@GetMapping("/all")
	public List<Admin> getAllAdmins() {
		return adminService.listAll();
	}

	// Get admin by ID
	@GetMapping("/{id}")
	public Admin getAdmin(@PathVariable int id) {
		return adminService.getAdminById(id);
	}

	// Add new admin
	@PostMapping("/add")
	public String addAdmin(@RequestBody Admin admin) {
		adminService.saveAdmin(admin);
		return "Admin added successfully!";
	}

	// Update admin
	@PutMapping("/update")
	public String updateAdmin(@RequestBody Admin admin) {
		adminService.updateAdmin(admin);
		return "Admin updated successfully!";
	}

	// Delete admin by ID
	@DeleteMapping("/delete/{id}")
	public String deleteAdmin(@PathVariable int id) {
		adminService.deleteAdmin(id);
		return "Admin deleted successfully!";
	}
}
