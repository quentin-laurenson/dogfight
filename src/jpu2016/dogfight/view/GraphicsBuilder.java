package jpu2016.dogfight.view;

import java.awt.Graphics;
import java.awt.image.ImageObserver;

import jpu2016.dogfight.gameframe.IGraphicsBuilder;
import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.model.IMobile;

public class GraphicsBuilder implements IGraphicsBuilder {
	public GraphicsBuilder(IDogfightModel dogfightModel) {

	}

	@Override
	public void applyModelToGraphic(Graphics graphics, ImageObserver observer) {

	}

	private void buildEmptySky() {

	}

	private void drawMobile(IMobile mobile, Graphics graphics, ImageObserver observer) {

	}

	/* (non-Javadoc)
	 * @see jpu2016.dogfight.view.IGraphicsBuilder#getGlobalHeight()
	 */
	@Override
	public int getGlobalHeight() {
		return 1;
	}

	/* (non-Javadoc)
	 * @see jpu2016.dogfight.view.IGraphicsBuilder#getGlobalWidth()
	 */
	@Override
	public int getGlobalWidth() {
		return 1;
	}
}
