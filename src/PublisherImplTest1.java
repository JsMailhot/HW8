package hw8;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PublisherImplTest1 {

	@Test
	void test() {
		Boolean actual = true;
		PublisherImpl publisher = new PublisherImpl();
		SubscriberEvensImpl subscirberEven = new SubscriberEvensImpl(publisher);
		publisher.registerSubscriber(subscirberEven);
			assertEquals(publisher.myList.size(), 1);
	}

}
