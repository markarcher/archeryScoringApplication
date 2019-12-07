package com.archeryScoringApp.mark.service;

import java.util.List;

import com.archeryScoringApp.mark.dao.DataAccessException;
import com.archeryScoringApp.mark.domain.User;

public interface UserService {

	User getUserByName(String userName, String password) throws DataAccessException;

	void setUser(User user);
	
}
