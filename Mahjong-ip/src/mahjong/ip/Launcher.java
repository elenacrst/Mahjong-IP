/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahjong.ip;

import javax.swing.JFrame;

/**
 *
 * @author elena
 */
public class Launcher {
    public static void main(String[] args){
		new Launcher();
	}
	
	public Launcher(){
            JFrame f = new JFrame();
            f.setTitle("MAHJONG");
            f.add(new Playground());
            f.setSize(600,600);
            f.setLocationRelativeTo(null);
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}
