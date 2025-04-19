import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        boolean acertou = true;
            int v[] = new int[1000000];
            int c2 = 0;
            int contador = 1;
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
                c2++;
                Thread.sleep(2000);
                for (int cont = 0; cont < 50; cont++) System.out.println();

            }
        System.out.println("1   =  🟨");
        System.out.println("2   =  🟦");
        System.out.println("3   =  🟩");
        System.out.println("4   =  🟥\n");
            boolean sn = true;
            c2 = 0;
            int c3 = 1;
            int teste = 0;
            while (sn == true){


                if (teste > 1){
                    break;
                }

                System.out.println("Qual foi a " + c3 + " cor que apareceu? ");
                Scanner scanner = new Scanner(System.in);
                int cor = scanner.nextInt();
                if (cor == v[c2]) {
                    teste ++;
                    c2++;
                } else {
                  acertou = false;
                  break;
                }
                c3++;
            }
            c3 = 0;
            c2 = 0;

            contador++;

    }
}


