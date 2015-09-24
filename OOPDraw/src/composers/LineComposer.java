package composers;
import java.awt.Point;

import shapes.AbstractShape;
import shapes.MyLine;

public class LineComposer implements ShapeComposer {

	private MyLine line;
	private Point startpos, endpos; // Declare the start and end positions
	
	public LineComposer(){}
	
	@Override
	public AbstractShape create(int x, int y) {
		line = new MyLine(); // Create the shape - Line
		startpos = new Point(x, y);
		line.setStart(startpos);// Set the start position where mouse went down
		return line;
	}

	@Override
	public void expand(int x, int y) {
		endpos = new Point(x, y);
		line.setEnd(endpos);
	}

	@Override
	public void complete(int x, int y) {
		expand(x, y);
	}
}
