package jpu2016.dogfight.model;

import java.awt.Color;
import java.awt.Image;
import java.awt.Point;

import javax.swing.text.Position;

public class Mobile implements IMobile {

	private int		speed;
	
	public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image ) {		
	}
	
	/* (non-Javadoc)
	 * @see jpu2016.dogfight.model.IMobile#getDirection()
	 */
	@Override
	public Direction getDirection() {
		return this.getDirection();
	}
	
	/* (non-Javadoc)
	 * @see jpu2016.dogfight.model.IMobile#setDirection(jpu2016.dogfight.model.Direction)
	 */
	@Override
	public void setDirection(Direction direction) {
	}
	
	/* (non-Javadoc)
	 * @see jpu2016.dogfight.model.IMobile#getPosition()
	 */
	@Override
	public Point getPosition() {
		return this.getPosition();
	}
	
	/* (non-Javadoc)
	 * @see jpu2016.dogfight.model.IMobile#getDimension()
	 */
	@Override
	public Dimension getDimension() {
		return this.getDimension();
	}
	
	/* (non-Javadoc)
	 * @see jpu2016.dogfight.model.IMobile#getSpeed()
	 */
	@Override
	public int getSpeed() {
		return this.getSpeed();
	}
	
	/* (non-Javadoc)
	 * @see jpu2016.dogfight.model.IMobile#getWidth()
	 */
	@Override
	public int getWidth() {
		return this.getWidth();
	}
	
	/* (non-Javadoc)
	 * @see jpu2016.dogfight.model.IMobile#getHeight()
	 */
	@Override
	public int getHeight() {
		return this.getHeight();
	}
	
	/* (non-Javadoc)
	 * @see jpu2016.dogfight.model.IMobile#move()
	 */
	@Override
	public void move() {
	}
	
	/* (non-Javadoc)
	 * @see jpu2016.dogfight.model.IMobile#placeInArea(jpu2016.dogfight.model.IArea)
	 */
	@Override
	public void placeInArea(IArea area) {
	}
	
	/* (non-Javadoc)
	 * @see jpu2016.dogfight.model.IMobile#isPlayer(int)
	 */
	@Override
	public boolean isPlayer(int player) {
		return true;
	}
	
	private void moveUp() {
	}
	
	private void moveRight() {
	}
	
	private void moveDown() {
	}
	
	private void moveLeft() {
	}
	
	public Color getColor() {
		return this.getColor();
	}
	
	public IDogfightModel getDogfightmodel() {
		return this.getDogfightmodel();
	}
	
	/* (non-Javadoc)
	 * @see jpu2016.dogfight.model.IMobile#setDogfightModel(jpu2016.dogfight.model.IDogfightModel)
	 */
	@Override
	public void setDogfightModel(IDogfightModel dogfightModel) {
	}
	
	/* (non-Javadoc)
	 * @see jpu2016.dogfight.model.IMobile#hit()
	 */
	@Override
	public boolean hit() {
		return true;
	}
	
	public boolean isWeapon() {
		return true;
	}
	
	/* (non-Javadoc)
	 * @see jpu2016.dogfight.model.IMobile#getImage()
	 */
	@Override
	public Image getImage() {
		return this.getImage();
	}
}
