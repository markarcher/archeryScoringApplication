package com.archeryScoringApp.mark.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.archeryScoringApp.mark.domain.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	private SessionFactory sessionFactory;
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	

	@Transactional(readOnly = false)
	@Override
	public  List<User> getUSerByName(String userName) throws DataAccessException {
	
		System.out.println("your in user dao");
		Session session = sessionFactory.getCurrentSession();
		List<User> listOfUsers = null;
		try {
			listOfUsers = (List<User>) session.createQuery("from User").list();
		} catch (HibernateException e) {
			throw new DataAccessException (e);
		}
		return listOfUsers;
	}


	@Override
	public void saveUser(User user) {
	
		//persist in the database
		Connection con = null;
		int result = 0;
		try {
			con = ConnectionManager.getInstance().getConnection();
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PreparedStatement stmt = null;
		
		try {
			stmt = con.prepareStatement("insert into archeryscorring.user(password,role,userName)values(?,?,?)");
			stmt.setString(1, user.getPassword());
			stmt.setString(2, user.getRole());
			stmt.setString(3, user.getUserName());
			result = stmt.executeUpdate();
			stmt.close();
			con.close();
		} catch (SQLException e) {
		
		}
		
	}

}
