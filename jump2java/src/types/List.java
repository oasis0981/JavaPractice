package types;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class List {
    /**
     * 리스트: 배열과 비슷한 자바의 자료형, 편리한 기능 많이 가짐
     ** 배열은 크기가 정해져 있지만, 리스트는 그렇지 않음 -> 동적으로 자료의 개수가 변하는 상황에 사용
     ** ArrayList, Vector, LinkedList 등 List의 인터페이스를 구현한 자료형이 있음
     */
    public static void main(String[] args){
        // ArrayList: 리스트 자료형 중 가장 간단한 형태의 자료형
        // Generics: 객체를 포함하는 자료형도 어떤 객체를 포함하는지에 대해 명시 권고. <String>처럼

        // 리스트 기본 사용법
        ArrayList<String> pitches = new ArrayList<>();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");
        System.out.println(pitches.get(1));             // .get(i) 특정 인덱스 추출
        System.out.println(pitches.size());             // .size() 갯수 리턴
        System.out.println(pitches.contains("142"));    // .contains(o) 해당 항목 있는지 확인
        System.out.println(pitches.remove("129"));   // .remove(o) 객체 제거 성공시 True 리턴, 인덱스로 제거 성공시 삭제된 항목 리턴

        String[] data = {"180", "160", "173"};          // 이미 데이터 배열이 있는 경우
        ArrayList<String> heights = new ArrayList<>(Arrays.asList(data));
        System.out.println(heights);


        // 콤마로 조인하기
        String result = "";
        for (int i = 0; i < heights.size(); i++) {
            result += heights.get(i);
            result += ",";
        }
        result = result.substring(0, result.length() - 1);  // 마지막 콤마 제거

        // 조인하는 간단한 방법 : String.join
        String result2 = String.join(",", heights); // delimiter: 구분자
        System.out.println("join 결과 : " + result2);


        // 리스트 정렬하기
        heights.sort(Comparator.naturalOrder()); // 오름차순 정렬
        System.out.println("오름차순 정렬 : " + heights);
    }
}

