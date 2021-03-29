public class Event {
	private int EventSequenceNumber;
	private int EventDataValue;
	
	public Event(int data, int seqNum) {
		EventSequenceNumber = seqNum;
		EventDataValue = data;
	}
	public int getEventSeqNum() {
		return EventSequenceNumber;
	}
	
	public int getEventDataValue() {
		return EventDataValue;
	}
}