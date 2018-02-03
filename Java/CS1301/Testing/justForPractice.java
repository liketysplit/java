import java.util.Scanner;


public class justForPractice{

public static void main(String [] args){

Scanner input = new Scanner(System.in);
int i = 0;
int y;

System.out.print("How old are you?");
y = input.nextInt();

while (i<=y){

System.out.println("Counting "+i+" of "+y);
i++;
}

if (y>=51)
System.out.print("\nSo much counting....");
else if (y<=50 && y>30)
System.out.print("\nMid life crises much?");
else
System.out.print("\nYou are young?");

}
}