package jpu2016.dogfight.controller;

public class UserOrder implements IUserOrder {
	private int player;

	/* (non-Javadoc)
	 * @see jpu2016.dogfight.controller.IUserOrder#getPlayer()
	 */
	@Override
	public int getPlayer() {
		return player;
	}
	/* (non-Javadoc)
	 * @see jpu2016.dogfight.controller.IUserOrder#getOrder()
	 */
	@Override
	public Order getOrder(){
		return this.getOrder();
	}
	
	public UserOrder(int player, Order order){
		
	}
}
