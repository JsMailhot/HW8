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
		ArrayList<Subscriber> myTemp = (ArrayList<Subscriber>) myList.clone();
		for (Subscriber subscriber : myTemp) {
			if(!myList.contains(subscriber)) {
				myList.add(subscriber);
			}
			myList.get(myTemp.indexOf(subscriber)).notfiySubscriber(e);
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