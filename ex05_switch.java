public class ex05_switch {
    public static void main(String[] args) {
        char grade = 'B';
        
        switch (grade) {
            case 'A':
                System.out.println("우수한 성적입니다.");
                break;
            case 'B':
                System.out.println("좋은 성적입니다.");
                break;
            case 'C':
                System.out.println("보통 성적입니다.");
                break;
            case 'D':
                System.out.println("노력이 필요합니다.");
                break;
            case 'F':
                System.out.println("재수강이 필요합니다.");
                break;
            default:
                System.out.println("잘못된 학점입니다.");
                break;
        }
    }
}
