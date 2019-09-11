package com.example.receive.model;

import java.util.ArrayList;

public class DeviceModel {
	private long errcode;
	private String errmsg;
	private String devName;
	private String devID;
	private String devStatus;
	private String devType;
	private String lastInst;
	private String socketOut_W;
	private String socketOutY_W;
	private String socketOut_P;
	private String thisMonth;
	private String lastMonth;
	private String socketOut_upTime;
	private ArrayList<uniteddevicemodel> unitedevice;
	private CDATA CDATA;
	private Position position;
	private InstStruct instStruct;
	private SubRlystatus subRlystatus;
	private String token;
	public DeviceModel(){}
	
	
	
	public long getErrcode(){
		return this.errcode;
	}
	public String getErrmsg(){
		return this.errmsg;
	}
	public void setErrcode(Integer errcode){
		this.errcode=errcode;
	}
	public void setErrmsg(String errmsg){
		this.errmsg=errmsg;
	}
	
	public String getDevName(){
		return this.devName;
	}
	public String getDevID(){
		return this.devID;
	}
	public String getDevStatus(){
		return this.devStatus;
	}
	public String getDevType(){
		return this.devType;
	}
	public String getLastInst(){
		return this.lastInst;
	}
	public String getSocketOut_W(){
		return this.socketOut_W;
	}
	public String getSocketOutY_W(){
		return this.socketOutY_W;
	}
	public ArrayList<uniteddevicemodel> getUnitedevice(){
		return this.unitedevice;
	}
	
	public void setDevName(String name){
		this.devName = name;
	}
	public void setDevID(String id){
		this.devID = id;
	}
	public void setDevStatus(String status){
		this.devStatus = status;
	}
	public void setDevType(String type){
		this.devType = type;
	}
	public void getLastInst(String inst){
		this.lastInst = inst;
	}
	public void setSocketOut_W(String token){
		this.socketOut_W = token;
	}
	public void getSocketOutY_W(String seed){
		this.socketOutY_W = seed;
	}
	public void getUnitedevice(ArrayList<uniteddevicemodel> uniteddevice){
		this.unitedevice = uniteddevice;
	}
	
	
	

	public String getSocketOut_P(){
		return this.socketOut_P;
	}
	public String getThisMonth(){
		return this.thisMonth;
	}
	public String getLastMonth(){
		return this.lastMonth;
	}
	public String getSocketOut_upTime(){
		return this.socketOut_upTime;
	}
	
	
	public void setSocketOut_P(String type){
		this.socketOut_P = type;
	}
	public void getThisMonth(String inst){
		this.thisMonth = inst;
	}
	public void setLastMonth(String token){
		this.lastMonth = token;
	}
	public void getSocketOut_upTime(String seed){
		this.socketOut_upTime = seed;
	}
	
	public InstStruct getInstStruct(){
		return this.instStruct;
	}
	public void setInstStruct(InstStruct in){
		this.instStruct=in;
	}
	
	public CDATA getCDATA(){
		return this.CDATA;
	}
	public void setCDATA(CDATA CDATA){
		this.CDATA=CDATA;
	}
	
	public Position getPosition(){
		return this.position;
	}
	public void setPosition(Position po){
		this.position = po;
	}
	
	
	public SubRlystatus getSubRlystatus(){
		return this.subRlystatus;
	}
	public void setSubRlystatus(SubRlystatus sub){
		this.subRlystatus = sub;
	}
	
	
	public String getToken(){
		return this.token;
	}
	public void setToken(String token){
		this.token = token;
	}
}
