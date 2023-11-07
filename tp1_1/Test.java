import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*Ecrivez la classe principale « Test » qui contient la méthode public static void main(…)
         dans laquelle vous allez :
a. Créer un objet nommé « D1 » de type « Distributeur ».
b. à partir de D1, commandez du « Thé ».
c. Commandez une autre boisson en saisissant votre choix à partir du clavier.
d. Calculez et affichez la monnaie de 100 dinars.*/
      Distributeur D1 = new Distributeur();
      D1.selection(2);
    System.out.println(D1.selection(2));
    Scanner read = new Scanner(System.in);
    int choix1 = read.nextInt();
    

    }
}
