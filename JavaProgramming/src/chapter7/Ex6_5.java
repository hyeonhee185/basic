package chapter7;

import java.util.HashMap;
import java.util.Map;

public class Ex6_5 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("김자바", new Integer(90));
		map.put("한자바", new Integer(100));
		map.put("이자바", new Integer(80));
		map.put("강자바", new Integer(90));
		map.put("안자바", new Integer(100));
		System.out.println(map);

		System.out.println(map.get("김자바"));
		map.remove("김자바");
		System.out.println(map);
		map.put("김자바", new Integer(50));
		System.out.println(map);
	}
}
