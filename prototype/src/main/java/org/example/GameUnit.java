package org.example;


/**
 * This class represents an abstract prototype & defines the clone method
 */
public abstract class GameUnit implements Cloneable {
	// when user clone this object -> reset position to 0
	private Point3D position;
	
	public GameUnit() {
		position = Point3D.ZERO;
	}

	@Override
	public GameUnit  clone() throws CloneNotSupportedException {
		 // need to decide to shallow copy or deep copy of our state
		GameUnit unit=(GameUnit) super.clone();
		System.out.println("unit test "+unit);
		unit.initialize();
		return unit;
	}

	protected void initialize(){
		this.position = Point3D.ZERO;
		reset();
	}

	// for subclass to reset their properties
	protected abstract void reset();

	public GameUnit(float x, float y, float z) {
		position = new Point3D(x, y, z);
	}

	public void move(Point3D direction, float distance) {
		Point3D finalMove = direction.normalize();
		finalMove = finalMove.multiply(distance);
		position = position.add(finalMove);
	}
	
	public Point3D getPosition() {
		return position;
	}
}
