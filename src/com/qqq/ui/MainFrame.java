package com.qqq.ui;

import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.qqq.model.Skills;
import com.qqq.utils.Tools;

public class MainFrame {
	JPanel contentPane;

	public MainFrame() {
		JFrame frame = new JFrame("main");

		ArrayList<String> data = Tools.Reader("lib/MH4SKILL.csv");
		ArrayList<Skills> skills = new ArrayList<Skills>();
		for (int i = 1; i < data.size(); i++) {
			// System.out.println(data.get(i));
			Skills skill = new Skills();
			String[] temp = data.get(i).split(",");
			skill.setName(temp[0]);
			skill.setSkill(temp[1]);
			skill.setPoint(Integer.parseInt(temp[2]));
			skill.setType(Integer.parseInt(temp[3]));
			skills.add(skill);
		}

		JPanel jp_skill = new JPanel();
		jp_skill.setLayout(new FlowLayout());
		jp_skill.setBounds(0, 0, 150, 100);
		JComboBox<Object> jcb1 = new JComboBox<Object>();
		for (Skills s : skills) {
			jcb1.addItem(s.getName());
		}
		jp_skill.add(jcb1);
		
		JComboBox<Object> jcb2 = new JComboBox<Object>();
		for (Skills s : skills) {
			jcb2.addItem(s.getName());
		}
		jp_skill.add(jcb2);


		contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.add(jp_skill);

		frame.add(contentPane);
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
}
