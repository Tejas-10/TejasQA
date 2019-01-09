import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Read_Write_TextFile {
    //Creating file
	public static void main(String[] args) throws IOException {
    File f = new File("C:\\textfile\\temp.txt");
    f.createNewFile();
	
	//Writing to text file
    
    FileWriter w = new FileWriter("C:\\textfile\\temp.txt");
    BufferedWriter out = new BufferedWriter(w);
	out.write("Hello, we are writing in a file");
	out.newLine();
	out.write("this is a new line 1");
	out.newLine();
	out.write("this is a new line 2");
	out.newLine();
	out.write("this is a new line 3");
	out.newLine();
	out.write("this is a new line 4");
	out.flush();
	
	//Read Text File
	FileReader r = new FileReader("C:\\textfile\\temp.txt");
	BufferedReader rd = new BufferedReader(r);
	
//	System.out.println(rd.readLine());
//	System.out.println(rd.readLine());
//	System.out.println(rd.readLine());
//	System.out.println(rd.readLine());
//	System.out.println(rd.readLine());
//	System.out.println(rd.readLine());
//	System.out.println(rd.readLine());
	
	String s;
	int i=0;
	
	while((s = rd.readLine())!=null){
		System.out.println(s);
		i++;
	}
		System.out.println(i);
			
		}
	    
	
	
	
	}


