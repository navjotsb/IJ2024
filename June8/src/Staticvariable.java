public class Staticvariable {
        public static int counter = 0;

        public Staticvariable() {
            counter++;
        }

        public static void main(String[] args) {
            Staticvariable obj1 = new Staticvariable();
            Staticvariable obj2 = new Staticvariable();
            System.out.println(Staticvariable.counter); // Outputs 2
        }
    }

