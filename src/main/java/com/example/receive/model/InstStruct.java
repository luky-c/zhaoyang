package com.example.receive.model;

public class InstStruct {
	private String fanSpeed;
	private String fanDirection;
	private String mode;
	private String temperature;
	private String onOff;
	
	public String getFanSpeed(){
		return this.fanSpeed;
	}
	public String getFanDirection(){
		return this.fanDirection;
	}
	public String getMode(){
		return this.mode;
	}
	public String getTemperature(){
		return this.temperature;
	}
	public String getOnOff(){
		return this.onOff;
	}
	
	public void setFanSpeed(String a){
		this.fanSpeed = a;
	}
	public void setFanDirection(String a){
		this.fanDirection = a;
	}
	public void setMode(String a){
		this.mode = a;
	}
	public void setTemperature(String a){
		this.temperature = a;
	}
	public void setOnOff(String a){
		this.onOff = a;
	}
	
}
