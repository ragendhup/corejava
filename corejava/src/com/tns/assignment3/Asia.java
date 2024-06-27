package com.tns.assignment3;

public class Asia {
    private int landmass;
    private int population;
    private int totalcountries;
    
	public Asia(int landmass, int population, int totalcountries) {
		super();
		this.landmass = landmass;
		this.population = population;
		this.totalcountries = totalcountries;
	}
	public int getLandmass() {
		return landmass;
	}
	public void setLandmass(int landmass) {
		this.landmass = landmass;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public int getTotalcountries() {
		return totalcountries;
	}
	public void setTotalcountries(int totalcountries) {
		this.totalcountries = totalcountries;
	}
	@Override
	public String toString() {
		return "Asia [landmass=" + landmass + ", population=" + population + ", totalcountries=" + totalcountries + "]";
	}
    
}
