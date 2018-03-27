package matala1;

import Turtle.SimpleTurtle;

public class SmartTurtle extends SimpleTurtle{
	
	
	public SmartTurtle() {
		super();
	}

	public void drawSquare(double size) {
		for (int i = 0; i < 4; i++) {
		moveForward(size);
		turnLeft(90);
		}
	}
		
		public void drawPolygon (int sides, double size)
		{
				double angle = 360.0 / sides; 
						for (int i=0;i<sides;i++)
						{
				    this.moveForward(size);
				    this.turnRight((int)angle);
						}
				    
	}
}

		
