 package linked_list;

public class LinkedListStuffNodes {
	String data;
	LinkedListStuffNodes next;
	
	void setData(String data){
		this.data=data;
	}
	
	String getData(){
		return data;
	}
	void setNext(LinkedListStuffNodes nodes){
		next=nodes;
	}
	LinkedListStuffNodes getNext(){
		return next;
	}
}
