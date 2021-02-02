package com.skul.backend.enumz;

public enum StsTopup implements IType {
	
	SUKSES("SUKSES"), GAGAL("GAGAL"),PENDING("PENDING");
	
	
	private String name;

	private StsTopup(String name) {
		this.name = name;
	}
	
	public String getString() {
		// TODO Auto-generated method stub
		return name;
	}

	public String[] getItems() {
		// TODO Auto-generated method stub
		return new String[] {  SUKSES.getString() , GAGAL.getString(), PENDING.getString()};
	}
	
}
