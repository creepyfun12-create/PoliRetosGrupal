package poliRetosAlexander;


public class recursion {

    public void conteoRegresivo(int n) {
        if (n < 0) {
            System.out.println();
            return;
        }

        System.out.print(n + " ");

        conteoRegresivo(n - 1);
    }
}