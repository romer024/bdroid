package com.batman.adv.ogm;

/** Model to represent OGM as seen here
* https://www.open-mesh.org/projects/batman-adv/wiki/OGM#4-Protocol-Procedure 
*/
public class OriginaMessageModel {

	String message;
	
	String destination;
	
	Long timeToLive;
	
	int sequenceNumber;
	
	int interval;
	
	public OriginaMessageModel( String message, String destination, Long timeToLive, int sequenceNumber, int interval ){
		this.message = message;
		this.destination = destination;
		this.timeToLive = timeToLive;
		this.sequenceNumber = sequenceNumber;
		this.interval = interval;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	public String getDestination() {
		return this.destination;
	}
	
	public Long getToLive() {
		return this.timeToLive;
	}
	
	public int getSequenceNumber() {
		return this.sequenceNumber;
	}
	
	public int getInterval() {
		return this.interval;
	}
}
