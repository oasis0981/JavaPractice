package types;

import java.util.HashMap;
import java.util.SimpleTimeZone;

public class Map {

    /**
     * Map: 딕셔너리와 비슷하게 key와 Value를 한 쌍으로 가짐
     ** Associative array나 Hash라고도 불림
     ** Not Sequential
     ** 순서를 갖고 싶은 경우: LinkedHashMap(입력순서), TreeMap(key 오름차순) 사용
     */
    public static void main(String[] args){
        // HashMap: Map 인터페이스를 구현한 자료형 중 가장 기본적인 것

        // HashMap 기본 사용법
        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");                // (key, value) 추가
        map.put("baseball", "야구");
        map.put("soccer", "축구");
        System.out.println(map.get("people"));   // get(key)로 value 얻기
        System.out.println(map.containsKey("people")); // 해당 key가 있는지 유무
        System.out.println(map.remove("people"));  // (key,value)삭제 후 value 리턴
        System.out.println(map.size());
        System.out.println(map.keySet());       // 모든 key 리턴

    }

}
