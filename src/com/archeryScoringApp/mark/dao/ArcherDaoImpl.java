package com.archeryScoringApp.mark.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.archeryScoringApp.mark.domain.Archer;



@Repository("archerDao")
public class ArcherDaoImpl implements ArcherDao {

	
	private SessionFactory sessionFactory;
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional(readOnly = false)
	@Override
	public void addArcher(Archer archer) {
		sessionFactory.getCurrentSession().saveOrUpdate(archer);
	}
	@Transactional(readOnly = false)
	@Override
	public List<Archer> getAllArchers() {
		Session session = sessionFactory.getCurrentSession();
		return (List<Archer>) session.createQuery("from Archer").list();
	}
	
	@Transactional(readOnly = false)
	@Override
	public boolean getParticularArcher(String firstName, String lastName) {
		Connection con = null;
		try {
			con = ConnectionManager.getInstance().getConnection();
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Boolean ifExist = null;
		int archerId = 0;
		
		    try {
				stmt = con.prepareStatement("SELECT * FROM  archeryscorring.archer WHERE archer.fname=? AND archer.lname=? ");
				stmt.setString(1, firstName);
				stmt.setString(2, lastName);
				rs = stmt.executeQuery();
			
					while(rs.next()){
						archerId = rs.getInt("archerId");
						System.out.println("Archer Id in RS "+archerId);
						System.out.println("RS "+rs);
					}
				
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		    	try {
					stmt.close();
					rs.close();
					con.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
	 
		    	 System.out.println("DAO archerId = "+archerId);  	
	    if(archerId != 0){
	    	ifExist = true;
	    }else{
	    	ifExist = false;
	    }
	    System.out.println("DAO if exist"+ifExist);  	
		return ifExist;
	}
	
	@Transactional(readOnly = false)
	@Override
	public Archer getArcher(String firstName, String lastName) {
		Session session = sessionFactory.getCurrentSession();
		Archer archer = (Archer) session.createQuery("FROM Archer archer WHERE archer.lname =:lastName")
		.setParameter("lastName", lastName).list().get(0);
		System.out.println("dao"+archer.getLname());
		return archer;
	}

	@Override
	public Boolean checkIfTablesHasRows() {
	
		PreparedStatement st = null;
		ResultSet res = null;
		int count = 0;
		Boolean hasRows = null;
		
		Connection con = null;
		try {
			con = ConnectionManager.getInstance().getConnection();
		} catch (DataAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		 try {
			  st = con.prepareStatement("SELECT COUNT(*) FROM  archeryscorring.archer");
			  res = st.executeQuery();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		
		 try {
			while (res.next()){
			     count = res.getInt(1);
			 }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 
		 if(count == 0){
			 hasRows = false;
		 }else{
			 hasRows = true;
		 }
		return hasRows;
	}

}
