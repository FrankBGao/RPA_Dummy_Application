package Dummy;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class Frame {

	private JFrame frmJavaDa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame window = new Frame();
					window.frmJavaDa.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJavaDa = new JFrame();
		frmJavaDa.setTitle("Java DA");
		frmJavaDa.setBounds(100, 100, 350, 537);
		frmJavaDa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmJavaDa.setJMenuBar(menuBar);
		
		JMenu mnFirst = new JMenu("First");
		menuBar.add(mnFirst);
		JMenuItem mnFirst_a = new JMenuItem("F1");
		mnFirst.add(mnFirst_a);
		JMenuItem mnFirst_b = new JMenuItem("F2");
		mnFirst.add(mnFirst_b);
		JMenuItem mnFirst_c = new JMenuItem("F3");
		mnFirst.add(mnFirst_c);
		
		JMenu mnSecond = new JMenu("Second");
		menuBar.add(mnSecond);
		
		JMenuItem mntmS = new JMenuItem("S1");
		mnSecond.add(mntmS);
		
		JMenuItem mntmS_1 = new JMenuItem("S2");
		mnSecond.add(mntmS_1);
		
		JMenuItem mntmS_2 = new JMenuItem("S3");
		mnSecond.add(mntmS_2);
		
		JMenu mnThird = new JMenu("Third");
		menuBar.add(mnThird);
		
		JMenuItem mntmT = new JMenuItem("T1");
		mnThird.add(mntmT);
		
		JMenuItem mntmT_1 = new JMenuItem("T2");
		mnThird.add(mntmT_1);
		
		JMenuItem mntmT_2 = new JMenuItem("T3");
		mnThird.add(mntmT_2);
		frmJavaDa.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CheckBox");
		lblNewLabel.setBounds(10, 11, 70, 14);
		frmJavaDa.getContentPane().add(lblNewLabel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("CB1");
		chckbxNewCheckBox.setBounds(75, 7, 87, 23);
		frmJavaDa.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("CB2");
		chckbxNewCheckBox_1.setBounds(175, 7, 97, 23);
		frmJavaDa.getContentPane().add(chckbxNewCheckBox_1);
		
		JLabel lblNewLabel_1 = new JLabel("RadioButton");
		lblNewLabel_1.setBounds(10, 36, 70, 14);
		frmJavaDa.getContentPane().add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("RB1");
		rdbtnNewRadioButton.setBounds(75, 32, 99, 23);
		frmJavaDa.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("RB2");
		rdbtnNewRadioButton_1.setBounds(175, 32, 109, 23);
		frmJavaDa.getContentPane().add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("TextArea1");
		lblNewLabel_2.setBounds(10, 68, 51, 14);
		frmJavaDa.getContentPane().add(lblNewLabel_2);
		
		JTextArea txtrTa = new JTextArea();
		txtrTa.setText("TA1");
		txtrTa.setBounds(75, 68, 197, 55);
		frmJavaDa.getContentPane().add(txtrTa);
		
		JTextArea txtrTa_1 = new JTextArea();
		txtrTa_1.setText("TA2");
		txtrTa_1.setBounds(75, 143, 197, 55);
		frmJavaDa.getContentPane().add(txtrTa_1);
		
		JLabel lblNewLabel_3 = new JLabel("TextArea2");
		lblNewLabel_3.setBounds(10, 143, 58, 14);
		frmJavaDa.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("ComboBox1");
		lblNewLabel_4.setBounds(10, 222, 70, 14);
		frmJavaDa.getContentPane().add(lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(98, 219, 164, 20);
		comboBox.addItem("comboBox1_A");
		comboBox.addItem("comboBox1_B");
		comboBox.addItem("comboBox1_C");
		comboBox.addItem("comboBox1_D");
		frmJavaDa.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_5 = new JLabel("ComboBox2");
		lblNewLabel_5.setBounds(10, 266, 70, 14);
		frmJavaDa.getContentPane().add(lblNewLabel_5);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(98, 263, 164, 20);
		comboBox_1.addItem("comboBox2_A");
		comboBox_1.addItem("comboBox2_B");
		comboBox_1.addItem("comboBox2_C");
		comboBox_1.addItem("comboBox2_D");
		frmJavaDa.getContentPane().add(comboBox_1);
		
		JButton btnButton = new JButton("button1");
		btnButton.setBounds(10, 342, 89, 23);
		frmJavaDa.getContentPane().add(btnButton);
		
		JButton btnButton_1 = new JButton("button2");
		btnButton_1.setBounds(124, 342, 89, 23);
		frmJavaDa.getContentPane().add(btnButton_1);
		
		
		




	
	}
}
