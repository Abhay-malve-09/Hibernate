package com.rays.crud;

import java.util.Iterator;
import java.util.List;

import com.rays.dto.UserDTO;

public class TestSearch {

	
	public static void main(String[] args) {
		
		SearchUser user = new SearchUser();
		UserDTO dto = new UserDTO();
		
		List<UserDTO> list = user.search(dto, 1, 10);
		
		Iterator<UserDTO> it = list.iterator();
		
		while (it.hasNext()) {
			dto = it.next();
			
			System.out.println(dto.getId());
			System.out.println(dto.getFirstName());
			System.out.println(dto.getLastName());
			System.out.println(dto.getLogin());
			System.out.println(dto.getPassword());
		}
		
	}
}
