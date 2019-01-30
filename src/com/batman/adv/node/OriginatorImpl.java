package com.batman.adv.node;

import java.util.List;

import com.batman.adv.ogm.OriginaMessageModel;
import com.batman.adv.utils.NodeUtils;

public class OriginatorImpl implements Originator {

	@Override
	public void broadcastMessage(OriginaMessageModel ogm) {		
		List<String> neighbors = NodeUtils.getNeighbors();
		for ( String neighbor : neighbors ) {
			sendMessage(ogm, neighbor);
		}
	}
	
	private void sendMessage( OriginaMessageModel ogm, String neighbor ) {
		//TODO does the actual sending of message
	}
}
