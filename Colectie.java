
public class Colectie {
	public Pasager[] v;
	public int pos;
	public int size;
	public Colectie(int n) {

		v=new Pasager[n];
	}
	public void add(Pasager p)
	{

		this.v[pos]=p;
		pos++;
		size++;
	}
	public boolean exista(String s)
	{	for(int i=0;i<this.size;i++)
		if(s.equals(v[i].id))
			return true;
	return false;
	}
	public  Pasager find(String s)
	{
		for(int i=0;i<this.size;i++)
			if(s.equals(v[i].id))
				return v[i];
		return v[0];
	}

}
