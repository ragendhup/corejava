package com.tns.assignment3;

public class India extends Asia{
	private int totalmass;
	public India(int landmass, int population, int totalcountries, int totalmass, int states) {
		super(landmass, population, totalcountries);
		this.totalmass = totalmass;
		this.states = states;
	}
	private int states;
	public int getTotalmass() {
		return totalmass;
	}
	public void setTotalmass(int totalmass) {
		this.totalmass = totalmass;
	}
	public int getStates() {
		return states;
	}
	public void setStates(int states) {
		this.states = states;
	}
	@Override
	public String toString() {
		return "India [totalmass=" + totalmass + ", states=" + states + ", getTotalmass()=" + getTotalmass()
				+ ", getStates()=" + getStates() + ", getLandmass()=" + getLandmass() + ", getPopulation()="
				+ getPopulation() + ", getTotalcountries()=" + getTotalcountries() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
		// TODO Auto-generated constructor stub
	}

	



