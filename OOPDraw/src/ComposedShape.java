import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;


/**
 *  Class MyComposite for drawing a mixture of objects is
 *  derived from our 'base' class AbstractShape
 */
public class ComposedShape implements AbstractShape {

	//ArrayList for storing the shapes
	private ArrayList<AbstractShape> shapeList = new ArrayList<AbstractShape>();
	
	// Constructor
	public ComposedShape()
	{
		
	}
	
	public void add(AbstractShape shape)
	{
		shapeList.add(shape);
	}
	
	@Override
	public void setStart(Point pt) {
		for (AbstractShape shape : shapeList)
		{
			shape.setStart(pt);
		}
	}

	@Override
	public void setEnd(Point pt) {
		for (AbstractShape shape : shapeList)
		{
			shape.setEnd(pt);
		}
	}

	@Override
	public void Draw(Graphics2D g) {
		for (AbstractShape shape : shapeList)
		{
			shape.Draw(g);
		}
	}
}
