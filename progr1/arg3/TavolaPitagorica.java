class TavolaPitagorica {
    public static void main(String[] args) {

        System.out.println("Tavola pitagorica (ciclo for): ");

        for(int i = 1; i <= 10; i++) {
            for(int j = 1; j <= 10; j++)
                System.out.print("[" + i * j + "]" + "\t");
            System.out.print("\n");
        }

        System.out.println("Tavola pitagorica (ciclo while): ");

        int i = 1;
        while(i <= 10) {

            int j = 1;
            while(j <= 10) {
                System.out.print("[" + i * j + "]" + "\t");
                j++;
            }

            System.out.print("\n");
            i++;
        }
    }
}