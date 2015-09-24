package composers;
import shapes.AbstractShape;

public interface ShapeComposer {
	
	public AbstractShape create (int x, int y);
	public void expand (int x, int y);
	public void complete (int x, int y);
	
}
