public class SubscriberOddsImpl implements Subscriber {
	@Override
	public void notifySubscriber()
	{
		//	When event.getDataValue() is odd do the following
			//	Increment the count of odd events
			//	When the count is greater than the threshold do the following
				//	Print "SubscriberOdds: Event is odd: {e.getDataValue()}"
			//	When the count is equal to the threshold do the following
				//	Unregister the SubscriberOddsImpl object from the PublisherImpl object
	}
}
