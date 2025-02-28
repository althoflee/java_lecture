public class ex03_operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        
        // 산술 연산자
        System.out.println("a + b = " + (a + b));  // 더하기
        System.out.println("a - b = " + (a - b));  // 빼기
        System.out.println("a * b = " + (a * b));  // 곱하기
        System.out.println("a / b = " + (a / b));  // 나누기 (몫)
        System.out.println("a % b = " + (a % b));  // 나머지
        
        // 증감 연산자
        int c = 5;
        System.out.println("c++ = " + (c++));  // 후위 증가 (출력 후 증가)
        System.out.println("c = " + c);        // 증가된 값 확인
        
        int d = 5;
        System.out.println("++d = " + (++d));  // 전위 증가 (증가 후 출력)
        
        // 비교 연산자
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
    }
    
}
