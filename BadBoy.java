package apcs;
import robocode.*;
import static robocode.util.Utils.normalRelativeAngleDegrees;
import java.awt.Color;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * BadBoy - a robot by (your name here)
 */
public class BadBoy extends AdvancedRobot
{
	/**
	 * run: BadBoy's default behavior
	 */
	public void run() {
		setAdjustGunForRobotTurn(true);
	
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		setColors(Color.red,Color.blue,Color.green); // body,gun,radar

		// Robot main loop
		while(true) {
			turnGunRight(30);
			// Replace the next 4 lines with any behavior you would like
			int pos = 10000;
			int turn = (int)(Math.random()*360-180)*7;
			setAhead(pos);
			setTurnRight(turn);
			execute();

		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		double getTurnGunAngle = getHeading()-getGunHeading()+e.getBearing();
		turnGunRight(normalRelativeAngleDegrees(getTurnGunAngle));
		//tracing from built in "fire" robot
		if (e.getDistance()<200){
			fire(3.0);
			
		}
		else{
			fire(1.0);
		}
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		turnGunRight(20);
			// Replace the next 4 lines with any behavior you would like
			int pos = 10000;
			int turn = (int)(Math.random()*360-180)*5;
			setAhead(pos);
			setTurnRight(turn);
			execute();
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		turnGunRight(40);
		double turn = 180-e.getBearing();
		setTurnLeft(turn);
		setAhead(30);
		execute();
	}	
}
