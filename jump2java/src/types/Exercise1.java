package types;

import java.io.OutputStream;
import java.util.*;

public class Exercise1 {
    public static void main(String[] args) {
        // 1. 평균점수 구하기
        int korean = 80;
        int english = 75;
        int math = 55;
        long avg = (korean + english + math) / 3;
        System.out.println(avg);

        // 2. 홀수 짝수 판별
        int num = 13;
        boolean n = num % 2 == 1; // 홀수면 True
        System.out.println(n);

        // 3. 주민등록번호 나누기
        String id = "881120-1068234";
        System.out.println(id.substring(0,6));
        System.out.println(id.substring(7));

        //4. 주민등록번호 인덱싱
        System.out.println(id.charAt(7));

        // 5. 문자열 바꾸기
        String a = "a:b:c:d";
        System.out.println(a.replace(":", "#"));

        // 6. 리스트 역순 정렬하기
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));
        myList.sort(Comparator.reverseOrder()); // 리턴값 없으므로 바로 출력 안됨
        System.out.println(myList);

        // 7. 리스트를 문자열로 만들기
        ArrayList<String> myList2 = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
        String result = String.join(" ", myList2);
        System.out.println(result);

        // 8. 맵에서 값 추출하기
        HashMap<String, Integer> grade = new HashMap<>();
        grade.put("A", 90);
        grade.put("B", 80);
        grade.put("C", 70);
        int removed = grade.remove("B");
        System.out.println(removed);
        System.out.println(grade);

        // 9. 중복 숫자 제거하기
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
        HashSet<Integer> temp = new HashSet<>(numbers);
        ArrayList<Integer> r = new ArrayList<>(temp);
        System.out.println(r);


    }
}

// 10. 매직넘버 제거하기
class Exercise2 {
    enum CoffeeType { // 열거형은 메소드 안에 선언할 수 없음
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    };
    static void printCoffeePrice(CoffeeType type) {
        HashMap<CoffeeType, Integer> priceMap = new HashMap<>();
        priceMap.put(CoffeeType.AMERICANO, 3000);
        priceMap.put(CoffeeType.ICE_AMERICANO, 4000);
        priceMap.put(CoffeeType.CAFE_LATTE, 5000);
        int price = priceMap.get(type);
        System.out.printf("가격은 %d원입니다.", price);
    }

    public static void main(String[] args) {
        printCoffeePrice(CoffeeType.CAFE_LATTE);
    }
    }