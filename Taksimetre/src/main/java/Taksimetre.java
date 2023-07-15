import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        double km, ucret, oran = 2.20;
        int baslangic = 10;
        Scanner input = new Scanner(System.in);
        System.out.print("KM giriniz: ");
        km = input.nextDouble();

        ucret = baslangic + oran*km;

        if(ucret<20){
            System.out.println("Ücret = 20 tl");
        }else{
            System.out.println("Ücret= " + ucret + " tl");
        }
    }
}
