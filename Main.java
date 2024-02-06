package com.assign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.setE_Id(100);
		e.setE_Name("Amol");
		e.setSalary(70000);
		
		Employee e1=new Employee();
		e1.setE_Id(101);
		e1.setE_Name("Ram");
		e1.setSalary(40000);
		
		Employee e2=new Employee();
		e2.setE_Id(102);
		e2.setE_Name("Laxman");
		e2.setSalary(30000);
		
		Employee e3=new Employee();
		e3.setE_Id(103);
		e3.setE_Name("Sanjay");
		e3.setSalary(75000);
		
		List<Employee> l=new ArrayList<Employee>();
		l.add(e);
		l.add(e1);
		l.add(e2);
		l.add(e3);
		
		
		l.stream().filter(I->I.getSalary()>50000).forEach(I->System.out.println(I.getE_Id()+"\n"
																				+I.getE_Name()+"\n"
																				+I.getSalary()+"\n**********************"));
		
		
		
		
	}
}
