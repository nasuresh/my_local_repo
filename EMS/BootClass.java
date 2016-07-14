package com.flp.ems.view;
import java.util.Scanner;
public class BootClass {

	public static void main(String[] args) {
		System.out.println("1.add employee details");
		System.out.println("2.modify employee details");
		System.out.println("3.remove employee details");
		System.out.println("4.search employee details");
		System.out.println("5. getallemployee details");
		Scanner in =new Scanner(System.in);
		int a=in.nextInt();	
		UserInteraction i=new UserInteraction();
menuselection(a,i);
}
public static void menuSelection(int a,UserInteraction i)
{
	do{

	switch(a)
	{
	case 1: 
		i.AddEmployee();
		break;
	case 2:
		i.ModifyEmployee();
		break;
	case 3:
		i.RemoveEmployee();
		break;
	case 4:
		i.searchemployee();
		break;
	case 5:
		i.getAllEmployee();
		break;
		default:
			break;		
		
	}
	}while(a!=6)
}