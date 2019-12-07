package com.archeryScoringApp.mark.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.archeryScoringApp.mark.dao.DataAccessException;
import com.archeryScoringApp.mark.dao.UserDao;
import com.archeryScoringApp.mark.domain.User;

@Repository("userDao")
public class UserServiceImpl implements UserService {
    @Autowired
	private UserDao userDao;
    
	@Transactional(readOnly = false)
	@Override
	public User getUserByName(String userName, String password) throws DataAccessException {

		List<User> users = null;
		try {
			users = userDao.getUSerByName(userName);
		} catch (DataAccessException e) {
			throw new DataAccessException (e);
		}
		User validUser = new User();
	
		for(User user : users){
			String nameOfUser = user.getUserName();
			String userPassword = user.getPassword();
			if(nameOfUser.equals(userName) && userPassword.equals(password)){
			   	validUser = user;
			}
		}
		return validUser;
	}

	@Override
	public void setUser(User user) {
		// TODO Auto-generated method stub
	
		try {
			userDao.saveUser(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
