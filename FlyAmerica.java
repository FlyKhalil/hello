package KH;
import robocode.*;
//import java.awt.Color;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * FlyAmerica - a robot by (your name here)
 */
public class FlyAmerica extends Robot
{
	/**
	 * run: FlyAmerica's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		// setColors(Color.red,Color.blue,Color.green); // body,gun,radar

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			getX();
			getY();
			getHeading();
			getVelocity();
			ahead(100);
			turnGunRight(360);
			back(100);
			turnGunRight(360);
			ahead(30);
			turnGunRight(360);
			turnRight(120);
			}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		double distance = e.getDistance();
		if(distance > 800)
		{
			fire(1);
		}
		else if(distance > 200 && distance <= 500)
		{
			fire(2.5);
		}
		else if(distance > 500 && distance <= 800)
		{
			fire(1);
		}
		else if(distance <= 200)
		{
			fire(4);
		}
		}
	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		turnRight(e.getBearing());
		ahead(100);
			
}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		back(20);
	}	

}
