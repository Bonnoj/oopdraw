import java.awt.Point;

public class RectComposer implements ShapeComposer {

	private MyRect rect;
	private Point startpos; // Declare the start position
	
	@Override
	public AbstractShape create(int x, int y) {
		rect = new MyRect(); // Create the shape - Oval
		startpos = new Point(x,y);
		rect.setStart(startpos);// Set the start position where mouse went down
		return rect;
	}

	@Override
	public void expand(int x, int y) {
		Point drawto = new Point(Math.max(x, startpos.x), Math.max(y, startpos.y));
		Point newstart = new Point(Math.min(x, startpos.x), Math.min(y, startpos.y));
		int nwidth1 = Math.abs((drawto.x - newstart.x));
		int nheight1 = Math.abs((drawto.y - newstart.y));
		rect.setWidth(nwidth1);
		rect.setHeight(nheight1);
		rect.setStart(newstart);
	}

	@Override
	public void complete(int x, int y) {
		Point drawto = new Point(Math.max(x, startpos.x), Math.max(y, startpos.y));
		Point newstart = new Point(Math.min(x, startpos.x), Math.min(y, startpos.y));
		int nwidth1 = Math.abs((drawto.x - newstart.x));
		int nheight1 = Math.abs((drawto.y - newstart.y));
		rect.setWidth(nwidth1);
		rect.setHeight(nheight1);
		rect.setStart(newstart);
		
	}

}
