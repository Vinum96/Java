package H2;

public class MathOperations {

    public static void main(String[] args) {
            int a = 10;
            int b = 5;

            int sumResult = add(a, b);
            System.out.println("Добавить: " + sumResult);

            int subtractResult = subtract(a, b);
            System.out.println("Отнять: " + subtractResult);

            int multiplicationResult = multiply(a, b);
            System.out.println("Умножить: " + multiplicationResult);

            double divisionResult = divide(a, b);
            System.out.println("Делить: " + divisionResult);
        }

        public static int add(int a, int b) {
            return a + b;
        }

        public static int subtract(int a, int b) {
            return a - b;
        }

        public static int multiply(int a, int b) {
            return a * b;
        }

        public static int divide(int a, int b) {
            return  a / b;
            }

        }

