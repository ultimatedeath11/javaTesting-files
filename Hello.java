import java.awt.*;
import java.awt.event.*;
//import sun.java2d.*;
import javax.swing.*;


public class Hello extends JFrame{
	public static final int CANVAS_WIDTH = 200;
	public static final int CANVAS_HEIGHT = 200;

	private int x1 = CANVAS_WIDTH / 2;
	private int y1 = CANVAS_HEIGHT / 8;
	private int x2 = x1;
	private int y2 = CANVAS_HEIGHT / 2 * 7;

	private DrawCanvas canvas;

	public static void main(String[ ] args){
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run(){
				new Hello();
			}
		});
	}

	public Hello(){

		canvas = new DrawCanvas();
		canvas.setPreferredSize(new Dimension(CANVAS_WIDTH,CANVAS_HEIGHT));

		Container cp = getContentPane();
		cp.add(canvas);

		JPanel btnPanel = new JPanel(new FlowLayout());
		JButton btnLeft = new JButton("Move Left ");
		JButton btnRight = new JButton("Move Right ");

		btnPanel.add(btnLeft);
		btnLeft.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				x1 -= 10;
				x2 -= 10;
				canvas.repaint();
				requestFocus();
			}
		});

		addKeyListener(new KeyAdapter(){
			@Override
			public void keyPressed(KeyEvent evt){
				switch(evt.getKeyCode()){
					case KeyEvent.VK_LEFT:
						x1 -= 10;
						x2 -= 10;
						repaint();
					break;
					case KeyEvent.VK_RIGHT:
						x1+=10;
						x2+=10;
						repaint();
					break;
				}
			}
		});


		btnPanel.add(btnRight);
		btnRight.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				x1 += 10;
				x2 += 10;
				canvas.repaint();
				requestFocus();
			}
		});

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setTitle(".....");
		setVisible(true);

	}

	private class DrawCanvas extends JPanel {
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			setBackground(Color.BLACK);

			g.setColor(Color.white);
			g.drawLine(x1,y1,x2,y2);
		}
	}



}
