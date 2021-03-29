public class SubscriberThreesImpl implements Subscriber {
	@Override
	public void notifySubscriber()
	{
		//	When event.getDataValue() is divisible by three do the following
			//	Increment the count of divisible by three events
			//	When the count is greater than the threshold do the following
				//	Print "SubscriberThreesImpl: Event is divisible by three: {e.getDataValue()}"
			//	When the count is equal to the threshold do the following
				//	Unregister the SubscriberThreesImpl object from the PublisherImpl object
	}
}
