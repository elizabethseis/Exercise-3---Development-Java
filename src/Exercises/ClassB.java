package Exercises;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class ClassB extends DevelopmentJava3 implements Interface {


	//Return type: Void - Body: NA - Parameters NA - Functionality: Print "Hello Interface"
	public void PrintMessage() {
		System.out.println('\n'+"Message from Interface: "+ message);
	}
	
	public void Orders() {
		
		ArrayList <String> list = new ArrayList<String>();

	    for(String s : myString) {
	       if(s != null && s.length() > 0) {
	          list.add(s);
	       }
	    }

	    String[] myString2 = list.toArray(new String[list.size()]);
	    
		Arrays.sort(myString2);
		System.out.println('\n'+"ASC ORDER");
		   for(String s : myString2)
			      System.out.println(s);

		   Arrays.sort(myString2, Collections.reverseOrder());
		   System.out.println('\n'+"DSC ORDER");
		   for(String s : myString2)
			      System.out.println(s);
	} 
	
	public void RemoveNulls() {
		
	    String[] removedNull = Arrays.stream(myString)
                .filter(value ->
                value != null && value.length() > 0
        )
        .toArray(size -> new String[size]);
	    System.out.println('\n'+"Array without null Values: "+Arrays.toString(removedNull));
	}
	
	public void MissingNumbers() {
		java.util.List<Integer> list = Arrays.asList(2,2,3,4,4,5,6,7,8,10);
		int [] a = {2,2,3,4,4,5,6,7,8,10};
		System.out.println('\n'+"The distinct elements are :"); 		
		list.stream().distinct().forEach(System.out::println); 
        System.out.print('\n'+ "The repeating numbers: "); 
  
        for (int i = 0; i < a.length; i++) { 
            int abs_val = Math.abs(a[i]); 
            if (a[abs_val - 1] > 0) 
                a[abs_val - 1] = -a[abs_val - 1]; 
            else
                System.out.println(abs_val); 
        } 
  
        System.out.print('\n'+ "The missing numbers: "); 
        for (int i = 0; i < a.length; i++) { 
            if (a[i] > 0) 
                System.out.println(i + 1); 
        } 

		    
		    
 
    }
}

		 

	

