package org.hqy.service.impl;

import org.ci.service.Axe;
import org.ci.service.Person;

public class Chinese implements Person{
	private Axe myaxe;
	

	public void setMyaxe(Axe myaxe) {
		this.myaxe = myaxe;
	}


	@Override
	public void useAxe() {
		System.out.println("Öµ×¢Èë:"+myaxe.chop());
		//System.out.println("111");
	}
	
}
