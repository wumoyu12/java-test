package Java;
import java.util.Scanner;
public class Java_Trash
{

	public static void main(String[] args)
	{
		AskName();
	}
	
	static void AskName()
	{
		Scanner input = new Scanner(System.in);
		String fname, lname, fullname;
       
		System.out.print("Enter your first name");
		fname=input.nextLine();
		Checkname(fname);
		System.out.print("Enter your last name: ");
		lname = input.nextLine(); 
		Checkname(lname);
		fullname=fname + " " + lname;
		System.out.println(fullname);
		
		AskNum();
	}
	
    static void Checkname(String name)
    {
        if (name == "")
        {
        	System.out.print("invalid");
        	AskName();
        }
        else
        {
        	System.out.print("WoW");
        }
    }
    
	static void AskNum()
	{
		Scanner input = new Scanner(System.in);
		String num;
		System.out.print("Enter the number that is bigger than one but less than 4");
		num=input.nextLine();
		
		switch(num)
		{
			case "1":
				System.out.println("forloop");
				ForLoop();
				break;
			case "2":
				System.out.println("whileLoop");
				WhileLoop();
				break;
			case "3":
				System.out.println("dowhile");
				Dowhile();
				break;
			default:
				System.out.println("it's invalid, try again");
				AskNum();
				break;
		}
	}
	
	static void ForLoop()
	{
		for (int i =0; i<5; i++)
		{
			System.out.print("aa");
		}
	}
	
	static void WhileLoop()
	{
		int a, b;
		a=1;
		b=5;
		while(a!=b)
		{
			System.out.print(a);
			a++;
		}
	}
	
	static void Dowhile()
	{
		int a;
		a=0;
		do
		{
			System.out.print(a);
			a++;
		}
		while(a != 5);
	}
}


    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");

    cars.add(0, "Mazda"); // Insert element at the beginning of the list (0)

    System.out.println(cars);
ArrayList<Type> arrayList= new ArrayList<>();
// create Integer type arraylist
ArrayList<Integer> arrayList = new ArrayList<>();

// create String type arraylist
ArrayList<String> arrayList = new ArrayList<>();

    // create ArrayList
    ArrayList<String> languages = new ArrayList<>();

    // Add elements to ArrayList
    languages.add("Java");
    languages.add("Python");
    languages.add("Swift");
    System.out.println("ArrayList: " + languages);
output
ArrayList: [Java, Python, Swift]
