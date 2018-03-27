package matala1;

import Turtle.*;
class TestTurtle{
	
	public static void main (String [] args){
		
		/*SimpleTurtle bob = new SimpleTurtle();
		
		bob.tailDown();
		bob.moveForward(100);
		bob.turnRight(90);
		bob.moveForward(100);
		*/
		
		
		SmartTurtle bob=new SmartTurtle();
		bob.tailDown();
		bob.drawSquare(60);
		bob.drawPolygon(10,60);
		
		
		
		/*
		DrunkTurtle div=new DrunkTurtle();
		div.moveForward(50);
		*/
		
		
		/*
	JumpyTurtle jt=new JumpyTurtle();
	jt.moveForward(80);	
	*/
		
		
		
		
		
	}
}