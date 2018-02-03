//Rick Boles
//Course: CS3410
//Semester: Fall 2017 and
//Assignment: Extra Credit Program
//GUI

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class map implements ActionListener  {

	String[] nodes = { "A", "B", "C", "D", "E", "F", "G" };
	int[][] map = {
			   {-1,1,1,0,1,1,1}, //A
			   {1,-1,1,0,0,0,0}, //B
			   {1,1,-1,1,1,0,1}, //C
			   {0,0,1,-1,1,0,1}, //D
			   {1,0,1,1,-1,1,1}, //E
			   {1,0,0,0,1,-1,1}, //F
			   {1,0,1,1,1,1,-1}  //G
			   };
	public int target1, target2, target3;

	JFrame window = new JFrame("Map");
	JButton drop = new JButton("Drop Edge");
	JButton add = new JButton("Add Edge");
	JButton deg = new JButton("Degrees");
	JButton adj = new JButton("Adjacencies");

	JComboBox Box1 = new JComboBox(nodes);
	JComboBox Box2 = new JComboBox(nodes);
	JComboBox Box3 = new JComboBox(nodes);

	JButton[] buttons = {drop,add,deg,adj};
	JComboBox[] boxes = {Box1,Box2,Box3};

	circle leftPane =  new circle(25,25,map);
	JPanel rightPane = new JPanel();

	JPanel rightPaneBottom = new JPanel();
	JPanel rightPaneTop = new JPanel();

	JPanel rightPaneRow1 = new JPanel();
	JPanel rightPaneRow2 = new JPanel();
	JPanel rightPaneRow3 = new JPanel();
	JPanel rightPaneRow4 = new JPanel();

	JLabel title1 = new JLabel("Modify Edge:");
	JLabel title2 = new JLabel("Display:");
	JLabel title3 = new JLabel("");

	Color white = new Color(255, 255, 255);
	Color black = new Color(0, 0, 0);



	public map() {
		for(int i =0; i< boxes.length; i++){
			boxes[i].addActionListener(this);
		}

		for(int i =0; i<buttons.length; i++){
				buttons[i].addActionListener(this);
		}

		setup();
	}
	public void setup(){
		window.setSize(1000, 300);
		window.setVisible(true);
		window.setLayout(new GridLayout(1, 2));
		window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		rightPaneBottom.setBorder(new EmptyBorder(10, 10, 10, 10));
		rightPaneTop.setBorder(new EmptyBorder(10, 10, 10, 10));
		rightPane.setBorder(new EmptyBorder(10, 10, 10, 10));



		leftPane.setBackground(white);

		rightPane.setLayout(new GridLayout(2, 1));
		rightPaneTop.setLayout(new GridLayout(2, 1));
		rightPaneBottom.setLayout(new GridLayout(2, 1));
		rightPaneRow1.setLayout(new GridLayout(1,3,5,5));
		rightPaneRow2.setLayout(new GridLayout(1,3,5,5));
		rightPaneRow3.setLayout(new GridLayout(1,3,5,5));
		rightPaneRow4.setLayout(new GridLayout(1,3,5,5));

		rightPaneRow1.setBorder(new EmptyBorder(10, 10, 10, 10));
		rightPaneRow1.add(title1);
		rightPaneRow1.add(boxes[0]);
		rightPaneRow1.add(boxes[1]);

		rightPaneRow2.setBorder(new EmptyBorder(10, 10, 10, 10));
		rightPaneRow2.add(title2);
		rightPaneRow2.add(buttons[0]);
		rightPaneRow2.add(buttons[1]);

		rightPaneRow3.setBorder(new EmptyBorder(10, 10, 10, 10));
		rightPaneRow3.add(title2);
		rightPaneRow3.add(boxes[2]);
		rightPaneRow3.add(title3);

		rightPaneRow4.setBorder(new EmptyBorder(10, 10, 10, 10));
		rightPaneRow4.add(title3);
		rightPaneRow4.add(buttons[2]);
		rightPaneRow4.add(buttons[3]);

		rightPaneTop.add(rightPaneRow1);
		rightPaneTop.add(rightPaneRow2);
		rightPaneBottom.add(rightPaneRow3);
		rightPaneBottom.add(rightPaneRow4);

		rightPane.add(rightPaneTop);
		rightPane.add(rightPaneBottom);

		window.add(leftPane);
		window.add(rightPane);

	}

	public void actionPerformed(ActionEvent a) {


		if (a.getSource() == drop)
			dropEdge();
		else if (a.getSource() == add)
			addEdge();
		else if (a.getSource() == deg)
			getDeg();
		else if (a.getSource() == adj)
			getAdj();
		else if (a.getSource() == Box1){
			String temp = (String) Box1.getSelectedItem();
			switch(temp){
				case "A": target1 = 0;
				break;
				case "B": target1 = 1;
				break;
				case "C": target1 = 2;
				break;
				case "D": target1 = 3;
				break;
				case "E": target1 = 4;
				break;
				case "F": target1 = 5;
				break;
				case "G": target1 = 6;
				break;

			}

		}

		else if (a.getSource() == Box2){
			String temp = (String) Box2.getSelectedItem();
			switch(temp){
				case "A": target2 = 0;
				break;
				case "B": target2 = 1;
				break;
				case "C": target2 = 2;
				break;
				case "D": target2 = 3;
				break;
				case "E": target2 = 4;
				break;
				case "F": target2 = 5;
				break;
				case "G": target2 = 6;
				break;

			}

		}

		else if (a.getSource() == Box3){
			String temp = (String) Box3.getSelectedItem();
			switch(temp){
				case "A": target3 = 0;
				break;
				case "B": target3 = 1;
				break;
				case "C": target3 = 2;
				break;
				case "D": target3 = 3;
				break;
				case "E": target3 = 4;
				break;
				case "F": target3 = 5;
				break;
				case "G": target3 = 6;
				break;

			}

		}

	}

	public void getDeg(){
		int temp=0;
		for(int i=0;i < map.length;i++){
			if(map[target3][i]==1)
				temp++;
		}

		JOptionPane.showMessageDialog(null, "The Degree of this node is: " + temp);
	}

	public void getAdj(){
		String temp = "";
		for(int i=0;i < map.length;i++){
			if(map[target3][i]==1){
				if(temp.equals(""))
					temp+=nodes[i];
				else{
					temp+=", ";
					temp+=nodes[i];
				}
			}

		}
		//if(temp.length()<1)
		JOptionPane.showMessageDialog(null, "The Adjacent nodes are: " + temp);

	};

	public void addEdge(){
		if( map[target1][target2] ==-1)
			JOptionPane.showMessageDialog(null, "You cannot add an edge to itself!");
		else if(map[target1][target2] ==1 && map[target2][target1] ==1)
			JOptionPane.showMessageDialog(null, "There is already an Edge Here Nothing Added!");
		else {
			map[target1][target2] = 1;
			map[target2][target1] = 1;
			leftPane.removeAll();

			leftPane.updateUI();
			window.getContentPane().removeAll();
			window.revalidate();
			window.repaint();
			setup();
			JOptionPane.showMessageDialog(null, "Edge Was Added!");
		}


	}

	public void dropEdge(){
		if(map[target1][target2] == -1)
			JOptionPane.showMessageDialog(null, "You cannot drop an edge to itself!");
		else if(map[target1][target2] ==0 && map[target2][target1] ==0)
			JOptionPane.showMessageDialog(null, "There is no Edge to drop!");
		else {
			map[target1][target2] = 0;
			map[target2][target1] = 0;

			leftPane.updateUI();
			window.getContentPane().removeAll();
			window.revalidate();
			window.repaint();
			setup();
			JOptionPane.showMessageDialog(null, "Edge Was Dropped!");
		}

	}



	public static void main(String[] args) {
		new map();
	}
}
