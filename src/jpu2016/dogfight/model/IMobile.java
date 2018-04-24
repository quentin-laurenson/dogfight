package jpu2016.dogfight.model;

import java.awt.Image;
import java.awt.Point;

public interface IMobile {

	Direction getDirection();

	void setDirection(Direction direction);

	Point getPosition();

	Dimension getDimension();

	int getSpeed();

	int getWidth();

	int getHeight();

	void move();

	void placeInArea(IArea area);

	boolean isPlayer(int player);

	void setDogfightModel(IDogfightModel dogfightModel);

	boolean hit();

	Image getImage();
	
	boolean isWeapon();

}