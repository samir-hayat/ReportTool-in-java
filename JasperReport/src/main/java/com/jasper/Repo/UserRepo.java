package com.jasper.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jasper.Model.Users;

@Repository
public interface UserRepo extends JpaRepository<Users,Integer>{
	 
	@Procedure(procedureName="SelectAllCustomers")
     Users getUserById(@Param("id") int id);
	
	@Procedure(procedureName="deleteuser")
	  void deleteuser(@Param("id") int id);
	  
	@Procedure(procedureName="selectalluser")
	 List<Users> getall();
 
	  @Procedure(procedureName="createuser")
	    void  saveuser(@Param("username") String username,@Param("email")
	    String email,@Param("addres") String addres,@Param("password") String password);

	Users getUserByUsername(String username);
	
}
