package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {
	public static void main(String args[]){  
		  HashSet<String> set=new HashSet<String>();  
		           set.add("Ravi");  
		           set.add("Vijay");  
		           set.add("Arun");  
		           set.add("Sumit"); 
		           set.add("Arun");
//		           set.add(null);
//		           set.add(null);
		           System.out.println("An initial list of elements: "+set);  
		           //Removing specific element from HashSet  
		           set.remove("Ravi");  
		           System.out.println("After invoking remove(object) method: "+set);  
		           HashSet<String> set1=new HashSet<String>();  
		           set1.add("Ajay");  
		           set1.add("Gaurav");  
		           set.addAll(set1);  
		           System.out.println("Updated List: "+set);  
		           //Removing all the new elements from HashSet  
		           set.removeAll(set1);  
		           System.out.println("After invoking removeAll() method: "+set);  
		           //Removing elements on the basis of specified condition  
		           set.removeIf(str->str.contains("Vijay"));    
		           System.out.println("After invoking removeIf() method: "+set);  
		           //Removing all the elements available in the set  
		           set.clear();  
		           System.out.println("After invoking clear() method: "+set);  
		           
		           Set<Book> hs=new HashSet<Book>();  
		           //Creating Books  
		           Book b1=new Book(121,"Let us C","Yashwant Kanetkar","BPB",8);  
		           Book b2=new Book(101,"Operating System","Galvin","Wiley",6);  
		           Book b3=new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
		           //Adding Books to TreeSet  
		           hs.add(b1);  
		           hs.add(b2);  
		           hs.add(b3);  
		           //Traversing TreeSet  
		           for(Book b:hs){ 
		        	   System.out.println("books data");
		           System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
		           }  
		 } 
	
}
class Book2 implements Comparable<Book2>{  
	int id;  
	String name,author,publisher;  
	int quantity;  
	public Book2(int id, String name, String author, String publisher, int quantity) {  
	    this.id = id;  
	    this.name = name;  
	    this.author = author;  
	    this.publisher = publisher;  
	    this.quantity = quantity;  
	}  
	public int compareTo(Book2 b) {  
	    if(id>b.id){  
	        return 1;  
	    }else if(id<b.id){  
	        return -1;  
	    }else{  
	    return 0;  
	    }  
	}  
	}  