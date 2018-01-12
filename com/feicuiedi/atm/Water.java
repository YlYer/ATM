package com.feicuiedi.atm;

import java.text.SimpleDateFormat;
import java.util.Date;
//流水项目
public class Water {
	public void date() {
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd-hh:mm:ss");
		String str=sdf.format(date);
		System.out.println(str);
	}
	
	

}
