import java.util.Scanner;
public class Alphabetttt {
	public static void main (String [] args)
	{  System.out.println("Enter The Character");
	Scanner var= new Scanner(System.in);
	int x= var.next().charAt(0);
	
	if((x>='a' && x<= 'z') ||(x>='A' && x<='Z'))
	{System.out.println("Number is a Alphabet");
	
	}
	else {System.out.println("Number is not a Alphabet");
	
	}

}
}
