
public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=1; i<=100;i++){
			//System.out.println(i);	
			//System.out.printf("%s %s\n", i, i%3);
			if(i%3==0){
				System.out.print("Fizz\n");
			}else{

				if(i%5==0){
					System.out.print("Buzz\n");

				}else{

					System.out.println(i);	
				}
				if(i%3==0 && i%5==0){
				}
				System.out.print("FizzBuzz\n");
				
			}
		}
	}

}
