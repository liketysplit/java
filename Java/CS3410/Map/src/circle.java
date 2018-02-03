//Rick Boles
//Course: CS3410
//Semester: Fall 2017 and
//Assignment: Extra Credit Program
//GUI

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class circle extends JPanel {

	private int width,height;
	private int x = 225;
	private int y = 100;
	private char[] names = {'A','B','C','D','E','F','G'};
	private int a[][];
	private int locations[] ={x,y-75,
							  x-75,y-38,
							  x-75,y+38,
							  x,y+75,
							  x+75,y+38,
							  x+75,y-38,
							  x-30,y};

	private boolean[] drawNode = {false,false,false,false,false,false,false};

	public circle(int width, int height, int a[][]){
		this.height = height;
		this.width = width;
		this.a = a;

	}

	public char getChar(int i){
		return names[i];
	}

    public Dimension getPreferredSize() {
        return new Dimension(500,300);
    }
	public void paintComponent(Graphics g){

		super.paintComponent(g);

		for(int i = 0; i < 7; i++){
			for(int j = 0; j < 7; j++){
				if(a[j][i]==1)
					drawNode[i] = true;
					//System.out.println(a[j][i]);
			}
		}
		int count =0;
		int tx;
		int ty;
		count = 0;

		int count2 =0;
		for(int i = 0; i < 7; i++){
			tx = locations[count];
			ty = locations[count+1];
			count2= 0;
			for(int j = 0; j < 7; j++){

				if(a[i][j]!=-1 && a[i][j] == 1){
						g.setColor(Color.BLACK);
						g.drawLine(tx+12, ty+12, locations[count2]+12, locations[count2+1]+12);
				}
				count2+=2;
			}
			count+=2;
		}
		count =0;
		for(int i=0;i<7;i++){
			if(drawNode[i]){
			g.setColor(Color.BLACK);
			g.drawOval(locations[count], locations[count+1], width, height);
			g.fillOval(locations[count], locations[count+1], width, height);
			g.setColor(Color.WHITE);
			g.drawChars(names, i, 1, locations[count]+12, locations[count+1]+12);
			}
			else if (drawNode[i]){
				g.setColor(Color.WHITE);
				g.drawOval(locations[count], locations[count+1], width, height);
				g.fillOval(locations[count], locations[count+1], width, height);
			}
			count+=2;
		}
	}

}
