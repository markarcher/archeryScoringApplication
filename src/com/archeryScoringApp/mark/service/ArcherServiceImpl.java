package com.archeryScoringApp.mark.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.archeryScoringApp.mark.dao.ArcherDao;
import com.archeryScoringApp.mark.domain.Archer;

@Repository("archerDao")
public class ArcherServiceImpl implements ArcherService {
	
	@Autowired
	private ArcherDao archerDao;
	

	@Override
	public List<Archer> getAllArchers() {
		List<Archer> archers = archerDao.getAllArchers();
		return archers;
	}
	
	@Transactional(readOnly = false)
	@Override
	public Archer getArcher(String firstName, String lastName) {
		Archer archerRecentlyAdded = archerDao.getArcher(firstName, lastName);
		return archerRecentlyAdded;
	}

	@Override
	public Boolean ifArcherAlreadyExist(String firstName, String lastName, String club,String eMail) {
		boolean ifArcherExist = archerDao.getParticularArcher(firstName, lastName);
	
		return ifArcherExist;
	}

	@Override
	public void addArcher(Archer archer) {
		 archerDao.addArcher(archer);
		
	}

	@Override
	public Boolean checkIfTableHasRows() {
		Boolean hasRows = archerDao.checkIfTablesHasRows();
		return hasRows;
	}

	

}
