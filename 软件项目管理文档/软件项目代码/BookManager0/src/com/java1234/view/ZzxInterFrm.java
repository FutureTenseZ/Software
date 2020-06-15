package com.java1234.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;

public class ZzxInterFrm extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ZzxInterFrm frame = new ZzxInterFrm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ZzxInterFrm() {
		setClosable(true);
		setIconifiable(true);
		getContentPane().setBackground(Color.GRAY);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ZzxInterFrm.class.getResource("/images/o_1d7ef9coa1p241u5s17sa18qqr041o.jpg")));
		getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		setBounds(100, 100, 1429, 928);

	}

}
