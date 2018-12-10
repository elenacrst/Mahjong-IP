/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahjong.ip;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author elena
 */
public class Playground extends JPanel implements ActionListener{
	private static final long serialVersionUID = 1L;
	private Timer timer;
	private GameMap map;
        private int globX, globY, color;
         
	//private Personaj p;
	
	public Playground(){
		map = new GameMap();
		//p = new Personaj();
		addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyPressed(KeyEvent e) {
                        //super.keyPressed(e); //To change body of generated methods, choose Tools | Templates.
                        int key = e.getKeyCode();

                        if (key == KeyEvent.VK_LEFT) {
                            //dx = -1;
                        }

                        if (key == KeyEvent.VK_RIGHT) {
                           // dx = 1;
                        }

                        if (key == KeyEvent.VK_UP) {
                           // dy = -1;
                        }

                        if (key == KeyEvent.VK_DOWN) {
                           //dy = 1;
                        }
                    }
                    
                });
		setFocusable(true);
                addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        globX = e.getX()/20;
                        globY = e.getY()/20;
                        color = Integer.valueOf(map.getMap()[globY][globX]);
                        
                        System.out.println("clicked in map "+globX+" "+globY+" "+color);
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {
                        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {
                      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }
                });
		//timer = new Timer(10, this);
		//timer.start();
	
        }

        
	public void actionPerformed(ActionEvent e){
		repaint();
	}

	public void paint(Graphics g){
		super.paint(g);
                 for(int x=0; x<2; x++){
                    for(int y = 0; y<16; y++){
                        System.out.print(map.getMap()[x][y]+" ");  
                    }
                    System.out.println();
                 }
                for(int x=0; x<4; x++){
                    for(int y = 0; y<16; y++){
                        
                        if(map.getMap()[x][y].equals("0")){
                                g.setColor(Color.white);
                             
				g.fillRect(20*y,20*x , 20, 20);
                                g.setColor(Color.black);
                                g.drawRect(20*y,20*x , 20, 20);
                                
                           
                        }else{
                            if(map.getMap()[x][y].equals("1")){
                           
				g.setColor(Color.PINK);
				
                                
                            }else if(map.getMap()[x][y].equals("2")){
                           
				g.setColor(Color.BLUE);
				
                                
                            }else if(map.getMap()[x][y].equals("3")){
                           
				g.setColor(Color.CYAN);
				
                                
                            }else if(map.getMap()[x][y].equals("4")){
                           
				g.setColor(Color.GREEN);
				
                                
                            }
                            g.fillRect(20*y,20*x , 20, 20);
                            g.setColor(Color.black);
                            g.drawRect(20*y,20*x , 20, 20);
                        }
                    }
                }
               //System.out.println("needs map");
		//g.drawImage(p.getPersonaj(), p.getDalaX()*32, p.getDalaY()*32, null);
		
	}

}