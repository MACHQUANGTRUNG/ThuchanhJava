import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        double hesoA,hesoB,hesoC,delta;
	    double x1,x2;
	    Scanner abc = new Scanner (System.in);
		System.out.println("Nhap vao he so A: ");
        hesoA = abc.nextDouble();
		System.out.println("Nhap vao he so B: ");
		hesoB = abc.nextDouble();
		System.out.println("Nhap vao he so C: ");
		hesoC = abc.nextDouble();
		delta = hesoB*hesoB-4*hesoA*hesoC;
		if (delta>0) 
	    {
            x1 = ((-hesoB + Math.sqrt(delta)) / (2*hesoA));
            x2 = ((-hesoB - Math.sqrt(delta)) / (2*hesoA));
            System.out.println("Phương trình có 2 nghiệm là: " + "x1 = " + x1 + " và x2 = " + x2);
        } 
        else if (delta == 0)
        {
            x1 = (-hesoB / (2 *hesoA));
            System.out.println("Phương trình có nghiệm kép: " + "x1 = x2 = " + x1);
        } 
        else 
        {
            System.out.println("Phương trình vô nghiệm!");
	    }
	}

    }
   
