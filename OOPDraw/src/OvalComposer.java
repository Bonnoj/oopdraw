import java.awt.Point;

public class OvalComposer implements ShapeComposer{

	private MyOval oval;
	private Point startpos; // Declare the start position
	
	@Override
	public AbstractShape create(int x, int y) {
		oval = new MyOval(); // Create the shape - Oval
		startpos = new Point(x,y);
		oval.setStart(startpos);// Set the start position where mouse went down
		return oval;
	}

	@Override
	public void expand(int x, int y) {
		Point drawto = new Point(Math.max(x, startpos.x), Math.max(y, startpos.y));
		Point newstart = new Point(Math.min(x, startpos.x), Math.min(y, startpos.y));
		int nwidth1 = Math.abs((drawto.x - newstart.x));
		int nheight1 = Math.abs((drawto.y - newstart.y));
		oval.setWidth(nwidth1);
		oval.setHeight(nheight1);
		oval.setStart(newstart);
	}

	@Override
	public void complete(int x, int y) {
		expand(x, y);
	}
}
