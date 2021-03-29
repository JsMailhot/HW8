import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class SubscriberEvensTest1 {

	@Test
	void test() {
		PublisherImpl publisher = new PublisherImpl();
		Boolean actual = true;
		SubscriberEvensImpl subscirberEven = new SubscriberEvensImpl(publisher);
		for (int i = 0; i < 22; i++) {
			Event Event = new Event(2, 0);
			actual = subscirberEven.notfiySubscriber(Event);
	}
		assertEquals(false, actual);
	}
}
