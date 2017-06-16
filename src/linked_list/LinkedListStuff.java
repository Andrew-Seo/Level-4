package linked_list;

public class LinkedListStuff implements LinkedListInterfaces {

	LinkedListStuffNodes first;
	LinkedListStuffNodes before;
	LinkedListStuffNodes after;

	@Override
	public void add(String x) {
		LinkedListStuffNodes node = new LinkedListStuffNodes();
		node.setData(x);
		LinkedListStuffNodes b;
		b = first;

		if (first == null) {
			first = node;

		} else {
			while (b.getNext() != null) {
				b = b.getNext();
			}
			b.setNext(node);
		}

	}

	@Override
	public void remove(int x) {
		LinkedListStuffNodes b;
		b = first;

		for (int i = 1; i < x; i++) {
			if (i == x - 1) {
				before = b;
			}

			else if (i == x) {
				after = b.getNext();
				if (after == b.getNext()) {
					before.setNext(after);
					b = b.getNext();
				}
			}
		}
	}

	@Override
	public void get(int x) {

	}

	@Override
	public void print() {
		LinkedListStuffNodes b;
		b = first;
		while (b.getNext() != null) {
			System.out.println(b.getData());
			b = b.getNext();
			if (b.getNext() == null) {
				System.out.println(b.getData());
			}
		}

	}

}
