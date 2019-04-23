/*
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 */
package main;

import avocado.Avocado;

/***
 * Exercise our Avocado classes
 * @author nicomp
 *
 */
public class Main {
	//enum myEnum {A,B,C,D};	// Demo of enumerated date type(ID DECLARED JUST LIKE A CLASS, STARTS WITH WORD ENUM, CAN ONLY BE INSTIDE BRACKETS)

	public static void main(String[] args) {
		//declare and instantiate an avocado object
		Avocado bob = new Avocado("green", Avocado.enumCondition.fresh, 100  );//2 ways to fix underline over new avocado();
		
		
		//myEnum e = myEnum.A; // DEMOSTRATS HOW TO DECLARE e to A
		//System.out.println(e.toString());

	}
}
