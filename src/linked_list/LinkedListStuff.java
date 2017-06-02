package linked_list;

public class LinkedListStuff implements LinkedListInterfaces {

	LinkedListStuffNodes first;
	LinkedListStuffNodes b;
	
	@Override
	public void add(LinkedListStuffNodes node) {
		
		if(first == null){
			first = node;
		}
		else{
		while(b.getNext() == null){
			b.setNext(node);
		}}
		
	}

	@Override
	public void remove(int x) {
			
	}

	@Override
	public void get(int x) {
		
		
	}

	@Override
	public void print(LinkedListStuffNodes nodes) {
		
		
	}
	
}
