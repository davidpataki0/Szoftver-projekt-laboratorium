package graphic;


import java.awt.event.MouseEvent;

import javax.swing.event.MouseInputListener;

public class ControlInput implements MouseInputListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		 MouseInfo.getPointerInfo().getLocation().x - XYZ.getLocationOnScreen().x
		 MouseInfo.getPointerInfo().getLocation().y - XYZ.getLocationOnScreen().y
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



}
