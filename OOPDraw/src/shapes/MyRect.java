package shapes;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Rectangle2D;

// Class MyRect for drawing Rectangle is derived
// from our 'base class' AbstractShape

public class MyRect implements AbstractShape {

	Rectangle2D.Double rect;
	Point startpos;
	
	// Constructor
	public MyRect(Point startpos)
	{
		rect = new Rectangle2D.Double();
		this.startpos = startpos;
	}
	
	
	@Override
	// Sets start position
	public void setStart(Point pt) {
		rect.x = pt.x;
		rect.y = pt.y;
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
		rect.width = nwidth1;
		rect.height = nheight1;
	}

	@Override
	// Draw shape with default color
	public void Draw(Graphics2D g) {
		g.setColor(Color.blue.brighter()); // Set default color
		g.draw(rect);
	}
}