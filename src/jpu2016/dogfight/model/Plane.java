package jpu2016.dogfight.model;

import javax.swing.text.Position;

public class Plane {

	private static int SPEED = 2;
	private static int WIDTH = 100;
	private static int HEIGHT = 30;
	private int player;
	
	public Plane(int player, Direction direction, Position position, String image) {
	}
	
	public boolean isPlayer(int player) {
		return true;
	}
	
	public boolean hit() {
		return true;
	}
}
