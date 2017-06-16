package linked_list;

public class Runner {
	public static void  main(String[] args){
		LinkedListStuff newlist = new LinkedListStuff();
		newlist.add("webb");
		newlist.add("webbs");
		newlist.add("webbz");
		newlist.add("weeb");
		newlist.add("weebs");
		newlist.add("weebz");
		
		newlist.remove(2);
		
		newlist.print();
	}
}
