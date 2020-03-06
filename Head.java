import java.io.*;
import java.util.StringTokenizer; 
public class Head
{  
	public static void main(String[] args)throws  java.lang.StringIndexOutOfBoundsException, IOException
	{ 

		File file = new File("queue.in"); 
		File file1 = new File("queue.out"); 
		BufferedReader br = new BufferedReader(new FileReader(file));
		PrintStream o = new PrintStream(file1);
		System.setOut(o);
		String st;
		st=br.readLine();
		int nrpasageri=Integer.parseInt(st);
		Colectie col=new Colectie(nrpasageri);
		for(int i=1;i<=nrpasageri;i++)
		{
			st=br.readLine();
			StringTokenizer def=new StringTokenizer(st);
			String st1=def.nextToken();
			int x=st1.charAt(1)-'0';
			String st2=def.nextToken();
			String name=st2;
			st2=def.nextToken();
			int age=Integer.parseInt(st2);
			st2=def.nextToken();
			String tip=st2;
			st2=def.nextToken();
			boolean imbpr=true;
			boolean nevoi=true;
			if(st2.charAt(0)=='f')
				imbpr=false;
			st2=def.nextToken();
			if (st2.charAt(0) == 'f')
				nevoi = false;
			Pasagersingur pas = new Pasagersingur(name, age, tip, imbpr, nevoi);
			if(st1.charAt(0)=='f')
			{
				if(col.exista(st1)==false)
				{	  
					Pasager nou=new Familie(st1,nrpasageri);
					nou.add(pas); 
					col.add(nou);
				}  
				else
				{
					col.find(st1).add(pas);
				}
			}
			else if (st1.charAt(0)=='g') 
			{
				if(col.exista(st1)==false)
				{	  
					Pasager nou=new Grup(st1,nrpasageri);
					nou.add(pas); 
					col.add(nou);
				}  
				else

				{
					col.find(st1).add(pas);
				}
			}
			else
			{
				if(col.exista(st1)==false)
				{	  
					Pasager nou=new Pasagersingur(st1);
					nou.add(pas);
					col.add(nou);
				}  
				else
				{
					col.find(st1).add(pas);
				}
			}
		}
		Heap coada=new Heap(nrpasageri);
		try
		{	
			while ((st=br.readLine())!=null && st.length()>1)
			{StringTokenizer def1=new StringTokenizer(st);
			String st1=def1.nextToken();

			if(st1.equals("insert"))
			{	
				st1=def1.nextToken();
				Pasager pas=col.find(st1);
				coada.insert(pas,pas.getpriority());

			}
			else
				if(st1.equals("list"))
				{
					coada.List();
				}
				else
					if(st1.equals("embark"))
						coada.extractMax();
			}
		}catch (IOException e) 
		{

			e.printStackTrace();

		}
		finally {

			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	} 

}


