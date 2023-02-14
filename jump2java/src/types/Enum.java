package types;

public class Enum {
    /**
     * 상수집합 Enum
     * 매직넘버(상수값)를 사용할 때 코드가 명확해짐
     * 잘못된 값을 사용함으로 인해 발생할 수 있는 위험성이 사라짐
     */
    enum CoffeeTypes {
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    };

    public static void main(String[] args) {
        for (CoffeeTypes type : CoffeeTypes.values()) {
            System.out.println(type);
        }
    }
}
