package Arrays;

public class Main {
	static int[] intArray;
	static int[] intArray2;
    public static void main(String[] args) {
    	intArray= new int[10];
    	intArray2=new int[10];
	    intArray[0] = 20;
	    intArray[1] = 35;
	    intArray[2] = -15;
	    intArray[3] = 7;
	    intArray[4] =55;
	    intArray[5] = 1;
	    intArray[6] = -22;
	    intArray2[0] = 20;
	    intArray2[1] = 35;
	    intArray2[2] = -15;
	    intArray2[3] = 7;
	    intArray2[4] =55;
	    intArray2[5] = 1;
	    intArray2[6] = -22;
	    
	    int index = -1;
	    for (int i = 0; i < intArray.length; i++) {
	        if (intArray[i] == 10) {
	            index = i;
	            break;
            }
        }
	    
	    System.out.println(intArray2.hashCode());
	    System.out.println(intArray.hashCode());
	    
	    for(int i:intArray)
	    {
	    	
	    	
	    }

        System.out.println("index = " + index);
        
        for (int i = 0; i < intArray.length; i++) {
	        System.out.println(intArray[i]);
        }


    }
}
