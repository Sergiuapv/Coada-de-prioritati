
public class Familie extends Pasager{
	public Pasagersingur[] v;
	public Familie() {
		
	}
	public Familie(String s,int n)
	{
		super(s);
		v=new Pasagersingur[n];
		
	}
	 public void add(Pasagersingur p)
		{
			this.v[pos]=p;
			pos++;
			size++;
		}
	public int getpriority()
	{
		int p=10;
		for(int i=0;i<this.size;i++)
		{if(v[i].age<2)
			p=p+20;
		else if(v[i].age < 5)
			p=p+10;
		else
			if(v[i].age<10)
				p=p+5;
		if(v[i].age>=60)
			p=p+15;
		if(v[i].tipbilet.equals("b"))
			p=p+35;
		if(v[i].tipbilet.equals("p"))
			p=p+20; 
		if(v[i].imbPrioritara==true)
			p=p+30;
		if(v[i].nevoiSpeciale==true)
			p=p+100;
		}
		return p;
	
	}



}
