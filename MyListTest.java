import java.util.ArrayList; 
public class MyListTest {
	
	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. write some code to use MyList 
		//2. use ArrayList as data storage
		
	//	ArrayList<String> sampleData = new ArrayList<>(); //  A ,
		ArrayList<String> sampleData = new ArrayList<String>(); // B, What is different between A and B?
	// Ans: Is there a difference between A and B? As I know, they work same. Could you let me know the certain difference? 
		
		
		/**
		 * ArrayList
		 * Both of sampleData instance variables have Generic ArrayList.
		 * java.util Class ArrayList<E>  -->E represents Element Type
		 * Resizable-array implementation of the List interface.
		 *  Implements all optional list operations, and permits all elements, including null. In addition to implementing the List interface,
		 *  this class provides methods to manipulate the size of the array that is used internally to store the list.
		 * 
		 * https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html (<---- look at this and try to remember...)
		 * 
		 * 
		 * Example1>
		 * List names = new ArrayList();
		 * names.add("grace");
		 * 
		 * Example2>
		 * List<String> names2 = new ArrayList();
		 * name2.add("grace");
		 * 
		 * Example1 and Example2 have big different. what is it?
		 * Ans: Ex1 is not a generic but Ex2 is a generic.
		 *   names contains "grace", and it can contain other data types too. However, when this raw(?) type is in use, 
		 *    the programmer should pay a lot of attention to type casting since the data types of elements won't be checked during compilation time.   
		 *   names2 also contains "grace", and it only can contain String as the generic specified the data type. When elements with other data types 
		 *    are added in names2, the added elements' data types will automatically be converted to String. 
		 *
		 * Compiler does not recognize the missing E in case A due to String type infront of sampleData variable.
		 * Q: To sum up... B is the standard way of allocating a generic arraylist, 
		 *   but using A also works same as B without generating a compile error. <---- Did I understand the concept properly?  
		 *   
		 *
		 */	
		
	//	String[] sampleData = {"aa","bb","cc","cc"};  //C, what if you are using straing array, what happen?  why do you need ArrayList?
	/* Ans: I don't think there will be a big difference between using String array and ArrayList. 
	    String array won't have some methods like add(), remove(), get() that ArrayList will has, so I need to write more codes. 
		Also String array will have a fixed size while ArrayList has size flexibility.
	*/	
		/*
		sampleData.add("aa");
		sampleData.add("bb");
		sampleData.add("cc");
		sampleData.add("cc");
		*/

		/*
		 * Can you reduce addition action? 
		 * Ans: If you meant reducing repeated lines, 
		 *   I can make an array which contains elements and put the elements in the ArrayList in a for loop.
		 */

		 String[] elementArr = {"aa", "bb", "cc", "dd"};
		 for (int i = 0 ; i < elementArr.length() ; i++ ){
			 sampleData.add(elementArr[i]);
		 }



		 /** 
		 * Also, can you store string and number within the object?
		 * Ans:  Since sampleData arraylist is declared as String generic, it will contain String elements.  
		 *   If a number element is added, the number's type will become String. (It could be wrong since I'm not really sure about generics.)
		 * 
		 */
		
	
		MyList myList = new MyList();
		MySet mySet = new MySet();
		
		// copy all values of the sampleData arraylist into myList
		// same data will be added as arraylist
		
		/*
		 *  Can you use another way for data iteration? not for loop
		 *  Ans: I can use while loop.
		 *  
		 */

		int index = 0;
		while (index < sampleData.size()) {
			myList.add(sampleData.get(index));
			index++;
		}

		/* 
		for (int i = 0; i < sampleData.size(); i++) { // test add
			myList.add(sampleData.get(i));
		}
		*/
		
		// copy values of the sampleData arraylist into mySet
		// same data will be added as arraylist except 4th element "cc" 
		for (int i = 0; i < sampleData.size(); i++) { // test add
			mySet.add(sampleData.get(i));
		}
		
		System.out.println("sampleData contains: " + sampleData.toString()); 
		System.out.println("myList contains: " + myList.toString()); // test MyList's toString
		System.out.println("mySet contains: " + mySet.toString()); // test MySet's toString
		System.out.println("myList contains: " + myList.get(1) + "at the index 1, and it will be removed."); 
	//	System.out.println("mySet contains: " + mySet.get(1) + "at the index 1. and it will be also removed."); //  no get method in your mySet object // I forgot about that... Thnank you for reminding.
		
		myList.remove(myList.get(1));
	//	mySet.remove(mySet.get(1));
		
		System.out.println("Now, myList contains: " +  myList.toString()); // test MyList's remove
		System.out.println("Now, mySet contains: " +  myList.toString()); // test MySet's remove
		
	}
}
	

