package com.hdb.mailclient.ui;

import javax.swing.JOptionPane;

import com.hdb.mailclient.object.FileObject;

/**
 * д�ʼ�ʱ�ĸ����б�������������ʼ�����
 */
public class SendListMouseListener extends MainListMouseListener {

	@Override
	public void handle(FileObject file) {
		int result = JOptionPane.showOptionDialog(null, "��ѡ�����", "ѡ��",
				0, JOptionPane.QUESTION_MESSAGE, null, 
				new Object[]{"��", "ȡ��"}, null);
		if (result == 0) {
			//�򿪲���
			openFile(file);
		}
	}

}
