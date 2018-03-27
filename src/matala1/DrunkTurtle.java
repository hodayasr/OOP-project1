package matala1;

import java.util.Random;

import Turtle.SimpleTurtle;

public class DrunkTurtle extends SimpleTurtle{

	public DrunkTurtle() {
		super();
	}
	
	@Override
	public void moveForward(double d)
	{
		double newdistance=Math.random()*(d*2);
		super.moveForward(newdistance);
		turnLeft((int) (Math.random()*60-30));
	}
	

}
