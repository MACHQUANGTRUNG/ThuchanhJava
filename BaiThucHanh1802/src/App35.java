import java.util.Scanner;
public class App35 
{
    public static void main(String[] args) throws Exception 
   {
      int Sothunhat, Sothuhai;
      Scanner scanner = new Scanner(System.in);
      System.out.println("Nhap vao so thu nhat: ");
      Sothunhat = scanner.nextInt();
      System.out.println("Nhap vao so thu hai: ");
      Sothuhai = scanner.nextInt();
      int min = Sothunhat;
      if (Sothunhat > Sothuhai) 
      min = Sothuhai;
      System.out.println("So nho nhat trong 2 so " + Sothunhat + " va "+ Sothuhai + "la " + min);
    } 

}

