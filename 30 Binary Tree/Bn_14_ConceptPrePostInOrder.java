public class Bn_14_ConceptPrePostInOrder {

    public static void pip(int n) {
        if (n == 0)
            return;

        System.out.print(n);
        pip(n - 1);
        System.out.print(n);
        pip(n - 1);
        System.out.print(n);

    }

    public static void main(String[] args) {
        pip(2);
    }

}
