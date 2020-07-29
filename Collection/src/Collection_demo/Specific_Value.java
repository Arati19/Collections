package Collection_demo;

public class Specific_Value {
  public static boolean contains(int[] arr, int item){
	for(int n : arr){
	 if(item == n){
		 return true;
	 }
	}
	return false;  
  }
 public static void main(String[] args) {
	int[] myarray = {12,24,47,07,57,25,327,38};
	System.out.println(contains(myarray,57));
	System.out.println(contains(myarray,18));
}	
}


