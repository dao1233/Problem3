import java.io.Serializable;
public abstract class Vehicle implements Serializable{
//	private Manufacture manufacture;
//	private Engine engine;
	public abstract void ShowCharacteristics();

    // Constructor
//    public Vehicle(Manufacture manufacture, Engine engine) {
//        this.manufacture = manufacture;    
//        this.engine = engine;
//        
//    }    
	
}

// subclass of vehicle
class ICEV extends Vehicle{
	private Manufacture manufacture;
	private Engine engine; 
	public ICEV(Manufacture manufacture, Engine engine) {
		//super(manufacture, engine);
		this.manufacture = manufacture;
		this.engine = engine;
    }
	public void ShowCharacteristics() {
		System.out.println("Vehicle ICEV:");
    	System.out.println("Manufacturer " + manufacture.getManufature() + " has Engine type of " + engine.getEngine());
    }
}

class BEV extends Vehicle{
//	public BEV(Manufacture manufacture, Engine engine) {
//        super(manufacture, engine);
//    }
	private Manufacture manufacture;
	private Engine engine; 
	public BEV(Manufacture manufacture, Engine engine) {
		//super(manufacture, engine);
		this.manufacture = manufacture;
		this.engine = engine;
    }
	public void ShowCharacteristics() {
		System.out.println("Vehicle BEV:");
    	System.out.println("Manufacturer " + this.manufacture.getManufature() + " has Engine type of " + this.engine.getEngine());
    }
}

class HybridV extends Vehicle{
//	public HybridV(Manufacture manufacture, Engine engine) {
//        super(manufacture, engine);
//    }
	private Manufacture manufacture;
	private Engine engine; 
	public HybridV(Manufacture manufacture, Engine engine) {
		//super(manufacture, engine);
		this.manufacture = manufacture;
		this.engine = engine;
    }
	public void ShowCharacteristics() {
		System.out.println("Vehicle HybridV:");
    	System.out.println("Manufacturer " + this.manufacture.getManufature() + " has Engine type of " + this.engine.getEngine());
    }
}
