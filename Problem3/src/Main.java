
public class Main {
	
	public static void main(String[] args) {
		//============Manufacture=====================
		Manufacture Toyota = new Manufacture("Toyota");
		Manufacture Honda = new Manufacture("Honda");
		Manufacture Ford = new Manufacture("Ford");
		
		//============Engine==========================
		Engine CombustionEngine = new CombustionEngine();
		Engine ElectricEngine = new ElectricEngine();
		Engine HybridEngine = new HybridEngine();
	
		
    	int ObjectNum = 3;
    	Vehicle CarList[] = new Vehicle[ObjectNum];
    	CarList[0] = new ICEV(Toyota, CombustionEngine);
    	CarList[1] = new BEV(Honda, ElectricEngine);
    	CarList[2] = new HybridV(Ford, HybridEngine);
    	//======================================================================
    	
    	CarList[0].ShowCharacteristics();
    	CarList[1].ShowCharacteristics();
    	CarList[2].ShowCharacteristics();
    	
	}
}
