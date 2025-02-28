public class ex08_arrayExample {
    public static void main(String[] args) {
        // 정수형 배열 선언 및 초기화
        int[] numbers = {10, 20, 30, 40, 50};
        
        // 배열 요소 접근
        System.out.println("첫 번째 요소: " + numbers[0]);
        System.out.println("세 번째 요소: " + numbers[2]);
        
        // 배열 길이
        System.out.println("배열 길이: " + numbers.length);
        
        // for 루프로 배열 순회
        System.out.println("\n배열 모든 요소 출력:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        
        // 향상된 for 루프(for-each)로 배열 순회
        System.out.println("\nfor-each로 배열 요소 출력:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // 문자열 배열
        String[] fruits = {"사과", "바나나", "오렌지", "포도", "딸기"};
        System.out.println("\n과일 목록:");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();
    }
    
}
