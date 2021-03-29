import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class PublisherImplTest2 {

	@Test
	void test() {
		Boolean actual = true;
		PublisherImpl publisher = new PublisherImpl();
		SubscriberEvensImpl subscirberEven = new SubscriberEvensImpl(publisher);
		publisher.registerSubscriber(subscirberEven);
			assertEquals(publisher.myList.size(), 1);
			publisher.unregisterSubscriber(subscirberEven);
			assertEquals(publisher.myList.size(), 0);
	}

}