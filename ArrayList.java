package myArrayList;

public class ArrayList {
	private static Object[] things = new Object[]{"hi", "bye", "go", "bye"};
	private static Object[] things2 = new Object[20];
	private static int size;
	
	public static void main(String[] args) {
		Object obj = new Object();
		obj = "set";
		System.out.println(get(1).toString());
		set(obj, 1);
		System.out.println(get(1).toString());
		System.out.println(append("append"));
		System.out.println(get(4).toString());
		things2[0] = "First Spot";
		System.out.println(size());
	}
	
	public static Object get(int idx){
		for(int i = 0; i < things.length; i++){
			if(i == idx){
				return things[i];
			}		
		}
		throw new IndexOutOfBoundsException();
	}
	
	public static void set(Object obj, int idx){
		if(idx >= things.length){
			throw new IndexOutOfBoundsException();
		}
		things[idx] = obj;
	}
	
	public static int append(Object obj){
		Object [] array = new Object[things.length+1];
		for(int i = 0; i < things.length; i++){
			array[i] = things[i];
		}
		array[things.length] = obj;
			things = array;
		return things.length;
	}
	
	public static int size(){
		for(int i = 0; i < things2.length; i++){
			if(things2[i] != null){
				size ++;
			}
		}
		return size;
	}
}

