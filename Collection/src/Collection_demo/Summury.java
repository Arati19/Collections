package Collection_demo;

import java.util.ArrayList;

public class Summury {
   private int i;
   private String s;
   private ArrayList<String> myList = new ArrayList<>();
   private ArrayList<Integer> myInt = new ArrayList<>();
   private int [] myArray = new int[4];
   
   public void setI(int a){
   this.i=a;
}
   public int getI(){
    return i;
   }
   public void setS(String b){
	   this.s=b;
   }
   public String getS(){
	   return s;
   }
   
   public Summury(){
	   i=10;
	   s="Arati";
   }
   public Summury(int d, String a,ArrayList<String> list,ArrayList<Integer> num){
	   myList=list;
	   myInt=num;
	   s=a;
	   i=d;
   }
 }
