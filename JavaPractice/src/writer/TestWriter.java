package writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestWriter {
	
	public static void main(String args[])
	{
		String file1="C:\\Users\\Subhash\\Desktop\\Train_Tickets\\https___www.irctc.co.in_eticketing_printTicket.pdf";
		File pdffile1=new File(file1);
		
		try {
			
			
            FileWriter writer = new FileWriter("C:\\Users\\Subhash\\Desktop\\Train_Tickets\\text1.txt");
            writer.write(file1);
            System.out.println(writer);
            /*writer.write("\r\n");   // write new line
            writer.write("Good Bye!");
            writer.close();*/
        } catch (IOException e) {
            e.printStackTrace();
        }
 
		
	}

}
