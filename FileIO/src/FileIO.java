import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {

	public static void main(String[] args) {
		
		String[] names = {"faizal", "Krish", "Manan", "Parth", "Hetul"};
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("firstFile.txt"));
			writer.write("Hello my name is Faizal.");
			writer.write("\nThis append all this name::\n\n");
			
			for(String name : names) {
				writer.write("\n"+name);
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("firstFile.txt"));
			
			String line;
			
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
