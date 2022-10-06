package hands_on;
interface MathOperation{
	int operation(int a ,int b);
	
}

public class LambdaPractice {
	private int operate(int a,int b,MathOperation mathOperation) {
		return mathOperation.operation(a,b);
	}
	public static void main(String[] args)
	{
		LambdaPractice tester =new LambdaPractice();
		MathOperation addition=(int a,int b) -> a+b;
		MathOperation subtraction=(a,b) -> a-b;
		MathOperation multiplication=(a,b) -> {return a*b;};
		MathOperation division = (int a ,int b) -> a/b;
		
		System.out.println(tester.operate(4, 1, division));
		System.out.println(tester.operate(1, 2, addition));
		System.out.println(tester.operate(2, 2, subtraction));
		System.out.println(tester.operate(1, 2, multiplication));
		
	}

}
