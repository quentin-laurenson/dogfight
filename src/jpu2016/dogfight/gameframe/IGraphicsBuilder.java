package jpu2016.dogfight.gameframe;

import java.awt.image.ImageObserver;

public interface IGraphicsBuilder {

	void applyModelToGraphic(Graphics graphics, ImageObserver observer);

	int getGlobalHeight();

	int getGlobalWidth();

}