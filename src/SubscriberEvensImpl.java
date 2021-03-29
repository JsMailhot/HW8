public class SubscriberEvensImpl implements Subscriber {
	  private int eventsReceived = 0;
	  private int threshold = 21;
	  private PublisherImpl publisherImpl;
	
		//	When event.getDataValue() is even do the following
			//	Increment the count of even events
			//	When the count is greater than the threshold do the following
				//	Print "SubscriberEvens: Event is even: {e.getDataValue()}"
			//	When the count is equal to the threshold do the following
				//	Unregister the SubscriberEvensImpl object from the PublisherImpl object


	public SubscriberEvensImpl(PublisherImpl publisher) {
		publisherImpl = publisher;
	}

	@Override
	public void notfiySubscriber(Event e) {
		if (e.getEventDataValue() % 2 == 0) {
			eventsReceived++;
			if (eventsReceived <= threshold) {
				System.out.println("SubscriberEvens: Event is even: " + e.getEventDataValue());
			}
			if (eventsReceived == threshold) {
				publisherImpl.unregisterSubscriber(this);
			}
			
		}
	}

}