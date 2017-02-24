package BattleShips;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class View extends JFrame implements MouseListener {
	public final int dimension = 1000;
	JPanel panel = new JPanel();
	JPanel player = new JPanel();
	JPanel computer = new JPanel();
	JLabel[][] playerGrid = new JLabel[10][10];
	JLabel[][] compGrid = new JLabel[10][10];	

	View(){
		this.setSize(dimension, dimension);
		panel.setLayout(new GridLayout(2, 1));
		player.setLayout(new GridLayout(10, 10));
		computer.setLayout(new GridLayout(10, 10));
		player.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		
		init();
		drawPlayerShip(0, 0);
		drawCompShip(0,0);
		
		this.add(panel);
		panel.add(computer);
		panel.add(player);
	}
	
	void init(){
		for (int i = 0; i < playerGrid.length; i++) {
			for (int j = 0; j < playerGrid.length; j++) {
				playerGrid[i][j] = new JLabel();
				compGrid[i][j] = new JLabel();
				player.add(playerGrid[i][j]);
				computer.add(compGrid[i][j]);
			}
		}
	}
	
	void drawPlayerShip(int x, int y){
		playerGrid[x][y].setBackground(Color.DARK_GRAY);
		playerGrid[x][y].setOpaque(true);
	}	
	void drawCompShip(int x, int y){
		compGrid[x][y].setBackground(Color.RED);
		compGrid[x][y].setOpaque(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
}
