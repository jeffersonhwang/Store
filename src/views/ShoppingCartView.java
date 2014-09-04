package views;

import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ShoppingCartView extends JPanel {

	int spacing = 40;
	int currentY = 0;
	JPanel panel;
	
	/**
	 * Create the panel.
	 */
	public ShoppingCartView() {
		panel = new JPanel();
	}
	
	public void addItem(String name, int quantity, double price) {
		int startX = spacing;
		
		JTextField productName = new JTextField();
		productName.setBounds(startX, currentY, 80, 40);
		productName.setText(name);
		productName.setEditable(false);
		
		panel.add(productName);
		startX += spacing;
		
		JTextField productCount = new JTextField();
		productCount.setBounds(startX, currentY, 80, 40); 
		productCount.setText(""+quantity);
		productCount.setEditable(false);

		panel.add(productName);
		startX += spacing;
		
		JTextField productPrice = new JTextField();
		productPrice.setBounds(startX, currentY, 80, 40);
		productPrice.setText(""+price);
		productPrice.setEditable(false);

		panel.add(productName);
		
		currentY += spacing;
	}

}
