public class SubscriberOddsImpl implements Subscriber {
	  private int eventsReceived = 0;
	  private int threshold = 14;
	  private PublisherImpl publisherImpl;

	public SubscriberOddsImpl(PublisherImpl publisher) {
		publisherImpl = publisher;
	}
	@Override
	public boolean notfiySubscriber(Event e) {
		if (e.getEventDataValue() % 2 == 1) {
			eventsReceived++;
			if (eventsReceived <= threshold) {
				System.out.println("SubscriberOdds: Event is odd: " + e.getEventDataValue());
				return true;
			}
			else {
				eventsReceived = 0;
				publisherImpl.unregisterSubscriber(this);
			}
		}
		return false;
	}
}
	
//	When event.getDataValue() is odd do the following
	//	Increment the count of odd events
	//	When the count is greater than the threshold do the following
		//	Print "SubscriberOdds: Event is odd: {e.getDataValue()}"
	//	When the count is equal to the threshold do the following
		//	Unregister the SubscriberOddsImpl object from the PublisherImpl object