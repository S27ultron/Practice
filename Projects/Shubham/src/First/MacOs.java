package First;

public class MacOs {

	 public static void main(String []args){
		 int ser=16;
		    int[] a={2,5,7,9,12,14,16,17,19,20,24,28};
		    int hi=a.length-1;
		    int li=0;
		    int mi=(li+hi)/2;
		     while(li<=hi)
		     {
		        
		         if(a[mi]==ser)
		         {
		                     System.out.println("Serach"+ser);

		         }
		         else if(a[mi]<ser)
		         {
		             li=mi+1;
		             
		         }
		         else
		         {
		             hi=mi-1;
		         }
		         mi=(li+hi)/2;
		         }
	     } 

}
