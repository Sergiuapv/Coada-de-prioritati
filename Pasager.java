
public  class Pasager {

	public Pasager() {
		// TODO Auto-generated constructor stub
	}
	public Pasager(String s)
	{
		this.id=s;
	}
	public Pasager(int n,String s)
	{
		this.prior=n;
	}
	
	public String id;
	
	public int pos;
	public int size=0;
	public int prior;
	
	 
	 public void add(Pasagersingur p)
		{
			
		}

	 public int getpriority() {
		 return prior;
	 }
		
}
