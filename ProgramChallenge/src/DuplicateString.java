import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicateString {
	
	public static void main(String[] args) {
		// String that input  to find duplicate Character
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter word");
		str=sc.next();
		DisplayDuplicates(str);
		
		
	}
	public static void DisplayDuplicates(String str) {
		//create a Map
		Map<Character,Integer> map=new HashMap<>();
		//convert String into Character Array  
		char[] Character=str.toCharArray();
		//foreach loop through each Character in the Array 
		for (char c : Character) {
			//take each Character into HashMap ,if not present into HashMap key Character and value 1 
			if(!map.containsKey(c)) {
				map.put(c, 1);
			}else {
				//if it is present in the HashMap add the key as character and increment the count
				map.put(c, map.get(c)+1);
			}
			Set<Map.Entry<Character,Integer>> entrySet=map.entrySet();
			for(Map.Entry<Character,Integer> entry :entrySet) {
				//to get the value Character count and print  
				if(entry.getValue()>1) {//%s string %d digit %n new line 
					System.out.printf("%s : %d %n",entry.getKey(),entry.getValue());
				}
			}
			
		}
	}

}
