package work20210228;

import java.util.ArrayList;
import java.util.List;

//223 安浩然
public class Classroom0228 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("World");
		list.set(1, "Learn");
		list.set(1, "JAVA");
		printList(list);
	}

	private static void printList(List<String> list) {
		for (int x = 0; x < list.size(); x++) {
			String str = (String) list.get(x);
			System.out.println(str);
		}
	}
}
