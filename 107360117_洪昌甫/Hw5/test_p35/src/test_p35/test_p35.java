package test_p35;

import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;
public class test_p35 {

	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("test_p35.txt");
			PrintWriter pw=new PrintWriter(new BufferedWriter(fw));
			pw.println("Hello");
			pw.println("GoodBye!");
			pw.close();
			System.out.println("��Ƥw�g�J�ɮפF");
		}
		catch(IOException e) {
			System.out.println("��J��X���~");
		}

	}

}
