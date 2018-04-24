package jpu2016.dogfight.model;

import java.util.ArrayList;

public class DogfightModel implements IDogfightModel {

	public DogfightModel() {
	}
	
	/* (non-Javadoc)
	 * @see jpu2016.dogfight.model.IDogfightModel#getArea()
	 */
	@Override
	public IArea getArea() {
		return null;
	}
	
	/* (non-Javadoc)
	 * @see jpu2016.dogfight.model.IDogfightModel#buildArea(jpu2016.dogfight.model.Dimension)
	 */
	@Override
	public void buildArea(Dimension dimension) {
	}
	
	/* (non-Javadoc)
	 * @see jpu2016.dogfight.model.IDogfightModel#addMobile(jpu2016.dogfight.model.IMobile)
	 */
	@Override
	public void addMobile(IMobile Mobile) {
	}
	
	/* (non-Javadoc)
	 * @see jpu2016.dogfight.model.IDogfightModel#removeMobile(jpu2016.dogfight.model.IMobile)
	 */
	@Override
	public void removeMobile(IMobile Mobile) {
	}
	
	/* (non-Javadoc)
	 * @see jpu2016.dogfight.model.IDogfightModel#getMobiles()
	 */
	@Override
	public ArrayList<IMobile> getMobiles(){
		return null;
	}
	
	/* (non-Javadoc)
	 * @see jpu2016.dogfight.model.IDogfightModel#getMobileByPlayer(int)
	 */
	@Override
	public IMobile getMobileByPlayer(int player) {
		return null;
	}
	
	/* (non-Javadoc)
	 * @see jpu2016.dogfight.model.IDogfightModel#setMobilesHavesMoved()
	 */
	@Override
	public void setMobilesHavesMoved() {
	}
}
