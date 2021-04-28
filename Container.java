package Lab5;

public class Container {
	// do not change the value of the following constant.
	protected final int ORIGINAL_SIZE = 10; 
	protected Object[] list; // is a container that stores the element of MyList
	protected Object[] set; // is a container that stores the element of MySet
	protected int size; // this variable holds the actual number of elements that are stored in either of the containers (i.e. MyList or MySet).
	/**
	 * This method adds the <code> obj </code> to the end of the container.
	 * @param obj is the object that is added to the container.
	 */
	void add(Object obj) {
		System.out.println("The object was added to the contianer");
	}
	/**
	 * This method removes the <code> obj </code> from the container. 
	 * It shifts all the elements to make sure that removal of the element
	 * does not create a whole in the container.
	 * @param obj is the object that is removed from the container. 
	 * @return It returns the object that was removed.
	 */
	Object remove(Object obj) {
		System.out.println("The object was removed from the container.");
		return obj;
	}
	/**
	 * This method returns true if the container is empty.
	 * @return It returns true if the container is empty, otherwise false.
	 */
	boolean isEmpty() {
		// you may want to change this return value
		//if no array have any element, container is empty 
		return (size == 0);
		
	}
	/**
	 * This method returns the number of elements stored in the container.
	 * @return It returns the number of elements in the container.
	 */
	int getSize() {
		// you may want to return this return value.
		return size;
	}
	

}

/**
 * 
 * This class simulates an ArrayList, where you can add unlimited number of 
 * elements to the list.
 *
 */
class MyList extends Container{
	/**
	 * This is the default constructor that sets all the instance variables to their default value. 
	 */
	public MyList () {
		list= new Object[ORIGINAL_SIZE];
		size = 0; 
	}
	
	/**
	 * This method returns the element that is stored at index <code> index </code>.
	 * @param index is the<code> index </code> at which the element is accessed and returned. 
	 * @return it returns the element stored at the given <code> index </code>.
	 */
	public Object get(int index) {
		// insert your code here. You may want to change the return value. 
		return list[index]; 	
	}
	/**
	 * This method overrides the <code> add </code> method defined in class <code> container</code>, by
	 * adding the <code> obj </code> to the back of <code> list </code> array. 
	 * The original size of the <code> array </code>, is defined by <code> ORIGINAL_SIZE </code>, however, it is possible that 
	 * more elements is added to this array. In case the array does not have enough capacity to add one more element, it grows itself 
	 * by doubling the size of <code> list </code> array.     
	 */
	@Override
	void add(Object obj) {
		// insert your code here
		size += 1;
		if (size > list.length ){ // Not enough capacity array
			Object tempList[] = new Object[list.length]; //copy elements of original list to temp list
			for (int i=0; i<list.length; i++) {
				tempList[i] = list[i];
			}
			list = new Object[list.length*2]; //make new list that has double size
			for (int i=0; i<tempList.length; i++) {
				list[i] = tempList[i]; //re-save elements of temp list to new sized list
			}
		}
		list[size-1] = obj;//add obj at the back of the list
		
		//System.out.println("size: " + size);
		//System.out.println("added: " + list[size-1]);
	}

	
	/**
	 * This method removes the first occurrence of <code> obj </code>
	 * from <code> list </code>
	 * @pre <code> obj </code> exists in the <code>list</code> array.
	 * 
	 */
	@Override
	Object remove(Object obj) {
		// insert your code here. You may want to change the return value.
		boolean objExist = false;
		int removedIndex ='\0';
		
		for (int i = 0; i<size; i++) { //check list
			if (list[i].equals(obj)) { //obj is in list
				list[i] = null; //remove element
				removedIndex=i;
				objExist = true; //obj will be returned later
				size -= 1;
				break;//only first occurrence 
			}
		}
		
		if (objExist == false) {
			return null; // no same obj in the list
		}
		
		else {
			for (int i = removedIndex ; i+1 < size+1; i++) {//shift element if there is null
				list[i] = list[i+1];
			}
		/*
			System.out.println("removed size: " + size);
			for (int i = 0; i<size; i++) {
				System.out.println("array"+ i + list[i]);
			}*/
		
			return obj;
		}

		
	}
	/**
	 * This method returns the elements of the MyList in a form of 
	 * [obj1 obj2 obj3 ...]
	 */
	@Override
	public String toString() {
		// insert your code here. You may want to change the return value.		
		String result = "[";
		for (int i = 0; i<size; i++) {
			if (i>0) {
				result +=" ";
			}
			result += list[i];
		}
		result += "]";
		return result;
	}


}

