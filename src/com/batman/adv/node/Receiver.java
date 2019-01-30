package com.batman.adv.node;

import com.batman.adv.ogm.OriginaMessageModel;

public interface Receiver {

	public void onMessageReceived( Originator originator, OriginaMessageModel ogm );
}
