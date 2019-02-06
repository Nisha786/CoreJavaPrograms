import java.io.*;
class FileMerger
{
	public static void main(String[] args)throws Exception {
/*		PrintWriter pw = new PrintWriter("output.txt");
		BufferedReader br = new BufferedReader(new FileReader("wc.txt"));
		String line = br.readLine();
		while(line != null)
		{
			pw.println(line);
			line = br.readLine();
		}
		br = new BufferedReader(new FileReader("nisha.txt"));
		line = br.readLine();
		while(line != null)
		{
			pw.println(line);
			line = br.readLine();
		}
		pw.flush();
		br.close();
		pw.close();  */






		//Demo -2 merger file line by line
/*		PrintWriter pw = new PrintWriter("linebyline.txt");
		BufferedReader br1 = new BufferedReader(new FileReader("wc.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("nisha.txt"));
		String line1 = br1.readLine();
		String line2 = br2.readLine();
		while(line1 != null | line2 != null)
		{
			if(line1 != null)
			{
			  pw.println(line1);
			  line1 = br1.readLine();
            }
            if(line2 != null)
            {
            	pw.println(line2);
            	line2 = br2.readLine();
            }
        }   
		pw.flush();
		br1.close();
		br2.close();
		pw.close();  */







//Demo-3 delete duplicates
		BufferedReader br1 = new BufferedReader(new FileReader("wc.txt"));
		PrintWriter pw = new PrintWriter("nisha.txt");
		String line = br1.readLine();
		while(line != null)
		{
			boolean available = false;
			BufferedReader br2 = new BufferedReader(new FileReader("nisha.txt"));
			String target = br2.readLine();
			while(target != null)
			{
				if(line.equals(target))
				{
					available = true;
					break;
				}
				target = br2.readLine();
			}
			String target = br2.readLine();
			while(target != null)
			{
				if(line.equals(target))
				{
					available = true;
					break;
				}
				target = br2.readLine();
			}
			if(available == false)
			{
				pw.println(line);
			}
			line = br1.readLine();
		}
		pw.flush();
		br1.close();
		br2.close();
		pw.close();

	}
}