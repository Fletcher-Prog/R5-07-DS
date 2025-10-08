public class Q4 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Veuille fournir un nombre N en argument.");
            return;
        }
        int N;
        try {
            N = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("L'argument doit etre un nombre entier.");
            return;
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
