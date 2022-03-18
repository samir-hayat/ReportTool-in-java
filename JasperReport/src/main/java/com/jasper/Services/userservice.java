package com.jasper.Services;
import java.util.List;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jasper.Model.Userdto;
import com.jasper.Model.Users;
import com.jasper.Repo.UserImpl;
import com.jasper.Repo.UserRepo;


 @Service
public class userservice implements UserImpl {
    
	@Autowired
	private UserRepo userrepo;

	@Override
	public void create(Users user) {
		
		userrepo.save(user);
	}
	
	public Userdto save(Userdto dto ) {
		
    userrepo.saveuser(dto.getUsername() ,dto.getEmail(),dto.getAddres(),dto.getPassword());
    	
		return dto;
		
	}
	

	@Override
	public void delete(int id) {
		userrepo.deleteuser(id);
		
	}
	
	@Override
	public Users getuser(int id) {
        return userrepo.getUserById(id);	
	}

	@Override
	public List<Users> getAllUser() {
		
		return userrepo.getall();
	}

	@Override
	public void update(int id, User user) {
		// TODO Auto-generated method stub
		
	}
	
}
