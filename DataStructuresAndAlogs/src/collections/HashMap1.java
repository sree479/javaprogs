package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

class HashMap1 {
	public static void main(String args[]) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		System.out.println("Initial list of elements: " + hm);
		hm.put(100, "Amit");
		hm.put(101, "Vijay");
		hm.put(102, "Rahul");
		System.out.println("After invoking put() method ");

		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m);
			System.out.println(m.getKey() + " " + hm.get(m.getKey()));
		}

		hm.putIfAbsent(103, "Gaurav");
		System.out.println("After invoking putIfAbsent() method ");
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(104, "Ravi");
		map.putAll(hm);
		System.out.println("After invoking putAll() method ");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		Map<String, Integer> items = new HashMap<>();
		items.put("key 1", 1);
		items.put("key 2", 2);
		items.put("key 3", 3);
		Iterator entries = items.entrySet().iterator();
		while (entries.hasNext()) {
			Map.Entry<String, Integer> entry = (Entry<String, Integer>) entries.next();
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
		items.forEach((k, v) -> {
			System.out.println("Item : " + k + " Count : " + v);
		});

		Map mapobj = new HashMap<Emp, Integer>();
		Emp e1 = new Emp(1);
		Emp e2 = new Emp(2);
		mapobj.put(e1, 1);
		mapobj.put(e2, 2);
		System.out.println(mapobj.size() + " " + mapobj);

		TreeMap treeMap = new TreeMap<Emp, Integer>();
		treeMap.put(e1, 1);
		treeMap.put(e2, 2);
		System.out.println(treeMap.size() + " " + treeMap);
		
	}
}

class Emp  implements Comparable<Emp>{
	Integer i;
	String s;

	public Emp(Integer i) {
		super();
		this.i = i;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result=1;
		result =prime * result +((i==null)?0:i.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (i == null) {
			if (other.i != null)
				return false;
		} else if (!i.equals(other.i))
			return false;
		return true;
	}

	@Override
	public int compareTo(Emp arg) {
		if(i>arg.i)
		{
			return 1;
		}
		else if(i<arg.i)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}

	

}