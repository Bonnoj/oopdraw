
public class ComposerFactory {

	// Create an object of ComposerFactory
	private static ComposerFactory instance = new ComposerFactory();
	
	// Make the constructor private so that this class cannot be instantiated
	private ComposerFactory(){}

	// Get the only object available
	public static ComposerFactory getInstance(){
		return instance;
	}
	
	// Returns new LineComposer
	public ShapeComposer createLineComposer()
	{
		return new LineComposer();
	}
	
	// Returns new OvalComposer
	public ShapeComposer createOvalComposer()
	{
		return new OvalComposer();
	}
	
	// Returns new RectComposer
	public ShapeComposer createRectComposer()
	{
		return new RectComposer();
	}
	
	// Returns new CompositeComposer
	public ShapeComposer createFunnyShapeComposer()
	{
		return new FunnyShapeComposer();
	}
}
