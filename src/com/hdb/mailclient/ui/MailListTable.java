package com.hdb.mailclient.ui;

import java.awt.Color;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableModel;

/**
 * 邮件列表对象
 * 
 */
public class MailListTable extends JTable {
	public MailListTable(TableModel dm) {
		super(dm);
		//只能选择一行
		getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		//去掉表格的线
		setShowHorizontalLines(false);
		setShowVerticalLines(false);
	}
	//让列表不可编辑
	public boolean isCellEditable(int row, int column) {
		return false;
	}
}
