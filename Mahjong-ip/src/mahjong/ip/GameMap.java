package mahjong.ip;
import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GameMap{

	private Scanner scanner;
	private String map[][] = new String[4][];
	private Rectangle terrain, wall;
        
        public String[][] getMap(){
            return map;
        }

	public GameMap(){
		terrain = new Rectangle();
                wall = new Rectangle();
                /*new ImageIcon("D:/facultate/an 4 sem 1/Labirint/src/terrain.jpg").getImage();
		wall = new ImageIcon("D:/facultate/an 4 sem 1/Labirint/src/wall.jpg").getImage();*/
		readMap();
		closeMap();
	}
	
	public Rectangle getTerrain(){
		return terrain;
	}
	
	public Rectangle getWall(){
		return wall;
	}
	
	public String getMapValue(int x, int y){
		return map[x][y];
		
	}

	public void readMap(){
		/*try{
			scanner = new Scanner(new File("D:\\facultate\\an 4 sem 1\\Mahjong-ip\\map.txt"));
			} catch(Exception e){
				System.out.println("eroare deschidere fisier");
			}
		for(int i=0; i<2; i++){
                    for(int j=0; i<8; j++){
                        if(scanner.hasNext())
				map[i][j] = scanner.next();
                    }
			
		}*/
                
            File file = new File("D:\\facultate\\an 4 sem 1\\Mahjong-ip\\map.txt"); 
  
            BufferedReader br; 
            try {
                br = new BufferedReader(new FileReader(file));
                String st; 
                int i = 0;
                while ((st = br.readLine()) != null) {
                   for(int j = 0; j < st.length(); j++)
                    {
                       char c = st.charAt(j);
                    //   System.out.println(String.valueOf(c));
                       if(j==0) {
                           map[i]= new String[16];
                       }
                       map[i][j] = String.valueOf(c);
                    }
                   
                  i++;
                }
            }catch (Exception ex) {
                //Logger.getLogger(GameMap.class.getName()).log(Level.SEVERE, null, ex);
                System.err.print(ex.toString()+" exception");
                ex.printStackTrace();
            }

            
	}
	
	public void closeMap(){
		if(scanner!=null)
			scanner.close();
	}

}