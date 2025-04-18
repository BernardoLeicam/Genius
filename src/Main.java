import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        boolean acertou = true;
        int contador = 1;
            int v[] = new int[1000000];
            int c2 = 0;
            for (int c = 0; c < 2; c++) {
                // Sorteio de numero
                double ale = Math.random();
                int num = (int) (1 + ale * 4);

                    for (int c1 = 0; c1 < 8; c1++) System.out.println();

                    if (num == 1) {
                        System.out.println("🟨");
                    } else if (num == 2) {
                        System.out.println("🟦");
                    } else if (num == 3) {
                        System.out.println("🟩");
                    } else if (num == 4) {
                        System.out.println("🟥");
                    }

                v[c2] = num;

                Thread.sleep(2000);
                for (int cont = 0; cont < 50; cont++) System.out.println();

            }
            c2++;
            contador++;

    }
}


