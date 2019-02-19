package collections;

import java.util.List;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
	
	public static void main(String args[]) throws IOException, ClassNotFoundException{  
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
		list.ensureCapacity(1000);
		System.out.println(list.size());
		      list.add("Ravi");//Adding object in arraylist    
		      list.add("Vijay");    
		      list.add("Ravi");    
		      list.add("Ajay"); 
		      list.add("Ajay");
		      list.add(0,"Sup");
		      //Invoking arraylist object   
		      System.out.println(list);
		      Iterator<String> itr=list.iterator();
		      ListIterator<String> listitr=list.listIterator(0);

		      while(listitr.hasNext())
		      {
		    	  System.out.println(listitr.next());
		    	  
		      }
		      while(itr.hasNext())
		      {
		    	  System.out.println(itr.next());
		    	  
		      }
		      
		      FileOutputStream fos=new FileOutputStream("file");  
              ObjectOutputStream oos=new ObjectOutputStream(fos);  
              oos.writeObject(list);  
              fos.close();  
              oos.close();  
              //Deserialization  
              FileInputStream fis=new FileInputStream("file");  
              ObjectInputStream ois=new ObjectInputStream(fis);  
            ArrayList  output=(ArrayList)ois.readObject();  
            System.out.println(output);
            
            
            
            List numbers =new ArrayList<Integer>();
            
            
            for(int i=0;i<100;i++)
            {
            	numbers.add(i);
            	if(i==14)
            	{
            		numbers.size();
            	}
            	
            }
            
            
		  }  
}
