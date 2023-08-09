import java.util.Scanner;

public class belajar {
    public static void main(String[] args) {
       
        Scanner endra = new Scanner(System.in);
        
        System.out.println("Masukkan Celcius");
        double c = endra.nextDouble();

        System.out.println("pilih opsi");
        System.out.println("1.Fahrenheit ");
        System.out.println("2. Reamur ");
        System.out.println("3. Cancel ");

        int opsi = endra.nextInt();

        if(opsi == 1){
            double F = (c *9/5) + 32;
            System.out.println(c + " adalah " + F);}
           
            else if(opsi == 2){
                double R = (c * 4/5);
                System.out.println(c + " adalah " + R);}
            
            else if(opsi == 3){
                double K = (c + 273);
                System.out.println(c + " adalah " + K);}

                else 
                System.out.println("opsi tidak valid");
            

            

            
        
        }
}
