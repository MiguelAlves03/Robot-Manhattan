import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int posX = in.nextInt();
		int posY = in.nextInt();
		Robot robot1 = new Robot(posX, posY);
		in.nextLine();
		
		posX = in.nextInt();
		posY = in.nextInt();
		Robot robot2 = new Robot(posX, posY);
		in.nextLine();
		
		processCommands(in, robot1, robot2);
		processCommands(in, robot1, robot2);
		processCommands(in, robot1, robot2);
		processCommands(in, robot1, robot2);
		processCommands(in, robot1, robot2);
	}
		private static void processCommands (Scanner in, Robot robot1, Robot robot2) {
		switch(in.next()) {
		case "MV":
			processMoveRobot(in, robot1, robot2);
			break;
		case "MD":
			processChangeDirection(in, robot1, robot2);
			break;
		case "PI":
			processPointOfInterest(in, robot1, robot2);
			break;
		case "LP":
			processLastPosition(in, robot1, robot2);
			break;
		case "LDT":
			processDistanceTraveled(in, robot1, robot2);
			break;
		case "LDPI":
			processDistanceInterest(in, robot1, robot2);
			break;
		case "DTMAX":
			processDistanceMax(in, robot1, robot2);
			break;
		case "DR":
			processDistanceRobot(in, robot1, robot2);
			break;
		case "LMV":
			processDistanceMost(in,robot1,robot2);
			break;
		default:
			break;
			
		}
	}
	private static void processMoveRobot(Scanner in,Robot robot1,Robot robot2) {
		int robotNumber = in.nextInt();
		int distance = in.nextInt();
		if (robotNumber == 1) {
			robot1.move(distance);
		} else {
			robot2.move(distance);
		}
		in.nextLine();
		}
	
	private static void processChangeDirection(Scanner in, Robot robot1, Robot robot2) {
		int robotNumber = in.nextInt();
		String direction = in.next();
		if (robotNumber == 1) {
			robot1.setHeading(direction);
		} else {
			robot2.setHeading(direction);
		}
		in.nextLine();
		}
		
	private static void processPointOfInterest(Scanner in, Robot robot1, Robot robot2) {
		int robotNumber = in.nextInt();
		if (robotNumber == 1) {
			robot1.mark(robotNumber);
		} else {
			robot2.mark(robotNumber);
		}
		in.nextLine();
		}
	
	private static void processLastPosition(Scanner in, Robot robot1, Robot robot2) {
		int robotNumber = in.nextInt();
		if (robotNumber == 1) {
			System.out.println(robot1.getXPos() + " " + robot1.getYPos());
		} else {
			System.out.println(robot2.getXPos() + " " + robot2.getYPos());
		}
		in.nextLine();
		}
	
	private static void processDistanceTraveled(Scanner in, Robot robot1, Robot robot2) {
		int robotNumber = in.nextInt();
		if (robotNumber == 1) {
			System.out.println(robot1.getTotalDistance());
		} else {
			System.out.println(robot2.getTotalDistance());
		}
		in.nextLine();
		}
	
	private static void processDistanceInterest(Scanner in, Robot robot1, Robot robot2) {
		int robotNumber = in.nextInt();
		if (robotNumber == 1) {
			System.out.println(robot1.getPIDistance());
		} else {
			System.out.println(robot2.getPIDistance());
		}
		in.nextLine();
		}
	private static void processDistanceMax(Scanner in,Robot robot1,Robot robot2) {
		if (robot1.getTotalDistance() > robot2.getTotalDistance()) {
			System.out.println("ROBOT 1");
		} else if (robot1.getTotalDistance() < robot2.getTotalDistance()) {
			System.out.println("ROBOT 2");
		} else if (robot1.getTotalDistance() == robot2.getTotalDistance()) {
			System.out.println("EMPATE");
		}
		in.nextLine();
		}
	
	private static void processDistanceRobot(Scanner in, Robot robot1, Robot robot2) {
		
		System.out.println(Math.abs(robot1.getXPos() - robot2.getXPos()) + Math.abs(robot1.getYPos() - robot2.getYPos()));
		in.nextLine();
		}
	
	private static void processDistanceMost(Scanner in, Robot robot1, Robot robot2) {
		if (robot1.getDistanceMost() > robot2.getDistanceMost()) {
			System.out.println("ROBOT 1");
		} else if (robot1.getDistanceMost() < robot2.getDistanceMost()) {
			System.out.println("ROBOT 2");
		} else if (robot1.getDistanceMost() == robot2.getDistanceMost()) {
			System.out.println("EMPATE");
		}
		in.nextLine();
		}
			
	}