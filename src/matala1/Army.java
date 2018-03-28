package matala1;

import java.util.Scanner;

import Turtle.SimpleTurtle;

public class Army {


	public static void main (String [] args){
		Scanner s=new Scanner(System.in);
		int ch; //user's choice
		SimpleTurtle army[]=new SimpleTurtle[5]; // array of turtles
		System.out.println("choose your 5 turtles to Army :");
		System.out.println(" 1.simple \n 2.smart \n 3.drunk \n 4.jumpy");
		for (int i = 0; i < 5; i++) {
			System.out.println("turtle number #"+(i+1)+": ");
			ch=s.nextInt();
			if(ch==1)
				army[i]=new SimpleTurtle();
			if(ch==2)
				army[i]=new SmartTurtle();
			if(ch==3)
				army[i]=new DrunkTurtle();
			if(ch==4)
				army[i]=new JumpyTurtle();
		}
		s.close();
		
		//steps of of all turtles - all together 
		for (int i = 0; i < army.length; i++) {
			army[i].tailDown();
		}
		for (int i = 0; i < army.length; i++) {
			army[i].moveForward(100);
		}
		for (int i = 0; i < army.length; i++) {
			army[i].turnRight(90);
		}
		for (int i = 0; i < army.length; i++) {
			army[i].moveForward(60);
		}
		// if turtle know to draw polygon - this turtle does it
		for (int i = 0; i < army.length; i++) {
			if( army[i] instanceof JumpyTurtle)
				((JumpyTurtle) army[i]).drawPolygon(6,70);
			else if(army[i] instanceof SmartTurtle)
				((SmartTurtle) army[i]).drawPolygon(6,70);
		}
		
		//hide turtles
		for (int i = 0; i < army.length; i++) {
			army[i].hide();
		}
	}


}
