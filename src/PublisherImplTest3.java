package hw8;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.ThreadLocalRandom;

import org.junit.jupiter.api.Test;

class PublisherImplTest3 {

	@Test
	void test() {
		PublisherImpl publisher = new PublisherImpl();
		Boolean actual = false;
		SubscriberEvensImpl subscirberEven = new SubscriberEvensImpl(publisher);
			Event Event = new Event(2, 0);
			actual = subscirberEven.notfiySubscriber(Event);
		assertEquals(true, actual);
	}

}
