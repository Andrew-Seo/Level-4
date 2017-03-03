package battleShip;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class View extends JFrame {
	public final int dimension = 1000;
	JPanel panel = new JPanel();
	JPanel player = new JPanel();
	JPanel computer = new JPanel();
	MouseListener mouse;
	JLabel[][] playerGrid = new JLabel[10][10];
	JLabel[][] compGrid = new JLabel[10][10];

	View() {
		this.setSize(dimension, dimension);
		panel.setLayout(new GridLayout(2, 1));
		player.setLayout(new GridLayout(10, 10));
		computer.setLayout(new GridLayout(10, 10));
		player.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));

		this.add(panel);
		panel.add(computer);
		panel.add(player);
	}

	void init() {
		for (int i = 0; i < playerGrid.length; i++) {
			for (int j = 0; j < playerGrid.length; j++) {
				playerGrid[i][j] = new JLabel();
				compGrid[i][j] = new JLabel();
				player.add(playerGrid[i][j]);
				computer.add(compGrid[i][j]);
				playerGrid[i][j].setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
				compGrid[i][j].setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
			}
		}
		computer.addMouseListener(mouse);
	}

	public void drawHitPlayerShip(int x, int y) {
		playerGrid[x][y].setBackground(Color.DARK_GRAY);
		playerGrid[x][y].setOpaque(true);
	}

	public void drawHitCompShip(int x, int y) {
		compGrid[x][y].setBackground(Color.RED);
		compGrid[x][y].setOpaque(true);
	}
	public void drawPlayerShip(int x, int y) {
		compGrid[x][y].setBackground(Color.LIGHT_GRAY);
		compGrid[x][y].setOpaque(true);
	}
	public void drawCompShip(int x, int y) {
		compGrid[x][y].setBackground(Color.LIGHT_GRAY
				);
		compGrid[x][y].setOpaque(true);
	}

	public void addListener(Controller controller) {
		mouse = controller;
	}

}
