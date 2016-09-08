package com.hdb.mailclient.mail;

import java.util.Date;
import java.util.List;

import javax.mail.Address;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;

import com.hdb.mailclient.exception.SendMailException;
import com.hdb.mailclient.object.FileObject;
import com.hdb.mailclient.object.Mail;
import com.hdb.mailclient.ui.MailContext;

/**
 * �ʼ�����ʵ���࣬����session��mailMessage���� ͨ��getAddress������е��ռ��˵�ַ�ĵ�ַ��������������ʼ���Ϣ
 * 
 */
public class MailSenderImpl implements MailSender {

	@Override
	public Mail send(Mail mail, MailContext ctx) {
		try {
			Session session = ctx.getSession();
			Message mailMessage = new MimeMessage(session);
			//���÷����˵�ַ
			Address from = new InternetAddress(ctx.getUser() + " <" + ctx.getAccount() + ">");
			mailMessage.setFrom(from);
			//���������ռ��˵ĵ�ַ
			Address[] to = getAddress(mail.getReceivers());
			mailMessage.setRecipients(Message.RecipientType.TO, to);
			//���ó����˵�ַ
			Address[] cc = getAddress(mail.getCcs());
			mailMessage.setRecipients(Message.RecipientType.CC, cc);
			//��������
			mailMessage.setSubject(mail.getSubject());
			//��������
			mailMessage.setSentDate(new Date());
			//���������ʼ�������
			Multipart main = new MimeMultipart();
			//���ĵ�body
			BodyPart body = new MimeBodyPart();
			body.setContent(mail.getContent(), "text/html; charset=utf-8");
			main.addBodyPart(body);
			//��������
			for (FileObject f : mail.getFiles()) {
				//ÿ��������body
				MimeBodyPart fileBody = new MimeBodyPart();
				fileBody.attachFile(f.getFile());
				//Ϊ�ļ�������ת��
				fileBody.setFileName(MimeUtility.encodeText(f.getSourceName()));
				main.addBodyPart(fileBody);
			}
			//�����ĵ�Multipart��������Message��
			mailMessage.setContent(main);
			Transport.send(mailMessage);
			return mail;
		} catch (Exception e) {
			e.printStackTrace();
			throw new SendMailException("�����ʼ�����, �����������ü��ʼ��������Ϣ");
		}
	}
	//������е��ռ��˵�ַ���߳��͵ĵ�ַ
	private Address[] getAddress(List<String> addList) throws Exception {
		Address[] result = new Address[addList.size()];
		for (int i = 0; i < addList.size(); i++) {
			if (addList.get(i) == null || "".equals(addList.get(i))) {
				continue;
			}
			result[i] = new InternetAddress(addList.get(i));
		}
		return result;
	}
}