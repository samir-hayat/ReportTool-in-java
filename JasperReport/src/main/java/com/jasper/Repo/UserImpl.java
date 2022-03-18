package com.jasper.Repo;
import java.util.List;

import org.apache.catalina.User;

import com.jasper.Model.Users;



public interface UserImpl {
	
	public void create(Users user);
	public void delete(int id);
	public void update(int id,User user);
	public Users getuser(int id);
	public List<Users> getAllUser();
	 

}
