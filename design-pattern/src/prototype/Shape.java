package prototype;

public abstract class Shape implements Cloneable{
	
	abstract void draw();

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object clone = null;
		clone = super.clone();
		return clone;
	}
	
	

}
