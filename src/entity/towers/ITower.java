package entity.towers;

import java.awt.Graphics2D;

/**
 * Interface defining basic functionality that any tower or tower substitute needs to be able to fulfill
 * @author Ryan Sharp
 *
 */
public interface ITower {
	/**
	 * Check whether the given ITower is the composite TowerManager
	 * @return Itself if it is the TowerManager, null otherwise.
	 */
	public TowerManager getComposite();
	
	/**
	 * Perform any updates needed between frames
	 */
	public void update();
	
	/**
	 * Update the tower's current target if needed
	 */
	public void updateTarget();
	
	/**
	 * Get the tower's fire rate delay
	 * @return fire rate
	 */
	public double getFireRate();
	
	/**
	 * Called periodically to attack the tower's current target.
	 */
	public void attack();
	
	/**
	 * Redraw the tower every frame
	 * @param g2 - {@link Graphics2D} used to draw components
	 */
	public void draw(Graphics2D g2);
}
