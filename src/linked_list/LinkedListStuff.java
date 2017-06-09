package linked_list;

public class LinkedListStuff implements LinkedListInterfaces {

	LinkedListStuffNodes first;
	

	@Override
	public void add(String x) {
		
		LinkedListStuffNodes node = new LinkedListStuffNodes();
		node.setData(x);
		LinkedListStuffNodes b;
		b = first;
		
		
		if(first==null){
			first = node;
			
		}
		else if(first != null){
			while (b.getNext() != null) {
			b = b.getNext();
		}
		b.setNext(node);
		}
		
	}
		
	

	@Override
	public void remove(int x) {
			
	}

	@Override
	public void get(int x) {
		
		
	}

	@Override
	public void print() {
		LinkedListStuffNodes b;
		b=first;
		while(b.getNext() != null){
			System.out.println(b.getData());
			b=b.getNext();
			if(b.getNext() == null){
				break;
			}
		}
			
	}
	
}
