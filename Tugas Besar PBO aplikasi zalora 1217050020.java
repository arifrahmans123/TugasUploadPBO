import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class ZaloraMenuUtama{
    public void Home(){
    Scanner input = new Scanner (Systemn.in);
    
    }
    public void katagori(){
        Scanner input = new Scanner (Systemn.in); 
    
        int pilihankatagori;
        char ulang;
    
        System.out.println("1. Wanita");
        System.out.println("2. Pria");
        System.out.println("3. Sports");
        System.out.println("4. Beauty");
        System.out.println("5. Anak");
        System.out.println("6. Luxury");
        System.out.println("7. Home&Lifestyle");
        System.out.println();
    
        System.out.print("Pilihan Katagori Anda (1-7): ");
        pilihankatagori = input.nextInt();
        
         switch(pilihan){
        case 1:
          System.out.println("Wanita");
          break;
        case 2:
          System.out.println("Pria");
          break;
        case 3:
          System.out.println("Sports");
          break;
        case 4:
          System.out.println("Beauty");
          break;
        case 5:
          System.out.println("Anak");
          break;
        case 6:
          System.out.println("Luxury");
          break;
        case 7:
          System.out.println("Home&Lifestyle");
          break;
        default:
          System.out.println("Menu tidak tersedia");
      }
        System.out.println();
      
        System.out.print("Ingin memilih menu lain (y/t)? ");
        ulang = input.next().charAt(0);
       
        System.out.println();
    }
    public void tas(){
        
    }
    public void wishlist(){
        
    }
    public void akunsaya(){
        
    }
    public static void (string[]args){
        
    }
}
public class katagoribarang{
    
}
public class brandbarang{
    
}
public class zaloraoutlet{
    
}
public class zaloramagazine{
    
}
public class tas{
    
}
public class wishlist{
    
}
public class akunsaya{
    
}
