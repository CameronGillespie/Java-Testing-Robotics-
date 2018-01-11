import Test.motor;

public class Robot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
motor M1 = new motor();

M1.Right(1);
M1.Left(1);


for(int i=10;i>0;i--) {
M1.Encode(i);
	
}
	}

}

