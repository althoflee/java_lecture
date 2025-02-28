class Student {
    // 속성(필드)
    String name;
    int age;
    String major;
    
    // 생성자
    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }
    
    // 메소드
    public void introduce() {
        System.out.println("안녕하세요! 저는 " + name + "이고, " + age + "살이며, " + major + "를 전공하고 있습니다.");
    }
    
    public void study() {
        System.out.println(name + "이(가) " + major + "를 공부하고 있습니다.");
    }
}

public class ex10_class {
    public static void main(String[] args) {
        // Student 객체 생성
        Student student1 = new Student("김철수", 20, "컴퓨터 과학");
        Student student2 = new Student("이영희", 22, "경영학");
        
        // 객체의 메소드 호출
        student1.introduce();
        student1.study();
        
        student2.introduce();
        student2.study();
    }
    
}
