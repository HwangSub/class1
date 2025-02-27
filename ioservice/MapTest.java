package ioservice;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {

		// Map :: 임시저장소
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("11212212121","ab.txt");  // ( key,value )
		map.put("23232322111","gggg.txt");
		map.put("21212223223","hhhh.xsss");

		System.out.println( map.get("title") ); // -> 100
		System.out.println( map.get("pass") );
		System.out.println( map.get("writer") );
	}
}






