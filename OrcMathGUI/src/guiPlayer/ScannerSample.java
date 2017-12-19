package guiPlayer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScannerSample {

	public ScannerSample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		File file = new File("out.text");
		file.createNewFile();
		BufferedWriter out = new BufferedWriter(new FileWriter("out.text"));
		out.write(input);
		out.close();
	}

}
