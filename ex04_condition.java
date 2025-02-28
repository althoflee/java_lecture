public class ex04_condition {
    public static void main(String[] args) {
        int score = 85;
        
        // if-else 조건문
        if (score >= 90) {
            System.out.println("A 학점입니다.");
        } else if (score >= 80) {
            System.out.println("B 학점입니다.");
        } else if (score >= 70) {
            System.out.println("C 학점입니다.");
        } else if (score >= 60) {
            System.out.println("D 학점입니다.");
        } else {
            System.out.println("F 학점입니다.");
        }
        
        // 삼항 연산자 예제
        int age = 20;
        String status = (age >= 19) ? "성인" : "미성년자";
        System.out.println("당신은 " + status + "입니다.");
    }
}
