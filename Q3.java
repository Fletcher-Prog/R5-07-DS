public class Q3 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Veuillez fournir un nombres N en argument.");
            return;
        }
        int N;
        try {
            N = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("L'argumet doit être un nombre entier.");
            return;
        }
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
