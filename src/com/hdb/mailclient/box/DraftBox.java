package com.hdb.mailclient.box;

import javax.swing.ImageIcon;

/**
 * ≤›∏Âœ‰
 */
public class DraftBox extends AbstractBox {

	@Override
	public String getText() {
		return "≤›∏Âœ‰";
	}

	public ImageIcon getImageIcon() {
		return super.getImageIcon("images/draft-tree.gif");
	}
}
