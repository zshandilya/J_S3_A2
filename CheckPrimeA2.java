
public class CheckPrimeA2 {

	private int test;
	
	CheckPrimeA2(int a) {
		test=a;
	}
	
	public boolean IsPrime() {
		boolean flag=true;
		
		for(int i=2;i<test;i++) {
			if(test%i==0) {
				flag=false;
				break;
			}
		}
		return flag;
	}
}
