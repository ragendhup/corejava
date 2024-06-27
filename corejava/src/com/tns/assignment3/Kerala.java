package com.tns.assignment3;

public class Kerala extends India{
     private int mass;
     private int districts;
	public int getMass() {
		return mass;
	}
	public void setMass(int mass) {
		this.mass = mass;
	}
	public int getDistricts() {
		return districts;
	}
	public void setDistricts(int districts) {
		this.districts = districts;
	}
	public Kerala(int landmass, int population, int totalcountries, int totalmass, int states,int mass,int districts) {
		super(landmass, population, totalcountries, totalmass, states);
		this.mass=mass;
		this.districts=districts;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Kerala [mass=" + mass + ", districts=" + districts + ", getMass()=" + getMass() + ", getDistricts()="
				+ getDistricts() + ", getTotalmass()=" + getTotalmass() + ", getStates()=" + getStates()
				+ ", toString()=" + super.toString() + ", getLandmass()=" + getLandmass() + ", getPopulation()="
				+ getPopulation() + ", getTotalcountries()=" + getTotalcountries() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
     
     
}
