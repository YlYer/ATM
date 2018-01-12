package com.feicuiedi.atm;

public class User {
	//账号
	private String number;
	//姓名
	private String name;
	//密码
	private String password;
	//个人余额
	private double balance;
	public User() {
		
	}
	
	public User(String number,String name,String password,double balance) {
		this.number=number;
		this.name=name;
		this.password=password;
		this.balance=balance;
		
	}

	

	public String getNumber(){
		return number;
	}
	public void setNumber(String number){
		this.number= number;

	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;

	}
	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password=password;
	}
	public double getBalance(){
		return balance;
	}
	public void setBalance(double balance){
		this.balance=balance;
	}
	protected void add_Balance(double mon) {
		balance+=mon;
	}
	protected void sub_Balance(double mon) {
		balance-=mon;
	}


	
	

}
