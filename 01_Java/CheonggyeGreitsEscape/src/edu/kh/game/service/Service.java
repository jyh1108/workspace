package edu.kh.game.service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import edu.kh.game.dto.Player;

public class Service {

private List<Player>PlayerList = new LinkedList<>();
	
	public Service() {
		PlayerList.add(new Player("홍길동",5,1,1,3,7,null,null,null,null,null));
		PlayerList.add(new Player("붕대",1,1,1,1,1,"붕대",null,null,null,null));
	}

	/**
	 * @return
	 */
	public List<Player> playerSelect(String name) {
		
		List<Player> list2 = new ArrayList<Player>();
		
		for (Player s : PlayerList) {
			if(s.getName().equals(name)) list2.add(s);
			
		}
		return list2;
	}
}
