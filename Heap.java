import java.io.*;
import java.util.StringTokenizer; 

public class Heap {

	public Heap(int n) {
		// TODO Auto-generated constructor stub
		Pasager o=new Pasager(9999,"prioritatemaxima");
		hip=new Pasager[n];
		hip[0]=o;
	}
	public Pasager[] hip;
	public int size;
	public int parent(int pos)
	{
		return pos/2;
	}
	public int leftChild(int pos)
	{
		return 2*pos;
	}
	public int rightChild(int pos)
	{
		return (2*pos+1);
	}
	public boolean isLeaf(int pos)
	{	if(hip[rightChild(pos)]==null && hip[leftChild(pos)]==null)
		return true;

		return false;
	}
	public boolean isLeaf1(int pos)
	{
		if(hip[rightChild(pos)]==null && hip[leftChild(pos)]==null)
			return true;
		return false;
	}
			
	public void swap(int fpos,int spos)
	{
		Pasager tmp;
		tmp=hip[fpos];
		hip[fpos]=hip[spos];
		hip[spos]=tmp;
	}
	public void maxHeapify1(int pos)
	{
		if(isLeaf(pos))
			return;
		
		if(hip[pos].getpriority()<hip[leftChild(pos)].getpriority() || 
				hip[pos].getpriority()<hip[rightChild(pos)].getpriority())
		{
			if(hip[leftChild(pos)].getpriority() > hip[rightChild(pos)].getpriority())
			{
				swap(pos,leftChild(pos));
				maxHeapify(leftChild(pos));
			}
			else
			{
				swap(pos,rightChild(pos));
				maxHeapify(rightChild(pos));
			}
		}
	}
	public void maxHeapify(int pos)
	{
		if(hip[pos]==null)
			return;
		if(hip[rightChild(pos)]==null && hip[leftChild(pos)]!=null)
			if(hip[leftChild(pos)].getpriority() > hip[pos].getpriority())
		{
			swap(pos,leftChild(pos));
			maxHeapify(leftChild(pos));
		}
		if(hip[leftChild(pos)]==null && hip[rightChild(pos)]!=null)
			if(hip[rightChild(pos)].getpriority() > hip[pos].getpriority())
			{
				swap(pos,rightChild(pos));
				maxHeapify(rightChild(pos));
			}
		
		if(hip[leftChild(pos)]!=null && hip[rightChild(pos)]!=null)
			if(hip[leftChild(pos)].getpriority() >= hip[rightChild(pos)].getpriority())
				{
				if(hip[leftChild(pos)].getpriority() > hip[pos].getpriority())
			{
				swap(pos,leftChild(pos));
				maxHeapify(leftChild(pos));
			}
				}
		
			else
			{if(hip[rightChild(pos)].getpriority() > hip[pos].getpriority())
			{
				swap(pos,rightChild(pos));
				maxHeapify(rightChild(pos));
			}
			}
			
	}
	public void insert(Pasager b,int priority)
	{
		b.prior=priority;
		size++;
		insert1(b);
		
	}
	public void insert1(Pasager b)
	{
		hip[this.size]=b;
		int current=size;
	
		while(hip[current].getpriority()>hip[parent(current)].getpriority())
		{	
			swap(current,parent(current));
			current= parent(current);
		}
		
	
	}
	public void print() 
    { 
        for (int i = 1; i <= size / 2; i++) { 
        	if(hip[2*i]!=null && hip[2*i+1]!=null)
            System.out.print(" PARENT : " + hip[i].id + " "+ hip[i].getpriority()+" LEFT CHILD : " + 
                      hip[2 * i].id +" "+ hip[2*i].getpriority()+ " RIGHT CHILD :" + hip[2 * i + 1].id+" "+ hip[2*i+1].getpriority()); 
            System.out.println(); 
        } 
    }
	 public void extractMax() 
	    { 
	        Pasager popped = hip[1]; 
	        hip[1] = hip[size]; 
	        hip[size]=null;
	        size--;
	        maxHeapify(1); 
	     
	    } 
	 public int k;
	 public void List()
	 {		
		 k++;
		 
		 if(k==1)
			 preOrder(1,0);
		 else
			 {System.out.println();
			 preOrder(1,0);
			 }
	 }
	
	 
	 
	 public void preOrder(int index,int ok)  {
		 
		
		    if (index >size) {
		        return;
		    }		   
		    if(ok==0)	
		    {
		    	String str = hip[index].id;
		        System.out.print(str);
		    ok=1;
		    }
		    else 
		    {	
		    	String str =" "+hip[index].id;
		       
		    	System.out.print(str);
		    }
		    	
		    preOrder((2 * index),ok);
		    preOrder((2 * index)+1,ok);
		   
		 }
	 public void modificasize()
	 {
		 size=999;
		 getsize();
	 }
	 public void getsize()
	 {
		 System.out.println(this.size);
	 }
	 
	 

	
	
	
	
}
