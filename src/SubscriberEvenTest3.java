import static org.junit.Assert.assertEquals;
import java.util.concurrent.ThreadLocalRandom;

import org.junit.jupiter.api.Test;

class SubscriberEvenTest3 {

	@Test
	void test() {
		PublisherImpl publisher = new PublisherImpl();
		Boolean actual = false;
		SubscriberEvensImpl subscirberEven = new SubscriberEvensImpl(publisher);
		for (int i = 0; i < 5; i++) {
			Event Event = new Event(2, 0);
		actual = subscirberEven.notfiySubscriber(Event);
	}
		assertEquals(true, actual);
	}

}