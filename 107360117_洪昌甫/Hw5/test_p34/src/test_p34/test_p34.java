package test_p34;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class test_p34 {
	public static void main(String[] args) {
		System.out.println("請輸入字串:");
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String str=br.readLine();
			System.out.println("已輸入字串:"+str);
		}
		catch(IOException e) {
			System.out.println("輸入輸出有誤");
		}
	}

}
