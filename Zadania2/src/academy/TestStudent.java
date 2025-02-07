package academy;

public class TestStudent {
    public static void main(String[] args) {
        Student std = new Student("Jacek", new int[]{1, 2, 3, 4, 5});
        Student stdc = null;

        try{
            stdc = (Student) std.clone();
        }catch (CloneNotSupportedException e){
            System.out.println(e.getMessage());
        }

        System.out.println(std);
        System.out.println(stdc);

        stdc.changeGrade(0,5);

        System.out.println(std);
        System.out.println(stdc);

    }
}
