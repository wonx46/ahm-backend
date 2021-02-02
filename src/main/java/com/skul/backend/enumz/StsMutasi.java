package com.skul.backend.enumz;

public enum StsMutasi implements IType {
	
	SUKSES("SUKSES"), GAGAL("GAGAL"),REKON("REKON");
	
	
	private String name;

	private StsMutasi(String name) {
		this.name = name;
	}
	
	public String getString() {
		// TODO Auto-generated method stub
		return name;
	}

	public String[] getItems() {
		// TODO Auto-generated method stub
		return new String[] {  SUKSES.getString() , GAGAL.getString(), REKON.getString()};
	}
	
}
