package dao;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import dto.userDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class userDAO  {

	
	@Id
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
	
}
