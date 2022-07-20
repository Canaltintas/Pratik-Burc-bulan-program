import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int day;
        int mount;
        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz Ayı Giriniz :");
        mount=input.nextInt();
        System.out.print("Doğduğunuz Gün :");
        day = input.nextInt();

        if (day>0 && day <=31){
            if (mount == 1){

                if (day <= 21  ){
                    System.out.println("Oğlak Burcu");
                }else{
                    System.out.println("Kova Burcu");
                }

            }else if (mount == 2){
                if (day<=19){
                    System.out.println("Kova Burcu");
                }else {
                    System.out.println("Balık Burcu");
                }

            }else if (mount == 3){
                if (day <= 20){
                    System.out.println("Balık Burcu");
                }else {
                    System.out.println("Koç Burcu");
                }

            }else if (mount == 4){
                if (day <= 20){
                    System.out.println("Koç Burcu");
                }else {
                    System.out.println("Boğa Burcu");
                }
            }else if (mount == 5){
                if (day <= 21){
                    System.out.println("Boğa Burcu");
                }else{
                    System.out.println("İkizler Burcu");
                }

            }else if (mount == 6){
                if (day <= 22){
                    System.out.println("İkizler Burcu");
                }else{
                    System.out.println("Yengeç Burcu");
                }

            }else if (mount == 7){
                if (day <= 22){
                    System.out.println("Yengeç Burcu");
                }else {
                    System.out.println("Aslan Burcu");
                }

            }else if (mount == 8){
                if (day <= 23){
                    System.out.println("Aslan Burcu");
                }else {
                    System.out.println("Başak Burcu");
                }

            }else if (mount == 9){

                if (day <= 22){
                    System.out.println("Başak Burcu");
                }else {
                    System.out.println("Terazi Burcu");
                }

            }else if (mount == 10){
                if (day <= 22){
                    System.out.println("Terazi Burcu");
                }else {
                    System.out.println("Akrep Burcu");
                }

            }else if (mount == 11){
                if (day <= 21){
                    System.out.println("Akrep Burcu");
                }else{
                    System.out.println("Yay Burcu");
                }

            }else if (mount == 12){
                if (day <= 21){
                    System.out.println("Yay Burcu");
                }else {
                    System.out.println("Oğlak Burcu");
                }
            }else {
                System.out.println("Hatalı bir Seçim...");
            }
        }else {
            System.out.println("Hatalı bir seçim...");
        }






    }
}
