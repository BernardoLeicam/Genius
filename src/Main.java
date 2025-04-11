
public class Main {
    public static void main(String[] args) {
        for (int c = 0 ; c<2; c++) {
            double ale = Math.random();
            int num = (int) (1 + ale * 4);
            if (num == 1) {
                System.out.println("🟨");
            } else if (num == 2) {
                System.out.println("🟦");
            } else if (num == 3) {
                System.out.println("🟩");
            } else if (num == 4) {
                System.out.println("🟥");
            }
            Thered.sleep(2000);

        }
    }
}


