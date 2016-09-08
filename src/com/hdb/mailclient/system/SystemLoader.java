package com.hdb.mailclient.system;

import java.util.List;

import com.hdb.mailclient.object.Mail;
import com.hdb.mailclient.ui.MailContext;

/**
 * ���ر��ص��ʼ��Ľӿ�
 */
public interface SystemLoader {

	/**
	 * ����MailContext�õ���Ӧ���ռ����ʼ�(�ڱ���ϵͳ�л�ȡ)
	 * @param ctx
	 * @return
	 */
	List<Mail> getInBoxMails(MailContext ctx);
	
	/**
	 * ����MailContext�õ���Ӧ�ķ������ʼ�(�ڱ���ϵͳ�л�ȡ)
	 * @param ctx
	 * @return
	 */
	List<Mail> getOutBoxMails(MailContext ctx);
	
	/**
	 * ����MailContext�õ���Ӧ���ѷ��͵��ʼ�(�ڱ���ϵͳ�л�ȡ)
	 * @param ctx
	 * @return
	 */
	List<Mail> getSentBoxMails(MailContext ctx);
	
	/**
	 * ����MailContext�õ���Ӧ�Ĳݸ�����ʼ�(�ڱ���ϵͳ�л�ȡ)
	 * @param ctx
	 * @return
	 */
	List<Mail> getDraftBoxMails(MailContext ctx);
	
	/**
	 * ����MailContext�õ���Ӧ����������ʼ�(�ڱ���ϵͳ�л�ȡ)
	 * @param ctx
	 * @return
	 */
	List<Mail> getDeletedBoxMails(MailContext ctx);
}
