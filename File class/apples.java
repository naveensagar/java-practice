import java.io.File;

class apples{
	public static void main(String args[]){
		File x = new File("/home/naveen/Desktop/java/test.txt");
		if(x.exists())
			System.out.println(x.getName() + " exists!");
		else
			System.out.println("this file doesn't exist.");
	}
}
