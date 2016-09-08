package com.hdb.mailclient.box;

import javax.swing.ImageIcon;

/**
 * 已经成功发送的邮件
 */
public class SentBox extends AbstractBox {

	@Override
	public String getText() {
		return "已发送";
	}
	
	public ImageIcon getImageIcon() {
		return super.getImageIcon("images/sent-tree.gif");
	}
}
