public class SubscriberThreesImpl implements Subscriber {
	  private int eventsReceived = 0;
	  private int threshold = 10;
	  private PublisherImpl publisherImpl;
		public SubscriberThreesImpl(PublisherImpl publisher) {
			publisherImpl = publisher;
	}
	//	When event.getDataValue() is divisible by three do the following
			//	Increment the count of divisible by three events
			//	When the count is greater than the threshold do the following
				//	Print "SubscriberThreesImpl: Event is divisible by three: {e.getDataValue()}"
			//	When the count is equal to the threshold do the following
				//	Unregister the SubscriberThreesImpl object from the PublisherImpl object
	@Override
	public boolean notfiySubscriber(Event e) {
		if (e.getEventDataValue() % 3 == 0) {
			eventsReceived++;
			if (eventsReceived <= threshold) {
				System.out.println("SubscriberThrees: Event is divisible by 3: " + e.getEventDataValue());
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