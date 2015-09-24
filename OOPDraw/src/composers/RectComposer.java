package composers;
import java.awt.Point;

import shapes.AbstractShape;
import shapes.MyRect;

public class RectComposer implements ShapeComposer {

	private MyRect rect;
	
	@Override
	public AbstractShape create(int x, int y) {
		rect = new MyRect(new Point(x,y)); // Create the shape - Rectangle
		return rect;
	}

	@Override
	public void expand(int x, int y) {
		rect.setEnd(new Point(x,y));
	}

	@Override
	public void complete(int x, int y) {
		expand(x, y);		
	}
}