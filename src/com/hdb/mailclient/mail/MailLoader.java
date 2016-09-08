package com.hdb.mailclient.mail;

import java.util.List;

import com.hdb.mailclient.object.Mail;
import com.hdb.mailclient.ui.MailContext;

/**
 * 读取邮件信息的接口
 */
public interface MailLoader {
	
	/**
	 * 获取服务器邮件，得到收件箱INBOX的所有邮件
	 * @return
	 */
	List<Mail> getMessages(MailContext ctx);
	
}
