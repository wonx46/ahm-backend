package com.skul.backend.enumz;

public enum HeaderBarang implements IType {
	
	KATEGORI("KATEGORI"), LOKASI("LOKASI"), PENANGGUNG_JAWAB("PENANGGUNG_JAWAB"), KONDISI("KONDISI");
	
	
	private String name;

	private HeaderBarang(String name) {
		this.name = name;
	}
	
	public String getString() {
		// TODO Auto-generated method stub
		return name;
	}

	public String[] getItems() {
		// TODO Auto-generated method stub
		return new String[] {  KATEGORI.getString() , LOKASI.getString(),PENANGGUNG_JAWAB.getString() , KONDISI.getString()};
	}
	
}
