package cond;

public class If3 {
    public static void main(String[] args) {
        int age = 14;
        if (age <= 7) {
            System.out.println("미취학");
        }
        if (7 < age && age <=13) {
            System.out.println("초등학생");
        }
        if (13 < age && age <= 16){
            System.out.println("중학생");
        }
        if (16 < age && age <= 19){
            System.out.println("고등학생");
        }
        if (19 < age ){
            System.out.println("성인");
        }
    }
}
