//package composers;
//import java.awt.Point;
//
//import shapes.AbstractShape;
//import shapes.SmileyShape;
//
//public class SmileyComposer implements ShapeComposer{
//
//	private SmileyShape composite;
//	private Point startpos; // Declare the start position
//	
//	public SmileyComposer(){}
//	
//	@Override
//	public AbstractShape create(int x, int y) {
//		startpos = new Point(x,y);
//		composite = new SmileyShape(startpos); // Create the shape - Composite
//
//		composite.setStart(startpos);// Set the start position where mouse went down
//		return composite;
//	}
//
//	@Override
//	public void expand(int x, int y) {
//		composite.setEnd(new Point(x,y));
//	}
//
//	@Override
//	public void complete(int x, int y) {
//		expand(x, y);
//	} 
//}
