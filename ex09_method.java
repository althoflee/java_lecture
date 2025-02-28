public class ex09_method {
    public static void main(String[] args) {
        // 매개변수가 없는 메소드 호출
        greet();
        
        // 매개변수가 있는 메소드 호출
        greetPerson("홍길동");
        
        // 값을 반환하는 메소드 호출
        int sum = add(5, 7);
        System.out.println("5 + 7 = " + sum);
        
        // 직접 출력에 메소드 결과 사용
        System.out.println("10 + 20 = " + add(10, 20));
        
        // 여러 매개변수를 갖는 메소드
        double average = calculateAverage(85, 90, 75);
        System.out.println("평균 점수: " + average);
    }
    
    // 반환값이 없는 메소드 (void)
    public static void greet() {
        System.out.println("안녕하세요!");
    }
    
    // 매개변수가 있는 메소드
    public static void greetPerson(String name) {
        System.out.println(name + "님, 안녕하세요!");
    }
    
    // 반환값이 있는 메소드
    public static int add(int a, int b) {
        return a + b;
    }
    
    // 여러 매개변수를 받는 메소드
    public static double calculateAverage(int score1, int score2, int score3) {
        int sum = score1 + score2 + score3;
        return sum / 3.0; // 실수 나눗셈을 위해 3.0 사용
    }
}
