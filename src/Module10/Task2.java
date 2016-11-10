package Module10;

//
public class Task2 extends NullPointerException {
    private String inputString;

    public Task2(String inputString) {
        this.inputString = inputString;
    }

    public void print() {
        System.out.println(inputString);
    }

    public static void main(String[] args) {
        try {
            throw new Task2("My Exception");
        } catch (Task2 e) {
            e.print();
        }
    }
}