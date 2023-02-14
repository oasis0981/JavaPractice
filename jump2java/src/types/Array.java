package types;

public class Array {
    /**
     * 배열 : 자료형의 종류가 아닌 자료형의 집합을 의미함.
     ** 배열의 길이는 고정되어 있다.
     */
    public static void main(String[] args){
        String[] weeks = new String[7];     // 배열 길이 7으로 고정
        String[] weeks2 = {"월", "화", "수", "목", "금", "토", "일"};

        // 배열의 값 접근하기
        System.out.println(weeks2[3]);

        // 배열의 길이 (for 사용시 유용)
        for (int i = 0; i < weeks2.length; i++) {
            System.out.println(weeks2[i]);
        }
    }

}
