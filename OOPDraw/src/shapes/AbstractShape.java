package shapes;
import java.awt.Graphics2D;
import java.awt.Point;

/**
 * base class AbstractShape
 */
public interface AbstractShape
{
	public abstract void setStart(Point pt);
	public abstract void setEnd(Point pt);
	public abstract void Draw(Graphics2D g);
}
