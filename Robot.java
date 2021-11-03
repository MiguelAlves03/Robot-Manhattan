
public class Robot {

	// Constants
	public static final String NORTH = "N";
	public static final String SOUTH = "S";
	public static final String EAST = "E";
	public static final String WEST = "O";

	
	// Instance variables
	private int currentX, currentY;
	private String currentHeading = "N";
	private int totalDistance;
	private int markedX = 0, markedY = 0;
	private int tempX, tempY;
	private int supp = 0;
	private int distanceMost;
	private int big = 0;

	public Robot(int initX, int initY) {
		this.currentX = initX;
		this.currentY = initY;
		tempX = initX;
		tempY = initY;
	}
	
	public int getXPos() {
		return currentX;
	}

	public int getYPos() {
		return currentY;
	}
	
	public int getTotalDistance() {
		totalDistance = (Math.abs(currentX - tempX)) + (Math.abs(currentY - tempY));
		return totalDistance;
	}
	
	public int getPIDistance() {
		if (supp == 0) {
		return (Math.abs(tempX - currentX)) + (Math.abs(tempY - currentY));
		} else {
		return (Math.abs(markedX - currentX)) + (Math.abs(markedY - currentY));
		}
	}
	
	public void move(int distance) {
		switch (currentHeading) {
		case "N":
			currentY = currentY + distance;
			if (distance > big)
				big = distance;
			break;
		case "S":
			currentY = currentY - distance;
			if (distance > big)
				big = distance;
			break;
		case "E":
			currentX = currentX + distance;
			if (distance > big)
				big = distance;
			break;
		case "O":
			currentX = currentX - distance;
			if (distance > big)
				big = distance;
			break;
		default:
			break;
			
	}
	}
	
	public void setHeading(String heading) {
		switch (heading) {
		case "N":
			currentHeading = "N";
			break;
		case "S":
			currentHeading = "S";
			break;
		case "E":
			currentHeading = "E";
			break;
		case "O":
			currentHeading = "O";
			break;
		default:
			break;
		}
	}
	
	public void mark(int robotNumber) {
		markedX = currentX;
		markedY = currentY;
		supp = 1;
	}
	
	public int getDistanceMost() {
		distanceMost = big;
		return distanceMost;
		 
	}
			
		
		
}
