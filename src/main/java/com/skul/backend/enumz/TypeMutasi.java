package com.skul.backend.enumz;

public enum TypeMutasi implements IType {
	
	CREDIT("credit"), DEBIT("debit");
	
	
	private String name;

	private TypeMutasi(String name) {
		this.name = name;
	}
	
	public String getString() {
		// TODO Auto-generated method stub
		return name;
	}

	public String[] getItems() {
		// TODO Auto-generated method stub
		return new String[] {  CREDIT.getString() , DEBIT.getString()};
	}
	
}