class MySet extends Container{
	public MySet() {
		set = new Object[ORIGINAL_SIZE];
		size = 0; 
	}
	
	/**
	 * This method overrrides the <code> add </code> method defined in class <code> container</code>, by
	 * adding the <code> obj </code> to the back of <code> set </code> array. 
	 * The original size of the <code> set </code>, is defined by <code> ORIGINAL_SIZE </code>, however, it is possible that 
	 * more elements is added to this set. In case the set does not have enough capacity to add one more element, it grows itself 
	 * by doubling the size of <code> set </code> array.      
	 */
	
	@Override
	void add(Object obj) {
		// insert your code here. You may want to change the return value.
		
		//check if obj already exist in array
		boolean isDuplicate = false;
		
		for (int i = 0; i<size; i++) { //check set
			if (set[i].equals(obj)) { //obj is in set
				isDuplicate = true;
				break;
			}
		}		
		
		if (isDuplicate == true) {
			//System.out.println("duplicate:"+ obj);
			return;//there is duplication so ends the method
		}
		
		size += 1;
		if (size > set.length ){ // Not enough capacity array
			Object tempSet[] = new Object[set.length]; //copy elements of original Set to temp set
			for (int i=0; i<set.length; i++) {
				tempSet[i] = set[i];
			}
			set = new Object[set.length*2]; //make new set that has double size
			for (int i=0; i<tempSet.length; i++) {
				set[i] = tempSet[i]; //re-save elements of temp Set to new sized set
			}
		}
		
		set[size-1] = obj;//add obj at the back of the set
		/*
		System.out.println("size:"+size);
		for (int i=0; i< size; i++) {
			System.out.println("array:"+ i + set[i]);	
		}*/
	}
	
	
	/**
	 * This method removes the first occurrence of <code> obj </code>
	 * from <code> set </code>
	 * @pre <code> obj </code> exists in the <code>set</code> array.
	 * 
	 */
	@Override
	Object remove(Object obj) {
		// insert your code here. You may want to change the return value.		
		boolean objExist = false;
		int removedIndex ='\0';
		
		for (int i = 0; i<size; i++) { //check list
			if (set[i].equals(obj)) { //obj is in set
				set[i] = null; //remove element
				removedIndex=i;
				objExist = true; //obj will be returned later
				size -= 1;
				break;//only first occurrence 
			}
		}
		
		if (objExist == false) {
			return null; // no same obj in the set
		}
		
		else {
			for (int i = removedIndex ; i+1 < size+1; i++) {//shift element if there is null
				set[i] = set[i+1];
			}
		/*
			System.out.println("removed size: " + size);
			for (int i = 0; i<size; i++) {
				System.out.println("array"+ i + set[i]);
			}*/
		
			return obj;
			}
	}
	
	/**
	 * This method returns the elements of the MySet in a form of 
	 * [obj1 obj2 obj3 ...]
	 */
	
	@Override
	public String toString() {
		// insert your code here. You may want to change the return value.		
		String result = "[";
		for (int i = 0; i<size; i++) {
			if (i>0) {
				result +=" ";
			}
			result += set[i];
		}
		result += "]";
		return result;
	}
	
}
