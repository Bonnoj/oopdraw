package composers;
import java.awt.Point;

import shapes.AbstractShape;
import shapes.MyOval;

public class OvalComposer implements ShapeComposer{

	private MyOval oval;
	
	public OvalComposer(){}
	
	@Override
	public AbstractShape create(int x, int y) {
		oval = new MyOval(new Point(x,y)); // Create the shape - Oval
		return oval;
	}

	@Override
	public void expand(int x, int y) {
		oval.setEnd(new Point(x,y));
	}

	@Override
	public void complete(int x, int y) {
		expand(x, y);
	}
}