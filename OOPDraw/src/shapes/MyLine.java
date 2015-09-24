package shapes;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Line2D;

/**
 *  Class MyLine for drawing lines is
 *  derived from our 'base' class AbstractShape
 */
public class MyLine implements AbstractShape {

	Line2D.Double line2d;
	
	// Constructor
	public MyLine()
	{
		line2d = new Line2D.Double();
	}

	@Override
	// Sets start position
	public void setStart(Point pt) 
	{
		line2d.x1 = pt.x;
		line2d.y1 = pt.y;
	}

	@Override
	// Sets end position
	public void setEnd(Point pt) 
	{
		line2d.x2 = pt.x;
		line2d.y2 = pt.y;
	}

	@Override
	// Draw shape with default color
	public void Draw(Graphics2D g) {
		g.setColor(Color.red); // Set default color -you may ignore colors
		g.draw(line2d);
	}
}