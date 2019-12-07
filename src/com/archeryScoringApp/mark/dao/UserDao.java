package com.archeryScoringApp.mark.dao;

import java.util.List;

import com.archeryScoringApp.mark.domain.User;

public interface UserDao {

	List<User> getUSerByName(String userName) throws DataAccessException;

	void saveUser(User user);

}
