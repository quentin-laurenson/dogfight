package jpu2016.dogfight.view;

import java.awt.event.KeyEvent;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.controller.UserOrder;
import jpu2016.dogfight.gameframe.IEventPerformer;

public class EventPerformer implements IEventPerformer {
	public EventPerformer(IOrderPerformer orderPerformer) {

	}

	@Override
	public void eventPerform(KeyEvent keyCode) {

	}

	private UserOrder keyCodeToUserOrder(int keyCode) {
		return null;

	}
}
