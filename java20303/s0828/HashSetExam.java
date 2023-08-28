package s0828;

import java.util.HashSet;

public class HashSetExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hash = new HashSet<>();
		
		hash.add(1);
		hash.add(2);
		hash.add(3);
		hash.add(4);
		System.out.println(hash.toString());
		
		System.out.println(hash.size());
		
		if(hash.contains(5)) {
			System.out.println("5있음");
		}
		hash.remove(4);
		System.out.println(hash.toString());
		
		hash.add(1);
		System.out.println(hash.toString());
		
		hash.clear();
		System.out.println(hash.toString());
	}

}
