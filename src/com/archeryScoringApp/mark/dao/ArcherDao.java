package com.archeryScoringApp.mark.dao;

import java.util.List;

import com.archeryScoringApp.mark.domain.Archer;

public interface ArcherDao {

	void addArcher(Archer archer);

	List<Archer> getAllArchers();

	boolean getParticularArcher(String firstName, String lastName);

	Archer getArcher(String firstName, String lastName);

	Boolean checkIfTablesHasRows();

}
