public class HW8 {
    public static void main(String... args)
    {
    	PublisherImpl publisher = new PublisherImpl();//  Create a PublisherImpl object
    	EventGenerator eventgenerator = new EventGenerator(publisher);//	Create an EventGenerator object
    	SubscriberOddsImpl subscriberOdd = new SubscriberOddsImpl(publisher);//	Create a SubscriberOdds class, which implements the Subscriber interface.
    	//	The threshold is 21
    	SubscriberEvensImpl subscirberEven = new SubscriberEvensImpl(publisher);//	Create a SubscriberEvens class, which implements the Subscriber Interface
    	//	The threshold is 14
    	SubscriberThreesImpl subscriberThrees = new SubscriberThreesImpl(publisher);//	Create a SubscriberThrees class, which implements the Subscriber Interface.
    	//	The threshold is 10.
    	
    	publisher.registerSubscriber(subscriberOdd);
    	publisher.registerSubscriber(subscirberEven);
    	publisher.registerSubscriber(subscriberThrees);//	pub.registerSubscriber() for each of the Subscriber objects created
    	eventgenerator.runSimulation();//	eventGen.runSimulation()
    	
    }
}