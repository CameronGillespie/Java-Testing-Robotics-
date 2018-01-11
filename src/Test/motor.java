package Test;

public class motor {
	int RF;
	//right side front motor 
	
	int RB;
	//right side back motor
	
	int LF;
	// Left side front motor
	
	int LB;
	//Left side back motor
	
	int ER;
	//Right side encoder
	
	int EL;
	//Left side encoder
	
	int S1;
	//Sensor 1
	
	public void Right(int VR){
		RF = VR;
		RB = VR;
				
		
	}
	
	
	public void Encode(int E2) {
	ER = E2;
	EL = E2;
		
	if(ER<=5&&EL<=5) {
	System.out.println("to little");
		
		}else {
			System.out.println("to much");
			
		}
	}
	
	public void Left(int VL) {
		LF = VL;
		LB = VL;
		
		
	}
}

	