package portfolio_at_a_glance;

import java.awt.*;

import javax.swing.*;
//프로필 페이지
public class profilePage extends JFrame{
	public profilePage(){
		setTitle("한눈에 보는 포트폴리오");
		
		JPanel mauePanel = new JPanel();
		mauePanel.setBackground(new Color(102, 103, 171));
		mauePanel.setLayout(new BorderLayout(30,20));
		
		JPanel btnPanel = new JPanel();
		btnPanel.setBackground(new Color(102, 103, 171));
		btnPanel.setLayout(new BorderLayout(30,20));
		
		JButton home = new JButton("프로필");
		JButton list = new JButton("목록");
		home.setBackground(new Color(102, 103, 171));
		home.setForeground(new Color(217, 175, 217));
		list.setBackground(new Color(102, 103, 171));
		list.setForeground(Color.white);
		
		mauePanel.add(btnPanel, BorderLayout.EAST);
		btnPanel.setLayout(new BorderLayout());
		btnPanel.add(home, BorderLayout.WEST);
		btnPanel.add(list, BorderLayout.EAST);
		
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		contentPane.add(mauePanel, BorderLayout.NORTH);
		
		setSize(740, 524);
		setVisible(true);
	}

	public static void main(String[] args) {
		profilePage profile_page = new profilePage();
	}
}
