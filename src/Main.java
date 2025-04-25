import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        int v[] = new int[1000000];
        int c = 0;
        int c2 = 0;
        int contador = 1;
        boolean acertou = true;
        while (acertou == true) {
            if (acertou == false) {
                break;
            }

            while (c < contador) {
                // Sorteio de numero
                double ale = Math.random();
                int num = (int) (1 + ale * 4);
                v[c2] = num;
                for (int c1 = 0; c1 < 8; c1++) System.out.println();
                int c5 = 0;
                while (c5 < contador) {
                    if (c5 >= contador){
                        break;
                    }
                    if (v[c5] == 1) {
                        System.out.println("🟨");
                    } else if (v[c5] == 2) {
                        System.out.println("🟦");
                    } else if (v[c5] == 3) {
                        System.out.println("🟩");
                    } else if (v[c5] == 4) {
                        System.out.println("🟥");
                    }
                    if (contador <= 10){
                        Thread.sleep(2000);
                    }else if (contador <= 15){
                        Thread.sleep(2000);
                    } else if (contador <= 25) {
                        Thread.sleep(1000);
                    } else {
                        Thread.sleep(500);
                    }
                    for (int cont = 0; cont < 50; cont++) System.out.println();
                    c5++;
                }

                c2++;
                c++;
            }
            System.out.println("1   =  🟨");
            System.out.println("2   =  🟦");
            System.out.println("3   =  🟩");
            System.out.println("4   =  🟥\n");
            boolean sn = true;
            int c3 = 1;
            int teste = 1;
            int c4 = 0;
            while (sn == true) {


                if (teste > contador) {
                    break;
                }

                System.out.println("Qual foi a " + c3 + " cor que apareceu? ");
                Scanner scanner = new Scanner(System.in);
                int cor = scanner.nextInt();

                if (cor == v[c4]) {
                    teste++;
                    c4++;
                } else {
                    acertou = false;
                    break;
                }
                c3++;
            }
            c3 = 0;

            contador++;

        }
        System.out.println("    GAME OVER");
        contador = contador - 2;
        System.out.println("Voce acertou: " + contador + " vezes");
    }
}


