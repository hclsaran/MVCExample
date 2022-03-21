package com.hcl.model2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	private String username;
	private String password;
	
	public boolean checkUnamePwd() {
		if(username.equals("Saran")&& password.equals("123")) {
		  return true;	
		}
		else
			return false;
	}

}
