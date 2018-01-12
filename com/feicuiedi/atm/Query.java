package com.feicuiedi.atm;
/**
 * 查询项目
 * @author wangxiaoyi
 *
 */
public class Query implements RunXing{
	
	public  void run(User user) {
		System.out.println("姓名;"+user.getName());
		System.out.println("余额:"+user.getBalance());
		System.out.println("返回上级");
		
		return;
		
		
		
		
	}

	private Object getBalance() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
