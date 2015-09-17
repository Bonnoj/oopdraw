import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Ellipse2D;

/**
 *  Class MyOval for drawing ovals is derived
 *  from our 'base class' AbstractShape
 */
public class MyOval implements AbstractShape {

	Ellipse2D.Double oval;
	
	// Constructor
	public MyOval()
	{
		oval = new Ellipse2D.Double();
	}
	
	@Override
	// Sets start position
	public void setStart(Point pt) {
		oval.x = pt.x;
		oval.y = pt.y;
	}

	@Override
	public void setEnd(Point pt) {
		// unimplemented
	}

	@Override
	// Draw shape with default color
	public void Draw(Graphics2D g) {
		g.setColor(Color.green.darker()); // Set default color -you may ignore colors
		g.draw(oval);
	}

	// Sets the width
	public void setWidth(int w) {
		oval.width = w;
	}

	// Sets the height
	public void setHeight(int h) {
		oval.height = h;
	}
}
