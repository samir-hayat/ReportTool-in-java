package com.jasper.Model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity

public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String username;
	private String email;
    private String Addres;
    private String password;
    
    
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Users(int id, String username, String email, String addres, String password) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		Addres = addres;
		this.password = password;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddres() {
		return Addres;
	}


	public void setAddres(String addres) {
		Addres = addres;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	

    
    
}
