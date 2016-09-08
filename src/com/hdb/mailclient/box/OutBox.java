package com.hdb.mailclient.box;

import javax.swing.ImageIcon;

/**
 * 发件箱, 保存正在发送的邮件或者发送失败的邮件
 */
public class OutBox extends AbstractBox {

	@Override
	public String getText() {
		return "发件箱";
	}

	public ImageIcon getImageIcon() {
		return super.getImageIcon("images/out-tree.gif");
	}
	
}
