package composers;
import java.util.LinkedHashMap;

public class ComposerFactory {

	// Create an object of ComposerFactory
	private static ComposerFactory instance = new ComposerFactory();

	LinkedHashMap<ComposerType, String> composers = new LinkedHashMap<ComposerType, String>();
	
	// Make the constructor private so that this class cannot be instantiated
	private ComposerFactory(){}

	public enum ComposerType{
		Line,
		Oval,
		Rect,
		Funny,
		Smiley
	}
	
	public LinkedHashMap<ComposerType, String> listComposerNames()
	{
		composers.put(ComposerType.Line, "Line");
		composers.put(ComposerType.Oval, "Oval");
		composers.put(ComposerType.Rect, "Rect");
		composers.put(ComposerType.Funny, "Funny");
		composers.put(ComposerType.Smiley, "Smiley");
		return composers;
	}
	
	// Get the only object available
	public static ComposerFactory getInstance(){
		return instance;
	}
	
	// creates the correct composer based on the given type
	public ShapeComposer createComposer(ComposerType compType)
	{
		ShapeComposer comp = null;
        switch (compType) {
        case Line:
            comp = new LineComposer();
            break;
 
        case Oval:
        	comp = new OvalComposer();
            break;
 
        case Rect:
        	comp = new RectComposer();
            break;
 
        case Funny:
        	comp = new FunnyShapeComposer();
        	break;
        	
        case Smiley:
        	//comp = new SmileyComposer();
        	break;
        	
        default:
            // throw some exception
            break;
        }
        return comp;
	}
}
