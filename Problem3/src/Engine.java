// superclass engine
public class Engine {
	public String getEngine() {
		return("Engine type");
	}
}

//========CombustionEngine Subclass================
class CombustionEngine extends Engine{
	public String getEngine() {
		return("Combustion Engine");
	}
}

//========ElectricEngine Subclass================
class ElectricEngine extends Engine{
	public String getEngine() {
		return("Electric Engine");
	}
}

//========Hybrid Subclass================
class HybridEngine extends Engine{
	public String getEngine() {
		return("Hybrid Engine");
	}
}