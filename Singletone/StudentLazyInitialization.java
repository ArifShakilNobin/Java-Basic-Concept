package Singletone;


// Thread safe singleton design pattern
// This singleton design pattern called double check singleton design pattern
public class StudentLazyInitialization {
    private static StudentLazyInitialization lazyInitialization;
    private StudentLazyInitialization(){}

    int a=6;
    public static StudentLazyInitialization getStudentLazyInitialization(){
        if (lazyInitialization == null){
            synchronized (StudentLazyInitialization.class){
                if (lazyInitialization == null)
                {
                    lazyInitialization = new StudentLazyInitialization();
                }
            }
        }
        return lazyInitialization;
    }

    public static void main(String[] args) {
        StudentLazyInitialization studentLazyInitialization = StudentLazyInitialization.getStudentLazyInitialization();
        System.out.println(studentLazyInitialization.a);
    }
}
