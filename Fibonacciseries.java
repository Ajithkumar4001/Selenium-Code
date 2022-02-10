public class Fibonacciseries {
	public static void main(String[] args) {
		int first=0;
		//System.out.println(first);
		int second=1;
		//System.out.println(second);
		int t;
	    for (int i =0; i <= 10; i++) {
	    	if(i==5) {
	    		break;
	    	}
		t=first+second;
		System.out.println(t);
		first=second;
		second=t;	
	    }
    }
}
