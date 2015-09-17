import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Rectangle2D;

// Class MyRect for drawing Rectangle is derived
// from our 'base class' AbstractShape

class MyRect implements AbstractShape {

	Rectangle2D.Double rect;
	
	// Constructor
	public MyRect()
	{
		rect = new Rectangle2D.Double();
	}
	
	
	@Override
	// Sets start position
	public void setStart(Point pt) {
		rect.x = pt.x;
		rect.y = pt.y;
	}

	@Override
	public void setEnd(Point pt) {
		// unimplemented
	}

	@Override
	// Draw shape with default color
	public void Draw(Graphics2D g) {
		g.setColor(Color.blue.brighter()); // Set default color
		g.draw(rect);
	}

	// Sets the width
	public void setWidth(int w) {
		rect.width = w;
	}

	// Sets the height
	public void setHeight(int h) {
		rect.height = h;
	}
}

// Class cRect ends
