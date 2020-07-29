package Collection_demo;

public class Array {

	public static void main(String[] args) {
		int[] myarray = new int []{35,67,100,76,82,10,3};
		
		int max = myarray[0];
	 
		for(int i=1; i< myarray.length; i++)                                              
		{
			if(myarray[i] > max)
				max = myarray[i];
		}
		
		System.out.println("Maximum Number in Array is : " + max);
	}


}

//while(i < myarray.length) {
//    if (myarray[i] > max) {
//        max = myarray[i];
//    }
//    i++;
//}
