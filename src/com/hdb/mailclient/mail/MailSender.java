package com.hdb.mailclient.mail;

import com.hdb.mailclient.object.Mail;
import com.hdb.mailclient.ui.MailContext;

/**
 * �����ʼ��ӿ�
 */
public interface MailSender {

	/**
	 * ����һ���ʼ������ظ��ʼ�����
	 * @param mail
	 * @param ctx
	 * @return
	 */
	Mail send(Mail mail, MailContext ctx);
}
