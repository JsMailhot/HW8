package hw8;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.ThreadLocalRandom;

import org.junit.jupiter.api.Test;

class SubscriberEvenTest3 {

	@Test
	void test() {
		PublisherImpl publisher = new PublisherImpl();
		Boolean actual = true;
		SubscriberEvensImpl subscirberEven = new SubscriberEvensImpl(publisher);
		for (int i = 0; i < 5; i++) {
			int int_random = ThreadLocalRandom.current().nextInt();
			Event Event = new Event(int_random, i);
		actual = subscirberEven.notfiySubscriber(Event);
	}
		assertEquals(true, actual);
	}

}
