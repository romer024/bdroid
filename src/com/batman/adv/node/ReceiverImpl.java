package com.batman.adv.node;

import com.batman.adv.ogm.OriginaMessageModel;
import com.batman.adv.utils.NodeUtils;

public class ReceiverImpl implements Receiver {
	
	@Override
	public void onMessageReceived(Originator originator, OriginaMessageModel ogm) {
		if ( !NodeUtils.getLocalIp().equals(ogm.getDestination() ) )
			originator.broadcastMessage(ogm);
	}

}
