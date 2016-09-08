package com.hdb.mailclient.box;

import javax.swing.ImageIcon;

/**
 * 导航树的接口
 */
public interface MailBox {

	/**
	 * 获得名字
	 * @return
	 */
	String getText();
	
	/**
	 * 返回对应图标
	 * @return
	 */
	ImageIcon getImageIcon();
	
	
}
