import java.util.Scanner;
public class Mission2 {
    public static void main(String[]args){ 
        //déclarer les variable prix comme float car le prix peut être un nombre a virgules
        
        Scanner tva = new Scanner(System.in);
        System.out.println("Entrer la TVA");
        double tauxTVA = tva.nextDouble();
        
        Scanner ht = new Scanner(System.in);
        System.out.println("Entrer le prix hors taxes");
        double prixHT= ht.nextDouble();
        System.out.println(prixHT *100 / tauxTVA); //ce programe permet de multiplier le prix hors taxe par 100 et de le diviser par la valeure de la TVAs
    }
}