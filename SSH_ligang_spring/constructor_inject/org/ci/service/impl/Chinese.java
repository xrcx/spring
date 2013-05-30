package org.ci.service.impl;

import org.hqy.service.Axe;
import org.hqy.service.Person;

public class Chinese implements Person {
	private Axe myaxe;

	public Chinese() {
	}

	public Chinese(Axe myaxe) {
		this.myaxe = myaxe;
	}

	@Override
	public void useAxe() {
		System.out.println("¹¹Ôì×¢Èë£º"+myaxe.chop());
	}

}
