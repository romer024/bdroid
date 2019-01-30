package com.batman.adv.node;

import com.batman.adv.ogm.OriginaMessageModel;

public interface Originator {
	
	public void broadcastMessage ( OriginaMessageModel ogm );

}
