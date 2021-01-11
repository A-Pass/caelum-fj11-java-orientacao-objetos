// Capítulo 3.12
class LabeledLoops {
    public static void main(String[] args) {
        System.out.println("Sem label: ");

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(j == 5) break;
                System.out.println("Loop: " + i + ',' + j);
            }
        }
        
        System.out.println("Com label: ");

        primeiro: for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(j == 5) break primeiro;
                System.out.println("Loop: " + i + ',' + j);
            }
        }
    }
}
