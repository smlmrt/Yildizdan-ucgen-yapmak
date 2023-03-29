import java.util.Scanner;

public class piramit
{
	public static void main(String[] args) {
		int satirSayisi;
		
		Scanner x = new Scanner(System.in);
		System.out.printf("enter the number of lines: ");
		satirSayisi = x.nextInt();
		
		for(int line = 0; line < satirSayisi; line++){
		    
		    for(int space = 0; space < satirSayisi-(line); space++){
		        System.out.print(" ");
		    }
		    
		    for(int star = 1; star <= (2 * line + 1); star++){
		        System.out.print("*");
		    }
		    
		    System.out.println(" ");
		}
		
	}
}

