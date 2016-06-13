package com.java.clist;

import org.junit.Test;

public class TestClist {
	
	@Test
	public void test(){
		Clist clist = new Clist();
		clist.append(12);
		clist.append(10);
		clist.insert(66);
		clist.insert(33);
		clist.delete();
		clist.printAllListNode();
	}
}
