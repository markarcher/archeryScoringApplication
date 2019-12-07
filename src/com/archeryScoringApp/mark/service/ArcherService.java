package com.archeryScoringApp.mark.service;

import java.util.List;

import com.archeryScoringApp.mark.domain.Archer;

public interface ArcherService {

	void addArcher(Archer archer);

	List<Archer> getAllArchers();

	Archer getArcher(String firstName, String lastName);

	Boolean ifArcherAlreadyExist(String firstName, String lastName, String club, String email);

	Boolean checkIfTableHasRows();

}
