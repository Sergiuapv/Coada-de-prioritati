import java.io.*;
import java.util.Scanner;

public class Pasagersingur extends Pasager {

	public Pasagersingur() {
		// TODO Auto-generated constructor stub
	}
	public Pasagersingur(String s) {
		super(s);
	}

	public Pasagersingur(String nume, int age, String tipbilet,
			boolean imbPrioritara, boolean nevoiSpeciale) {
		super();
		this.nume = nume;
		this.age = age;
		this.tipbilet = tipbilet;
		this.imbPrioritara = imbPrioritara;
		this.nevoiSpeciale = nevoiSpeciale;
	}
	 public void add(Pasagersingur p)
		{
		 this.nume = p.nume;
			this.age = p.age;
			this.tipbilet = p.tipbilet;
			this.imbPrioritara = p.imbPrioritara;
			this.nevoiSpeciale = p.nevoiSpeciale;
		}
	
	public String nume;
	public int age;
	public String tipbilet;
	public boolean imbPrioritara;
	public boolean nevoiSpeciale;
	public String getNume() {
		return nume;
	}
	
	public int getpriority()
	{
		int p=0;
		if(this.age<2)
			p=p+20;
		else if(this.age < 5)
			p=p+10;
		else
			if(this.age<10)
				p=p+5;
		if(this.age>=60)
			p=p+15;
		if(this.tipbilet.equals("b"))
			p=p+35;
		if(this.tipbilet.equals("p"))
			p=p+20; 
		if(this.imbPrioritara==true)
			p=p+30;
		if(this.nevoiSpeciale==true)
			p=p+100;
		return p;
	}


}
