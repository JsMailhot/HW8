import java.util.ArrayList;

public class PublisherImpl implements PublisherInterface {
	private ArrayList<Subscriber> myList = new ArrayList<Subscriber>();
	 public PublisherImpl() {

	  }
	 public ArrayList<Subscriber> getSubscriberList() {
		 return myList;
	 }

	@Override
	public void notifySubscribers(Event e) {
		for (int i = 0; i < myList.size() - 1; i++) {
			myList.get(i).notfiySubscriber(e);
		}
		
	}

	@Override
	public void registerSubscriber(Subscriber s) {
		myList.add(s);
		
	}

	@Override
	public void unregisterSubscriber(Subscriber s) {
		myList.remove(s);
	}

}