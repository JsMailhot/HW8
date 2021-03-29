public class SubscriberEvensImpl implements Subscriber {
	@Override
	public void notifySubscriber()
	{
		//	When event.getDataValue() is even do the following
			//	Increment the count of even events
			//	When the count is greater than the threshold do the following
				//	Print "SubscriberEvens: Event is even: {e.getDataValue()}"
			//	When the count is equal to the threshold do the following
				//	Unregister the SubscriberEvensImpl object from the PublisherImpl object
	}
}
