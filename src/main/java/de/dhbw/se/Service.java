package de.dhbw.se;

public class Service {
	
	public Addierer getAddierer(){
		return addierer;
	}
	public void setAddierer(Addierer addierer) {		
		this.addierer = addierer;
	}
	
	Addierer addierer;

	public int addTwoNumbers(int x, int y){
		return addierer.add(x, y);
	}

	
}
