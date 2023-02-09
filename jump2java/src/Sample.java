// 소스코드의 구조 파악하기

import java.util.ArrayList;

public class Sample {
    public static void main(String[] args) {
        ArrayList<String> pitches = new ArrayList<>(); // 제너릭스. arraylist 안에 담을 자료형은 string 뿐이다
        pitches.add("138");
        pitches.add("129");
        pitches.add("152");
        System.out.println(pitches.get(1)); // get 메서드: 특정 인덱스 값 추출
        System.out.println(pitches.size()); // 갯수 출력
        System.out.println(pitches.contains("152")); // 해당 항목이 있는지 boolean
        System.out.println(pitches.remove(0)); // 인덱스나 객체를 제거
    }
}
