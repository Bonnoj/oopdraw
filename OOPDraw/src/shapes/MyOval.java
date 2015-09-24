package shapes;

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
	Point startpos;
	
	// Constructor
	public MyOval(Point startpos)
	{
		oval = new Ellipse2D.Double();
		this.startpos = startpos;
	}
	
	@Override
	// Sets start position
	public void setStart(Point pt) {
		oval.x = pt.x;
		oval.y = pt.y;
	}

	@Override
	public void setEnd(Point pt) {
		int x = pt.x;
		int y = pt.y;
		
		Point drawto = new Point(Math.max(x, startpos.x), Math.max(y, startpos.y));
		Point newstart = new Point(Math.min(x, startpos.x), Math.min(y, startpos.y));
		int nwidth1 = Math.abs((drawto.x - newstart.x));
		int nheight1 = Math.abs((drawto.y - newstart.y));
		setStart(newstart);
		oval.width = nwidth1;
		oval.height = nheight1;
	}

	@Override
	// Draw shape with default color
	public void Draw(Graphics2D g) {
		g.setColor(Color.green.darker()); // Set default color -you may ignore colors
		g.draw(oval);
	}
}
