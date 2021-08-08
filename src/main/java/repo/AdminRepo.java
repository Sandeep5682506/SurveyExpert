package repo;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Admin;



public interface AdminRepo extends JpaRepository<Admin,Integer> {

}
