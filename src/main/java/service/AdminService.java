package service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Admin;
import entity.User;
import repo.AdminRepo;

@Service
public class AdminService {

	@Autowired
    private AdminRepo repoA;
	
public Admin saveAdmin(Admin admin) {
    return repoA.save(admin);
}
public List<Admin> saveAdmins(List<Admin> admins) {
    return repoA.saveAll(admins);
}
public Admin getAdminById(int id) {
    return repoA.findById(id).orElse(null);
}
}
