package com.skul.backend.enumz;

public enum StsFlow implements IType {
	
	DRAFT("DRAFT"), TERKIRIM_KE_BENDAHARA("BENDAHARA"), TERKIRIM_KE_KASATKER("KASATKER"),
//	 TERKIRIM_KE_SPM("PETUGAS SPM"),
	 PROSES_SISTEM_KPPN("PROSES KPPN"),DOKUMEN_TERTOLAK_KPPN("REVISI KPPN")
	 ,DOKUMEN_TERVERIFIKASI_KPPN("TERVERIFIKASI KPPN"),HISTORY("HISTORY") ;
	
	
	private String name;

	private StsFlow(String name) {
		this.name = name;
	}
	
	public String getString() {
		// TODO Auto-generated method stub
		return name;
	}

	public String[] getItems() {
		// TODO Auto-generated method stub
		return new String[] {  DRAFT.getString() , TERKIRIM_KE_BENDAHARA.getString(), 
				TERKIRIM_KE_KASATKER.getString() ,
//				TERKIRIM_KE_SPM.getString(),
				PROSES_SISTEM_KPPN.getString() , DOKUMEN_TERTOLAK_KPPN.getString()
				 , DOKUMEN_TERVERIFIKASI_KPPN.getString(), HISTORY.getString()};
	}
	
}
