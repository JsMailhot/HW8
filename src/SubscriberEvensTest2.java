import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import org.junit.jupiter.api.Test;

class SubscriberEvensTest2 {

	@Test
	void test() {
			PublisherImpl publisher = new PublisherImpl();
			Boolean actual = true;
			Event Event = null;
			SubscriberEvensImpl subscirberEven = new SubscriberEvensImpl(publisher);
			for (int i = 0; i < 40; i++) {
				if (!publisher.myList.contains(subscirberEven)) {
					publisher.registerSubscriber(subscirberEven);
				}
				int int_random = ThreadLocalRandom.current().nextInt();
				Event = new Event(int_random, i);
			actual = subscirberEven.notfiySubscriber(Event);
		}
			if (Event.getEventDataValue() % 2 == 0) {
				assertEquals(true, actual);
			}
			else {
				assertEquals(false, actual);
			}
			
		}
		
		
		
	}