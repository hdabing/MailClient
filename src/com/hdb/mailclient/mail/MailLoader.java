package com.hdb.mailclient.mail;

import java.util.List;

import com.hdb.mailclient.object.Mail;
import com.hdb.mailclient.ui.MailContext;

/**
 * ��ȡ�ʼ���Ϣ�Ľӿ�
 */
public interface MailLoader {
	
	/**
	 * ��ȡ�������ʼ����õ��ռ���INBOX�������ʼ�
	 * @return
	 */
	List<Mail> getMessages(MailContext ctx);
	
}
