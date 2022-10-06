package org.tnsindia.Abstract;


public class Executer {

	public static void main(String[] args) {
		Employee p=new Employee("GITA","Female",1);
		Employee p1=new Employee("RITA","Female",2);
		System.out.println(p.toString());
        p.work();
        p1.work();
        p.changeName("SITA");
        System.out.println(p.toString());
	}

}