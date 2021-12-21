public class Switch1 {
    public static void main(String[] args) {
        char value = 'J';

        switch (value) {
            case 'A' :
                System.out.println("A");
                break;

            case 'B' :
                System.out.println("B");
                break;

            case 'C' :
                System.out.println("C");
                break;

            default:
                System.out.println("Not A, B or C");
        }
    }
}
