package org.tnsindiajunit5demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class Firstjunit5test {

	@Test
	void test() {
		
		System.out.println("hello everyone");
	}
	@Test
	@Disabled
	void display() {
		
		fail("hi");
		
	}
	
}
