public class ex07_whileLoop {
    public static void main(String[] args) {
        // while 루프로 10에서 1까지 카운트다운
        System.out.println("while 루프로 카운트다운:");
        int count = 10;
        while (count > 0) {
            System.out.print(count + " ");
            count--;
        }
        System.out.println();
        
        // do-while 루프 예제 (적어도 한번은 실행됨)
        System.out.println("\ndo-while 루프 예제:");
        int number = 1;
        do {
            System.out.print(number + " ");
            number++;
        } while (number <= 5);
        System.out.println();
    }
}
