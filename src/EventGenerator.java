import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class EventGenerator {
		//private List <Subscriber> myList;
		private PublisherImpl publisherImpl;
		public EventGenerator(PublisherImpl publisher) {
			publisherImpl = publisher;
			
		}
		public void runSimulation() {
			ArrayList<Subscriber> listSubscriber = (ArrayList<Subscriber>) publisherImpl.getSubscriberList().clone();
			int i;
			for (i = 0; i < 200; i++) {
				Event event = generateEvent(i);
				System.out.printf("Sequence Number: %d eventDataValue: %d\n", i,event.getEventDataValue());
				//for (Subscriber s : myList) {
					//s.notfiySubscriber(event); }
				publisherImpl.notifySubscribers(event);
				ArrayList<Subscriber> tempList = (ArrayList<Subscriber>) listSubscriber.clone();
				for (Subscriber s : tempList) {
					if (i % 40 == 0) {
//						Subscriber tempSub = listSubscriber.get(tempList.indexOf(s));
						publisherImpl.unregisterSubscriber(listSubscriber.get(tempList.indexOf(s)));
						publisherImpl.registerSubscriber(listSubscriber.get(tempList.indexOf(s)));
					}
				}
			}
		}
			
		private Event generateEvent(int i) {
			int int_random = ThreadLocalRandom.current().nextInt();
			Event Event = new Event(int_random, i);
			return Event;
			
			
		}
		//	Create a number of random numbers
		//	Notify all subscribers of the generated number
		//	Each subscriber will receive each notification
		//	Each subscriber will only respond to events that they care about
		//	Perform 200 iterations of numbers
		//	Print the sequence and data to console
		//	Create Event object with random number for eventDataValue
		//	Sequence number will evaluate to the previous sequence number + 1
		//	First sequence number is 0
		//	When EventSequenceNumber is divisible by 40 re-register all subscribers
}