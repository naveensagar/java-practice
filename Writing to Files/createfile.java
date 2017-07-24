import java.io.*;
import java.lang.*;
import java.util.*;

public class createfile {
	private Formatter x;
	
	public void openFile(){
		try{
			x = new Formatter("noblesse.txt");
		}
		catch(Exception e){
			System.out.println("you got an error.");
		}
	}
	public void addRecords(){
			x.format("Protagonist: %s, sidekick: %s, %s, %s", "Cadis Etrama Di Raizel", "Frankenstein", "M-21", "Tao");
	}
	public void closeFile(){
		x.close();
	}
}

