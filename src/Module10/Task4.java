package Module10;

public class Task4 extends Exception {

    static private void g() throws Task2 {
        throw new Task2("My Exception");
    }

    static private void f() throws Exception {
        try {
            g();
        } catch (Task2 task2) {
            throw new Exception();
        }
    }

    public static void main(String[] args) {
        try {
            g();
        } catch (Task2 task2) {
            task2.print();
        }

        try {
            f();
        } catch (Exception e) {
            System.out.println("System Exception");
        }
    }
}
