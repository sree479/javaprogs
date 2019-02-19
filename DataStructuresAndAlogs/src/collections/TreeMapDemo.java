package collections;

import java.util.Map;
import java.util.TreeMap;

class TreeBook implements Comparable<TreeBook>{    
int id;    
String name,author,publisher;    
int quantity;    
public TreeBook(int id, String name, String author, String publisher, int quantity) {    
    this.id = id;    
    this.name = name;    
    this.author = author;    
    this.publisher = publisher;    
    this.quantity = quantity;    
}
@Override
public int compareTo(TreeBook o) {
	if(this.id>o.id)
	{
		return -1;
	}
	else if(this.id<o.id)
	{
		return 1;
	}
	return 0;
}    
}    
public class TreeMapDemo {
public static void main(String[] args) {    
    //Creating map of Books    
    Map<Integer,TreeBook> map=new TreeMap<Integer,TreeBook>();    
    //Creating Books    
    TreeBook b1=new TreeBook(101,"Let us C","Yashwant Kanetkar","BPB",8);    
    TreeBook b2=new TreeBook(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
    TreeBook b3=new TreeBook(103,"Operating System","Galvin","Wiley",6);   
    TreeBook b4=new TreeBook(103,"Operating System","Galvin","Wiley",6);   
    //Adding Books to map   
    map.put(2,b2);  
    map.put(1,b1);  
    map.put(3,b3); 
    map.put(4,b4); 
   
    //Traversing map  
    for(Map.Entry<Integer, TreeBook> entry:map.entrySet()){    
        int key=entry.getKey();  
        TreeBook b=entry.getValue();  
        System.out.println(key+" Details:");  
        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
    }    
}    
}
