package com.example.receive.model;

import lombok.Getter;
import lombok.Setter;

public class ResResult {
	@Getter @Setter private String CMD;
	@Getter @Setter private Long RTN = 0L;
	@Getter @Setter private String SN;
	@Getter @Setter private String YMDHMS;
	@Getter @Setter private String devID;
	public ResResult(DModel2 model){
		this.CMD=model.getCMD();
		this.SN=model.getSN();
		this.YMDHMS=model.getYMDHMS();
		this.devID=model.getDevID();
	}
}
