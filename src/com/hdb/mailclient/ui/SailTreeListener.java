package com.hdb.mailclient.ui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * µ¼º½Ê÷¼àÌýÆ÷
 */
public class SailTreeListener extends MouseAdapter {
	private MainFrame mainFrame;
	public SailTreeListener(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
	}
	public void mousePressed(MouseEvent e) {
		mainFrame.select();
	}
}
