package com.archeryScoringApp.mark.domain;

import java.util.List;
import com.archeryScoringApp.mark.domain.Archer;;

public class DataTableObject {
	int  iTotalRecords;
	  
	 int  iTotalDisplayRecords;
	  
	 String  sEcho;
	  
	 String sColumns;

	 List<Archer> aaData;
	 
	public DataTableObject() {
		// TODO Auto-generated constructor stub
	}

	 
	 public int getiTotalRecords() {
	  return iTotalRecords;
	 }
	 
	 public void setiTotalRecords(int iTotalRecords) {
	  this.iTotalRecords = iTotalRecords;
	 }
	 
	 public int getiTotalDisplayRecords() {
	  return iTotalDisplayRecords;
	 }
	 
	 public void setiTotalDisplayRecords(int iTotalDisplayRecords) {
	  this.iTotalDisplayRecords = iTotalDisplayRecords;
	 }
	 
	 public String getsEcho() {
	  return sEcho;
	 }
	 
	 public void setsEcho(String sEcho) {
	  this.sEcho = sEcho;
	 }
	 
	 public String getsColumns() {
	  return sColumns;
	 }
	 
	 public void setsColumns(String sColumns) {
	  this.sColumns = sColumns;
	 }
	 
	 public List<Archer> getAaData() {
	  return aaData;
	 }
	 
	 public void setAaData(List<Archer> aaData) {
	  this.aaData = aaData;
	 }
	  
}
