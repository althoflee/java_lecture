public class ex06_forLoop {
    public static void main(String[] args) {
        // 1부터 10까지 출력
        System.out.println("1부터 10까지 출력:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // 구구단 5단 출력
        System.out.println("\n구구단 5단:");
        for (int i = 1; i <= 9; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }
        
        // 중첩 for문으로 별 피라미드 만들기
        System.out.println("\n별 피라미드:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
