package collections_arrayslist;

public class ArraysList 
 {

	private  Object[] arr=new Object[3];
	int p=0;
	
	
	public void add(Object ele)
	{
		if(p>=arr.length) increaseCapacity();
		arr[p++]=ele;
	}
	private void increaseCapacity()
	{
		Object[] temp=new Object[arr.length+3];
		for(int i=0;i<arr.length;i++)
		{
			temp[i]=arr[i];
		}
		arr=temp;
	}
	public void add(int index,Object ele) 
	{   System.out.println("This is add with two args :--");
		 if(index>arr.length) throw new IndexOutOfBoundsException();
		 else
		 increaseCapacity();
		 /*{
			 Object[] temp=new Object[arr.length+1];
				for(int i=0;i<arr.length;i++)
				{
					temp[i]=arr[i];
				}
				arr=temp;
		 }*/
		for(int i=index;i<arr.length;i++) 
		{
			 
		Object temp=arr[i];
		arr[i]=ele;
		ele=temp;
		
		
		}
	}
	public String toString() {
		for(int i=0;i<arr.length;i++) {
			Object n=arr[i];
			System.out.println("a["+i+"]="+n);
		}
		return "These are the elements";
	}
	public void remove(int index) {
		if(index>=size()) throw new IndexOutOfBoundsException();
		
		for(int i=index;i<arr.length;i++) {
			Object temp;
			if(i<arr.length-1) {
			temp=arr[i+1];
			arr[i]=temp;
			}
		}
		Object[] temp=new Object[arr.length-1];
		for(int i=0;i<temp.length;i++)
		{
			temp[i]=arr[i];
		}
		arr=temp;
 }
	
		

	public Object get(int index)
	{   if(index>=size()) throw new IndexOutOfBoundsException();
		return arr[index];
	}
	public void clear() {
		Object[] temp=new Object[arr.length-size()];
		arr=temp;
		System.out.println("all the elements are cleared in ArraysList");
	}
	public int size() {
		return arr.length;
	}
	public static void main(String[] args) {
		ArraysList a =new ArraysList();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		System.out.println("element of the given index is :"+a.get(3));
		System.out.println("size of the ArraysList is: "+a.size());
		for(Object n:a.arr) {
			System.out.println(n);
			
		}
		System.out.println();
		a.add(0,-3);
		System.out.println(a);
		for(Object n:a.arr) 
		{
			System.out.println(n);
			
		}
		System.out.println();
		System.out.println("ArraysList size is :"+ a.size());
		
		System.out.println("remove method");
		a.remove(0);
		a.remove(0);
		for(Object n:a.arr) 
		{
			System.out.println(n);
			
		}
		System.out.println();
		a.clear();
		for(Object n:a.arr) 
		{
			System.out.println(n);
			
		}
		System.out.println("no elements present");
		
	}

}

