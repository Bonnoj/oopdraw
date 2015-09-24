import java.awt.Point;

public class FunnyShapeComposer implements ShapeComposer{

	private ComposedShape composite;
	private Point startpos; // Declare the start position
	
	public FunnyShapeComposer(){}
	
	@Override
	public AbstractShape create(int x, int y) {
		composite = new ComposedShape(); // Create the shape - Composite
		
		startpos = new Point(x,y);
		composite.add(new MyOval(startpos));
		composite.add(new MyRect(startpos));
		composite.add(new MyLine());
		composite.setStart(startpos);// Set the start position where mouse went down
		return composite;
	}

	@Override
	public void expand(int x, int y) {
		composite.setEnd(new Point(x,y));
	}

	@Override
	public void complete(int x, int y) {
		expand(x, y);
	} 
}
