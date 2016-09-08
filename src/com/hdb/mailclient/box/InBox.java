package com.hdb.mailclient.box;

import javax.swing.ImageIcon;


/**
 * 收件箱
 */
public class InBox extends AbstractBox {
	public String getText() {
		return "收件箱";
	}
	public ImageIcon getImageIcon() {
		return super.getImageIcon("images/in-tree.gif");
	}
}
