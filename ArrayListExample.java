import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> chilDrivingData = new ArrayList<>();

		String[][] chilDrivingSampleData = {
				{"Monday","8:10","8:30"},
				{"Tuesday","8:20","8:40"},
				{"Wednesday","8:30","8:50"},
				{"Thursday","8:34","8:54"},
				{"Firday","8:21","8:41"},
				{"Saturday","8:19","8:39"},
		};

		System.out.println(chilDrivingSampleData.length);

		int capacity = chilDrivingSampleData.length;

		String[] strArray1 =new String[capacity];

		for(int i=0; i<chilDrivingSampleData.length;i++) {

			strArray1[i]= chilDrivingSampleData[i][0]+","+chilDrivingSampleData[i][1]+","+chilDrivingSampleData[i][2];

			chilDrivingData.add(strArray1[i]);
		}

		Enumeration<String> e = Collections.enumeration(chilDrivingData);
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
	}

}
