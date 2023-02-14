package types;

import java.util.Arrays;
import java.util.HashSet;

public class Set {
    /**
     * Set: 중복X, 순서X -> 인덱싱 불가
     * 중복 제거를 위한 필터로 종종 사용함
     * Set 인터페이스를 구현한 자료형: HashSet, TreeSet, LinkedHashSet 등이 있음
     */
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
        System.out.println(set);

        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));

        // 교집합
        HashSet<Integer> intersection = new HashSet<>(s1);  // s1으로 intersection 생성(HashSet 객체 copy)
        intersection.retainAll(s2);                         // 교집합 수행
        System.out.println(intersection);                   // [4,5,6] 출력

        // 합집합
        HashSet<Integer> union = new HashSet<>(s1);
        union.addAll(s2);
        System.out.println(union);

        // 차집합
        HashSet<Integer> substract = new HashSet<>(s1);
        substract.removeAll(s2);
        System.out.println(substract);

        // 집합 자료형 관련 메서드
        HashSet<String> set1 = new HashSet<>();
        set1.add("jump");
        set1.addAll(Arrays.asList("to", "java"));
        System.out.println(set1);
        set1.remove("to");      // 특정 값 제거

    }
}
