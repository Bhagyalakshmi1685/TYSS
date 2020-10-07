package qsp;

public class Encapsulation 
{
	public static void main(String[] args) 
	{
		EncapsulationJB en =  new EncapsulationJB(100);
		int amnt = en.getAmnt();
		System.out.println(amnt);
		
		EncapsulationJB en1 = new EncapsulationJB(200);
		int amnt1 = en1.getAmnt();
		System.out.println(amnt1);
	}

}
