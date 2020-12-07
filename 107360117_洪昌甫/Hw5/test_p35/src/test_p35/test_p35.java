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
			System.out.println("資料已寫入檔案了");
		}
		catch(IOException e) {
			System.out.println("輸入輸出有誤");
		}

	}

}
