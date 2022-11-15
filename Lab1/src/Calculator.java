public class Calculator {
    /*
    Student number: 0526
    C2 = 526 % 2 = 0;
    C3 = 526 % 3 = 1;
    C5 = 526 % 5 = 1;
    C7 = 526 % 7 = 1

    Operations:
    O1: +
    O2: /

    Type: short
     */
    private int CONSTANT = 2;

    public int getSum(short a, short b, int n, int m) {
        int sum = 0;
        for (short i = a; i <= n; n++) {
            for (short j = b; j <= m; m++) {
                sum += (i / j) / (i + CONSTANT);
            }
        }
        return sum;
    }
}