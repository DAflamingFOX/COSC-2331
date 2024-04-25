import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JSeparator;
import javax.swing.JTextArea;

import java.awt.Insets;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class CalculatorPopup extends JDialog {

	String name;
	private JTextField textFieldArea;
	private JTextField textFieldFormula;
	private JTextField textFieldVar1;
	private JTextField textFieldVar2;
	private JTextField textFieldVar3;

	public CalculatorPopup(Frame frame, String calculatorName) {
		super(frame);
		name = calculatorName;
		setTitle(name + " Surface Area Calculator");

		BorderLayout borderLayout = new BorderLayout();
		getContentPane().setLayout(borderLayout);

		JLabel lblNewLabel = new JLabel("Surface Area Calculator For " + name);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 128, 128));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		getContentPane().add(lblNewLabel, BorderLayout.NORTH);

		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 120, 0 };
		gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { Double.MIN_VALUE, 0.0, 1.0 };
		gbl_panel.rowWeights = new double[] { 0.0, 1.0, 1.0, 2.0, 1.0, 0.0, 0.0 };
		panel.setLayout(gbl_panel);

		JSeparator separator_1 = new JSeparator();
		GridBagConstraints gbc_separator_1 = new GridBagConstraints();
		gbc_separator_1.gridwidth = 3;
		gbc_separator_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_separator_1.insets = new Insets(0, 0, 5, 0);
		gbc_separator_1.gridx = 0;
		gbc_separator_1.gridy = 0;
		panel.add(separator_1, gbc_separator_1);

		switch (calculatorName) {
		
		case "Circle" -> {
			JLabel lblVar1 = new JLabel("Enter Radius: ");
			lblVar1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblVar1.setFont(new Font("Tahoma", Font.BOLD, 18));
			GridBagConstraints gbc_lblVar1 = new GridBagConstraints();
			gbc_lblVar1.anchor = GridBagConstraints.EAST;
			gbc_lblVar1.fill = GridBagConstraints.VERTICAL;
			gbc_lblVar1.insets = new Insets(5, 5, 5, 5);
			gbc_lblVar1.gridx = 0;
			gbc_lblVar1.gridy = 1;
			panel.add(lblVar1, gbc_lblVar1);

			textFieldVar1 = new JTextField();
			textFieldVar1.setHorizontalAlignment(SwingConstants.LEFT);
			textFieldVar1.setFont(new Font("Tahoma", Font.PLAIN, 16));
			GridBagConstraints gbc_textFieldVar1 = new GridBagConstraints();
			gbc_textFieldVar1.insets = new Insets(5, 5, 5, 5);
			gbc_textFieldVar1.fill = GridBagConstraints.BOTH;
			gbc_textFieldVar1.gridx = 1;
			gbc_textFieldVar1.gridy = 1;
			panel.add(textFieldVar1, gbc_textFieldVar1);
			textFieldVar1.setColumns(10);
			textFieldVar1.setText(Double.toString(0.0));
		}
		
		case "Triangle" -> {
			JLabel lblVar1 = new JLabel("Enter Base: ");
			lblVar1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblVar1.setFont(new Font("Tahoma", Font.BOLD, 18));
			GridBagConstraints gbc_lblVar1 = new GridBagConstraints();
			gbc_lblVar1.anchor = GridBagConstraints.EAST;
			gbc_lblVar1.fill = GridBagConstraints.VERTICAL;
			gbc_lblVar1.insets = new Insets(5, 5, 5, 5);
			gbc_lblVar1.gridx = 0;
			gbc_lblVar1.gridy = 1;
			panel.add(lblVar1, gbc_lblVar1);

			textFieldVar1 = new JTextField();
			textFieldVar1.setHorizontalAlignment(SwingConstants.LEFT);
			textFieldVar1.setFont(new Font("Tahoma", Font.PLAIN, 16));
			GridBagConstraints gbc_textFieldVar1 = new GridBagConstraints();
			gbc_textFieldVar1.insets = new Insets(5, 5, 5, 5);
			gbc_textFieldVar1.fill = GridBagConstraints.BOTH;
			gbc_textFieldVar1.gridx = 1;
			gbc_textFieldVar1.gridy = 1;
			panel.add(textFieldVar1, gbc_textFieldVar1);
			textFieldVar1.setColumns(10);
			textFieldVar1.setText(Double.toString(0.0));

			JLabel lblVar2 = new JLabel("Enter Height: ");
			lblVar2.setHorizontalAlignment(SwingConstants.RIGHT);
			lblVar2.setFont(new Font("Tahoma", Font.BOLD, 18));
			GridBagConstraints gbc_lblVar2 = new GridBagConstraints();
			gbc_lblVar2.anchor = GridBagConstraints.EAST;
			gbc_lblVar2.fill = GridBagConstraints.VERTICAL;
			gbc_lblVar2.insets = new Insets(5, 5, 5, 5);
			gbc_lblVar2.gridx = 0;
			gbc_lblVar2.gridy = 2;
			panel.add(lblVar2, gbc_lblVar2);

			textFieldVar2 = new JTextField();
			textFieldVar2.setHorizontalAlignment(SwingConstants.LEFT);
			textFieldVar2.setFont(new Font("Tahoma", Font.PLAIN, 16));
			GridBagConstraints gbc_textFieldVar2 = new GridBagConstraints();
			gbc_textFieldVar2.insets = new Insets(5, 5, 5, 5);
			gbc_textFieldVar2.fill = GridBagConstraints.BOTH;
			gbc_textFieldVar2.gridx = 1;
			gbc_textFieldVar2.gridy = 2;
			panel.add(textFieldVar2, gbc_textFieldVar2);
		}
		
		case "Square" -> {
			JLabel lblVar1 = new JLabel("Enter Side length: ");
			lblVar1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblVar1.setFont(new Font("Tahoma", Font.BOLD, 18));
			GridBagConstraints gbc_lblVar1 = new GridBagConstraints();
			gbc_lblVar1.anchor = GridBagConstraints.EAST;
			gbc_lblVar1.fill = GridBagConstraints.VERTICAL;
			gbc_lblVar1.insets = new Insets(5, 5, 5, 5);
			gbc_lblVar1.gridx = 0;
			gbc_lblVar1.gridy = 1;
			panel.add(lblVar1, gbc_lblVar1);

			textFieldVar1 = new JTextField();
			textFieldVar1.setHorizontalAlignment(SwingConstants.LEFT);
			textFieldVar1.setFont(new Font("Tahoma", Font.PLAIN, 16));
			GridBagConstraints gbc_textFieldVar1 = new GridBagConstraints();
			gbc_textFieldVar1.insets = new Insets(5, 5, 5, 5);
			gbc_textFieldVar1.fill = GridBagConstraints.BOTH;
			gbc_textFieldVar1.gridx = 1;
			gbc_textFieldVar1.gridy = 1;
			panel.add(textFieldVar1, gbc_textFieldVar1);
		}
		
		case "Rectangle" -> {
				JLabel lblVar1 = new JLabel("Enter Length: ");
				lblVar1.setHorizontalAlignment(SwingConstants.RIGHT);
				lblVar1.setFont(new Font("Tahoma", Font.BOLD, 18));
				GridBagConstraints gbc_lblVar1 = new GridBagConstraints();
				gbc_lblVar1.anchor = GridBagConstraints.EAST;
				gbc_lblVar1.fill = GridBagConstraints.VERTICAL;
				gbc_lblVar1.insets = new Insets(5, 5, 5, 5);
				gbc_lblVar1.gridx = 0;
				gbc_lblVar1.gridy = 1;
				panel.add(lblVar1, gbc_lblVar1);

				textFieldVar1 = new JTextField();
				textFieldVar1.setHorizontalAlignment(SwingConstants.LEFT);
				textFieldVar1.setFont(new Font("Tahoma", Font.PLAIN, 16));
				GridBagConstraints gbc_textFieldVar1 = new GridBagConstraints();
				gbc_textFieldVar1.insets = new Insets(5, 5, 5, 5);
				gbc_textFieldVar1.fill = GridBagConstraints.BOTH;
				gbc_textFieldVar1.gridx = 1;
				gbc_textFieldVar1.gridy = 1;
				panel.add(textFieldVar1, gbc_textFieldVar1);

				JLabel lblVar2 = new JLabel("Enter Height: ");
				lblVar2.setHorizontalAlignment(SwingConstants.RIGHT);
				lblVar2.setFont(new Font("Tahoma", Font.BOLD, 18));
				GridBagConstraints gbc_lblVar2 = new GridBagConstraints();
				gbc_lblVar2.anchor = GridBagConstraints.EAST;
				gbc_lblVar2.fill = GridBagConstraints.VERTICAL;
				gbc_lblVar2.insets = new Insets(5, 5, 5, 5);
				gbc_lblVar2.gridx = 0;
				gbc_lblVar2.gridy = 2;
				panel.add(lblVar2, gbc_lblVar2);

				textFieldVar2 = new JTextField();
				textFieldVar2.setHorizontalAlignment(SwingConstants.LEFT);
				textFieldVar2.setFont(new Font("Tahoma", Font.PLAIN, 16));
				GridBagConstraints gbc_textFieldVar2 = new GridBagConstraints();
				gbc_textFieldVar2.insets = new Insets(5, 5, 5, 5);
				gbc_textFieldVar2.fill = GridBagConstraints.BOTH;
				gbc_textFieldVar2.gridx = 1;
				gbc_textFieldVar2.gridy = 2;
				panel.add(textFieldVar2, gbc_textFieldVar2);
			}
		
		case "Parallelogram" -> {
			JLabel lblVar1 = new JLabel("Enter Base: ");
			lblVar1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblVar1.setFont(new Font("Tahoma", Font.BOLD, 18));
			GridBagConstraints gbc_lblVar1 = new GridBagConstraints();
			gbc_lblVar1.anchor = GridBagConstraints.EAST;
			gbc_lblVar1.fill = GridBagConstraints.VERTICAL;
			gbc_lblVar1.insets = new Insets(5, 5, 5, 5);
			gbc_lblVar1.gridx = 0;
			gbc_lblVar1.gridy = 1;
			panel.add(lblVar1, gbc_lblVar1);

			textFieldVar1 = new JTextField();
			textFieldVar1.setHorizontalAlignment(SwingConstants.LEFT);
			textFieldVar1.setFont(new Font("Tahoma", Font.PLAIN, 16));
			GridBagConstraints gbc_textFieldVar1 = new GridBagConstraints();
			gbc_textFieldVar1.insets = new Insets(5, 5, 5, 5);
			gbc_textFieldVar1.fill = GridBagConstraints.BOTH;
			gbc_textFieldVar1.gridx = 1;
			gbc_textFieldVar1.gridy = 1;
			panel.add(textFieldVar1, gbc_textFieldVar1);

			JLabel lblVar2 = new JLabel("Enter Hight: ");
			lblVar2.setHorizontalAlignment(SwingConstants.RIGHT);
			lblVar2.setFont(new Font("Tahoma", Font.BOLD, 18));
			GridBagConstraints gbc_lblVar2 = new GridBagConstraints();
			gbc_lblVar2.anchor = GridBagConstraints.EAST;
			gbc_lblVar2.fill = GridBagConstraints.VERTICAL;
			gbc_lblVar2.insets = new Insets(5, 5, 5, 5);
			gbc_lblVar2.gridx = 0;
			gbc_lblVar2.gridy = 2;
			panel.add(lblVar2, gbc_lblVar2);

			textFieldVar2 = new JTextField();
			textFieldVar2.setHorizontalAlignment(SwingConstants.LEFT);
			textFieldVar2.setFont(new Font("Tahoma", Font.PLAIN, 16));
			GridBagConstraints gbc_textFieldVar2 = new GridBagConstraints();
			gbc_textFieldVar2.insets = new Insets(5, 5, 5, 5);
			gbc_textFieldVar2.fill = GridBagConstraints.BOTH;
			gbc_textFieldVar2.gridx = 1;
			gbc_textFieldVar2.gridy = 2;
			panel.add(textFieldVar2, gbc_textFieldVar2);
		}
		
		case "Trapezoid" -> {
			JLabel lblVar1 = new JLabel("Enter Base 1: ");
			lblVar1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblVar1.setFont(new Font("Tahoma", Font.BOLD, 18));
			GridBagConstraints gbc_lblVar1 = new GridBagConstraints();
			gbc_lblVar1.anchor = GridBagConstraints.EAST;
			gbc_lblVar1.fill = GridBagConstraints.VERTICAL;
			gbc_lblVar1.insets = new Insets(5, 5, 5, 5);
			gbc_lblVar1.gridx = 0;
			gbc_lblVar1.gridy = 1;
			panel.add(lblVar1, gbc_lblVar1);

			textFieldVar1 = new JTextField();
			textFieldVar1.setHorizontalAlignment(SwingConstants.LEFT);
			textFieldVar1.setFont(new Font("Tahoma", Font.PLAIN, 16));
			GridBagConstraints gbc_textFieldVar1 = new GridBagConstraints();
			gbc_textFieldVar1.insets = new Insets(5, 5, 5, 5);
			gbc_textFieldVar1.fill = GridBagConstraints.BOTH;
			gbc_textFieldVar1.gridx = 1;
			gbc_textFieldVar1.gridy = 1;
			panel.add(textFieldVar1, gbc_textFieldVar1);

			JLabel lblVar2 = new JLabel("Enter Base 2: ");
			lblVar2.setHorizontalAlignment(SwingConstants.RIGHT);
			lblVar2.setFont(new Font("Tahoma", Font.BOLD, 18));
			GridBagConstraints gbc_lblVar2 = new GridBagConstraints();
			gbc_lblVar2.anchor = GridBagConstraints.EAST;
			gbc_lblVar2.fill = GridBagConstraints.VERTICAL;
			gbc_lblVar2.insets = new Insets(5, 5, 5, 5);
			gbc_lblVar2.gridx = 0;
			gbc_lblVar2.gridy = 2;
			panel.add(lblVar2, gbc_lblVar2);

			textFieldVar2 = new JTextField();
			textFieldVar2.setHorizontalAlignment(SwingConstants.LEFT);
			textFieldVar2.setFont(new Font("Tahoma", Font.PLAIN, 16));
			GridBagConstraints gbc_textFieldVar2 = new GridBagConstraints();
			gbc_textFieldVar2.insets = new Insets(5, 5, 5, 5);
			gbc_textFieldVar2.fill = GridBagConstraints.BOTH;
			gbc_textFieldVar2.gridx = 1;
			gbc_textFieldVar2.gridy = 2;
			panel.add(textFieldVar2, gbc_textFieldVar2);

			JLabel lblVar3 = new JLabel("Enter Height: ");
			lblVar3.setHorizontalAlignment(SwingConstants.RIGHT);
			lblVar3.setFont(new Font("Tahoma", Font.BOLD, 18));
			GridBagConstraints gbc_lblVar3 = new GridBagConstraints();
			gbc_lblVar3.anchor = GridBagConstraints.EAST;
			gbc_lblVar3.fill = GridBagConstraints.VERTICAL;
			gbc_lblVar3.insets = new Insets(5, 5, 5, 5);
			gbc_lblVar3.gridx = 0;
			gbc_lblVar3.gridy = 3;
			panel.add(lblVar3, gbc_lblVar3);

			textFieldVar3 = new JTextField();
			textFieldVar3.setHorizontalAlignment(SwingConstants.LEFT);
			textFieldVar3.setFont(new Font("Tahoma", Font.PLAIN, 16));
			GridBagConstraints gbc_textFieldVar3 = new GridBagConstraints();
			gbc_textFieldVar3.insets = new Insets(5, 5, 5, 5);
			gbc_textFieldVar3.fill = GridBagConstraints.BOTH;
			gbc_textFieldVar3.gridx = 1;
			gbc_textFieldVar3.gridy = 3;
			panel.add(textFieldVar3, gbc_textFieldVar3);
		}
		
		case "Cube" -> {
			JLabel lblVar1 = new JLabel("Enter Edge Length: ");
			lblVar1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblVar1.setFont(new Font("Tahoma", Font.BOLD, 18));
			GridBagConstraints gbc_lblVar1 = new GridBagConstraints();
			gbc_lblVar1.anchor = GridBagConstraints.EAST;
			gbc_lblVar1.fill = GridBagConstraints.VERTICAL;
			gbc_lblVar1.insets = new Insets(5, 5, 5, 5);
			gbc_lblVar1.gridx = 0;
			gbc_lblVar1.gridy = 1;
			panel.add(lblVar1, gbc_lblVar1);

			textFieldVar1 = new JTextField();
			textFieldVar1.setHorizontalAlignment(SwingConstants.LEFT);
			textFieldVar1.setFont(new Font("Tahoma", Font.PLAIN, 16));
			GridBagConstraints gbc_textFieldVar1 = new GridBagConstraints();
			gbc_textFieldVar1.insets = new Insets(5, 5, 5, 5);
			gbc_textFieldVar1.fill = GridBagConstraints.BOTH;
			gbc_textFieldVar1.gridx = 1;
			gbc_textFieldVar1.gridy = 1;
			panel.add(textFieldVar1, gbc_textFieldVar1);
		}
		
		case "Rectangular Prism" -> {
			JLabel lblVar1 = new JLabel("Enter Length: ");
			lblVar1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblVar1.setFont(new Font("Tahoma", Font.BOLD, 18));
			GridBagConstraints gbc_lblVar1 = new GridBagConstraints();
			gbc_lblVar1.anchor = GridBagConstraints.EAST;
			gbc_lblVar1.fill = GridBagConstraints.VERTICAL;
			gbc_lblVar1.insets = new Insets(5, 5, 5, 5);
			gbc_lblVar1.gridx = 0;
			gbc_lblVar1.gridy = 1;
			panel.add(lblVar1, gbc_lblVar1);

			textFieldVar1 = new JTextField();
			textFieldVar1.setHorizontalAlignment(SwingConstants.LEFT);
			textFieldVar1.setFont(new Font("Tahoma", Font.PLAIN, 16));
			GridBagConstraints gbc_textFieldVar1 = new GridBagConstraints();
			gbc_textFieldVar1.insets = new Insets(5, 5, 5, 5);
			gbc_textFieldVar1.fill = GridBagConstraints.BOTH;
			gbc_textFieldVar1.gridx = 1;
			gbc_textFieldVar1.gridy = 1;
			panel.add(textFieldVar1, gbc_textFieldVar1);

			JLabel lblVar2 = new JLabel("Enter Width: ");
			lblVar2.setHorizontalAlignment(SwingConstants.RIGHT);
			lblVar2.setFont(new Font("Tahoma", Font.BOLD, 18));
			GridBagConstraints gbc_lblVar2 = new GridBagConstraints();
			gbc_lblVar2.anchor = GridBagConstraints.EAST;
			gbc_lblVar2.fill = GridBagConstraints.VERTICAL;
			gbc_lblVar2.insets = new Insets(5, 5, 5, 5);
			gbc_lblVar2.gridx = 0;
			gbc_lblVar2.gridy = 2;
			panel.add(lblVar2, gbc_lblVar2);

			textFieldVar2 = new JTextField();
			textFieldVar2.setHorizontalAlignment(SwingConstants.LEFT);
			textFieldVar2.setFont(new Font("Tahoma", Font.PLAIN, 16));
			GridBagConstraints gbc_textFieldVar2 = new GridBagConstraints();
			gbc_textFieldVar2.insets = new Insets(5, 5, 5, 5);
			gbc_textFieldVar2.fill = GridBagConstraints.BOTH;
			gbc_textFieldVar2.gridx = 1;
			gbc_textFieldVar2.gridy = 2;
			panel.add(textFieldVar2, gbc_textFieldVar2);

			JLabel lblVar3 = new JLabel("Enter Height: ");
			lblVar3.setHorizontalAlignment(SwingConstants.RIGHT);
			lblVar3.setFont(new Font("Tahoma", Font.BOLD, 18));
			GridBagConstraints gbc_lblVar3 = new GridBagConstraints();
			gbc_lblVar3.anchor = GridBagConstraints.EAST;
			gbc_lblVar3.fill = GridBagConstraints.VERTICAL;
			gbc_lblVar3.insets = new Insets(5, 5, 5, 5);
			gbc_lblVar3.gridx = 0;
			gbc_lblVar3.gridy = 3;
			panel.add(lblVar3, gbc_lblVar3);

			textFieldVar3 = new JTextField();
			textFieldVar3.setHorizontalAlignment(SwingConstants.LEFT);
			textFieldVar3.setFont(new Font("Tahoma", Font.PLAIN, 16));
			GridBagConstraints gbc_textFieldVar3 = new GridBagConstraints();
			gbc_textFieldVar3.insets = new Insets(5, 5, 5, 5);
			gbc_textFieldVar3.fill = GridBagConstraints.BOTH;
			gbc_textFieldVar3.gridx = 1;
			gbc_textFieldVar3.gridy = 3;
			panel.add(textFieldVar3, gbc_textFieldVar3);
		}
		case "Cylinder" -> {
				JLabel lblVar1 = new JLabel("Enter Radius: ");
				lblVar1.setHorizontalAlignment(SwingConstants.RIGHT);
				lblVar1.setFont(new Font("Tahoma", Font.BOLD, 18));
				GridBagConstraints gbc_lblVar1 = new GridBagConstraints();
				gbc_lblVar1.anchor = GridBagConstraints.EAST;
				gbc_lblVar1.fill = GridBagConstraints.VERTICAL;
				gbc_lblVar1.insets = new Insets(5, 5, 5, 5);
				gbc_lblVar1.gridx = 0;
				gbc_lblVar1.gridy = 1;
				panel.add(lblVar1, gbc_lblVar1);

				textFieldVar1 = new JTextField();
				textFieldVar1.setHorizontalAlignment(SwingConstants.LEFT);
				textFieldVar1.setFont(new Font("Tahoma", Font.PLAIN, 16));
				GridBagConstraints gbc_textFieldVar1 = new GridBagConstraints();
				gbc_textFieldVar1.insets = new Insets(5, 5, 5, 5);
				gbc_textFieldVar1.fill = GridBagConstraints.BOTH;
				gbc_textFieldVar1.gridx = 1;
				gbc_textFieldVar1.gridy = 1;
				panel.add(textFieldVar1, gbc_textFieldVar1);

				JLabel lblVar2 = new JLabel("Enter Hight: ");
				lblVar2.setHorizontalAlignment(SwingConstants.RIGHT);
				lblVar2.setFont(new Font("Tahoma", Font.BOLD, 18));
				GridBagConstraints gbc_lblVar2 = new GridBagConstraints();
				gbc_lblVar2.anchor = GridBagConstraints.EAST;
				gbc_lblVar2.fill = GridBagConstraints.VERTICAL;
				gbc_lblVar2.insets = new Insets(5, 5, 5, 5);
				gbc_lblVar2.gridx = 0;
				gbc_lblVar2.gridy = 2;
				panel.add(lblVar2, gbc_lblVar2);

				textFieldVar2 = new JTextField();
				textFieldVar2.setHorizontalAlignment(SwingConstants.LEFT);
				textFieldVar2.setFont(new Font("Tahoma", Font.PLAIN, 16));
				GridBagConstraints gbc_textFieldVar2 = new GridBagConstraints();
				gbc_textFieldVar2.insets = new Insets(5, 5, 5, 5);
				gbc_textFieldVar2.fill = GridBagConstraints.BOTH;
				gbc_textFieldVar2.gridx = 1;
				gbc_textFieldVar2.gridy = 2;
				panel.add(textFieldVar2, gbc_textFieldVar2);
			}
		
		case "Cone" -> {
				JLabel lblVar1 = new JLabel("Enter Radius: ");
				lblVar1.setHorizontalAlignment(SwingConstants.RIGHT);
				lblVar1.setFont(new Font("Tahoma", Font.BOLD, 18));
				GridBagConstraints gbc_lblVar1 = new GridBagConstraints();
				gbc_lblVar1.anchor = GridBagConstraints.EAST;
				gbc_lblVar1.fill = GridBagConstraints.VERTICAL;
				gbc_lblVar1.insets = new Insets(5, 5, 5, 5);
				gbc_lblVar1.gridx = 0;
				gbc_lblVar1.gridy = 1;
				panel.add(lblVar1, gbc_lblVar1);

				textFieldVar1 = new JTextField();
				textFieldVar1.setHorizontalAlignment(SwingConstants.LEFT);
				textFieldVar1.setFont(new Font("Tahoma", Font.PLAIN, 16));
				GridBagConstraints gbc_textFieldVar1 = new GridBagConstraints();
				gbc_textFieldVar1.insets = new Insets(5, 5, 5, 5);
				gbc_textFieldVar1.fill = GridBagConstraints.BOTH;
				gbc_textFieldVar1.gridx = 1;
				gbc_textFieldVar1.gridy = 1;
				panel.add(textFieldVar1, gbc_textFieldVar1);

				JLabel lblVar2 = new JLabel("Enter The Slant Length: ");
				lblVar2.setHorizontalAlignment(SwingConstants.RIGHT);
				lblVar2.setFont(new Font("Tahoma", Font.BOLD, 18));
				GridBagConstraints gbc_lblVar2 = new GridBagConstraints();
				gbc_lblVar2.anchor = GridBagConstraints.EAST;
				gbc_lblVar2.fill = GridBagConstraints.VERTICAL;
				gbc_lblVar2.insets = new Insets(5, 5, 5, 5);
				gbc_lblVar2.gridx = 0;
				gbc_lblVar2.gridy = 2;
				panel.add(lblVar2, gbc_lblVar2);

				textFieldVar2 = new JTextField();
				textFieldVar2.setHorizontalAlignment(SwingConstants.LEFT);
				textFieldVar2.setFont(new Font("Tahoma", Font.PLAIN, 16));
				GridBagConstraints gbc_textFieldVar2 = new GridBagConstraints();
				gbc_textFieldVar2.insets = new Insets(5, 5, 5, 5);
				gbc_textFieldVar2.fill = GridBagConstraints.BOTH;
				gbc_textFieldVar2.gridx = 1;
				gbc_textFieldVar2.gridy = 2;
				panel.add(textFieldVar2, gbc_textFieldVar2);
			}
		
		case "Sphere" -> {
			JLabel lblVar1 = new JLabel("Enter Radius: ");
			lblVar1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblVar1.setFont(new Font("Tahoma", Font.BOLD, 18));
			GridBagConstraints gbc_lblVar1 = new GridBagConstraints();
			gbc_lblVar1.anchor = GridBagConstraints.EAST;
			gbc_lblVar1.fill = GridBagConstraints.VERTICAL;
			gbc_lblVar1.insets = new Insets(5, 5, 5, 5);
			gbc_lblVar1.gridx = 0;
			gbc_lblVar1.gridy = 1;
			panel.add(lblVar1, gbc_lblVar1);

			textFieldVar1 = new JTextField();
			textFieldVar1.setHorizontalAlignment(SwingConstants.LEFT);
			textFieldVar1.setFont(new Font("Tahoma", Font.PLAIN, 16));
			GridBagConstraints gbc_textFieldVar1 = new GridBagConstraints();
			gbc_textFieldVar1.insets = new Insets(5, 5, 5, 5);
			gbc_textFieldVar1.fill = GridBagConstraints.BOTH;
			gbc_textFieldVar1.gridx = 1;
			gbc_textFieldVar1.gridy = 1;
			panel.add(textFieldVar1, gbc_textFieldVar1);
		}
		
		case "Hemisphere" -> {
			JLabel lblVar1 = new JLabel("Enter Radius: ");
			lblVar1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblVar1.setFont(new Font("Tahoma", Font.BOLD, 18));
			GridBagConstraints gbc_lblVar1 = new GridBagConstraints();
			gbc_lblVar1.anchor = GridBagConstraints.EAST;
			gbc_lblVar1.fill = GridBagConstraints.VERTICAL;
			gbc_lblVar1.insets = new Insets(5, 5, 5, 5);
			gbc_lblVar1.gridx = 0;
			gbc_lblVar1.gridy = 1;
			panel.add(lblVar1, gbc_lblVar1);

			textFieldVar1 = new JTextField();
			textFieldVar1.setHorizontalAlignment(SwingConstants.LEFT);
			textFieldVar1.setFont(new Font("Tahoma", Font.PLAIN, 16));
			GridBagConstraints gbc_textFieldVar1 = new GridBagConstraints();
			gbc_textFieldVar1.insets = new Insets(5, 5, 5, 5);
			gbc_textFieldVar1.fill = GridBagConstraints.BOTH;
			gbc_textFieldVar1.gridx = 1;
			gbc_textFieldVar1.gridy = 1;
			panel.add(textFieldVar1, gbc_textFieldVar1);
		}
		
		default -> {
			JLabel lblVar1 = new JLabel("Enter Variable 1: ");
			lblVar1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblVar1.setFont(new Font("Tahoma", Font.BOLD, 18));
			GridBagConstraints gbc_lblVar1 = new GridBagConstraints();
			gbc_lblVar1.anchor = GridBagConstraints.EAST;
			gbc_lblVar1.fill = GridBagConstraints.VERTICAL;
			gbc_lblVar1.insets = new Insets(5, 5, 5, 5);
			gbc_lblVar1.gridx = 0;
			gbc_lblVar1.gridy = 1;
			panel.add(lblVar1, gbc_lblVar1);

			textFieldVar1 = new JTextField();
			textFieldVar1.setHorizontalAlignment(SwingConstants.LEFT);
			textFieldVar1.setFont(new Font("Tahoma", Font.PLAIN, 16));
			GridBagConstraints gbc_textFieldVar1 = new GridBagConstraints();
			gbc_textFieldVar1.insets = new Insets(5, 5, 5, 5);
			gbc_textFieldVar1.fill = GridBagConstraints.BOTH;
			gbc_textFieldVar1.gridx = 1;
			gbc_textFieldVar1.gridy = 1;
			panel.add(textFieldVar1, gbc_textFieldVar1);

			JLabel lblVar2 = new JLabel("Enter Variable 2: ");
			lblVar2.setHorizontalAlignment(SwingConstants.RIGHT);
			lblVar2.setFont(new Font("Tahoma", Font.BOLD, 18));
			GridBagConstraints gbc_lblVar2 = new GridBagConstraints();
			gbc_lblVar2.anchor = GridBagConstraints.EAST;
			gbc_lblVar2.fill = GridBagConstraints.VERTICAL;
			gbc_lblVar2.insets = new Insets(5, 5, 5, 5);
			gbc_lblVar2.gridx = 0;
			gbc_lblVar2.gridy = 2;
			panel.add(lblVar2, gbc_lblVar2);

			textFieldVar2 = new JTextField();
			textFieldVar2.setHorizontalAlignment(SwingConstants.LEFT);
			textFieldVar2.setFont(new Font("Tahoma", Font.PLAIN, 16));
			GridBagConstraints gbc_textFieldVar2 = new GridBagConstraints();
			gbc_textFieldVar2.insets = new Insets(5, 5, 5, 5);
			gbc_textFieldVar2.fill = GridBagConstraints.BOTH;
			gbc_textFieldVar2.gridx = 1;
			gbc_textFieldVar2.gridy = 2;
			panel.add(textFieldVar2, gbc_textFieldVar2);

			JLabel lblVar3 = new JLabel("Enter Variable 3: ");
			lblVar3.setHorizontalAlignment(SwingConstants.RIGHT);
			lblVar3.setFont(new Font("Tahoma", Font.BOLD, 18));
			GridBagConstraints gbc_lblVar3 = new GridBagConstraints();
			gbc_lblVar3.anchor = GridBagConstraints.EAST;
			gbc_lblVar3.fill = GridBagConstraints.VERTICAL;
			gbc_lblVar3.insets = new Insets(5, 5, 5, 5);
			gbc_lblVar3.gridx = 0;
			gbc_lblVar3.gridy = 3;
			panel.add(lblVar3, gbc_lblVar3);

			textFieldVar3 = new JTextField();
			textFieldVar3.setHorizontalAlignment(SwingConstants.LEFT);
			textFieldVar3.setFont(new Font("Tahoma", Font.PLAIN, 16));
			GridBagConstraints gbc_textFieldVar3 = new GridBagConstraints();
			gbc_textFieldVar3.insets = new Insets(5, 5, 5, 5);
			gbc_textFieldVar3.fill = GridBagConstraints.BOTH;
			gbc_textFieldVar3.gridx = 1;
			gbc_textFieldVar3.gridy = 3;
			panel.add(textFieldVar3, gbc_textFieldVar3);
		}
		}

		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnCalculate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calculate();
			}
		});
		GridBagConstraints gbc_btnCalculate = new GridBagConstraints();
		gbc_btnCalculate.fill = GridBagConstraints.BOTH;
		gbc_btnCalculate.insets = new Insets(1, 5, 5, 5);
		gbc_btnCalculate.gridx = 2;
		gbc_btnCalculate.gridy = 1;
		panel.add(btnCalculate, gbc_btnCalculate);

		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnReset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				reset();
			}
		});
		GridBagConstraints gbc_btnReset = new GridBagConstraints();
		gbc_btnReset.fill = GridBagConstraints.BOTH;
		gbc_btnReset.insets = new Insets(5, 5, 5, 5);
		gbc_btnReset.gridx = 2;
		gbc_btnReset.gridy = 2;
		panel.add(btnReset, gbc_btnReset);

		JSeparator separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.gridwidth = 3;
		gbc_separator.fill = GridBagConstraints.HORIZONTAL;
		gbc_separator.gridx = 0;
		gbc_separator.gridy = 4;
		panel.add(separator, gbc_separator);

		JLabel lblFormula = new JLabel("Formula: ");
		lblFormula.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFormula.setFont(new Font("Tahoma", Font.BOLD, 18));
		GridBagConstraints gbc_lblFormula = new GridBagConstraints();
		gbc_lblFormula.anchor = GridBagConstraints.EAST;
		gbc_lblFormula.fill = GridBagConstraints.VERTICAL;
		gbc_lblFormula.insets = new Insets(0, 0, 5, 5);
		gbc_lblFormula.gridx = 1;
		gbc_lblFormula.gridy = 5;
		panel.add(lblFormula, gbc_lblFormula);

		textFieldFormula = new JTextField();
		textFieldFormula.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldFormula.setEditable(false);
		textFieldFormula.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_textFieldFormula = new GridBagConstraints();
		gbc_textFieldFormula.insets = new Insets(5, 5, 5, 5);
		gbc_textFieldFormula.fill = GridBagConstraints.BOTH;
		gbc_textFieldFormula.gridx = 2;
		gbc_textFieldFormula.gridy = 5;
		panel.add(textFieldFormula, gbc_textFieldFormula);

		JLabel lblNewLabel_1 = new JLabel("Area: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints lblArea = new GridBagConstraints();
		lblArea.fill = GridBagConstraints.VERTICAL;
		lblArea.anchor = GridBagConstraints.EAST;
		lblArea.insets = new Insets(0, 0, 0, 5);
		lblArea.gridx = 1;
		lblArea.gridy = 6;
		panel.add(lblNewLabel_1, lblArea);

		textFieldArea = new JTextField();
		textFieldArea.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldArea.setEditable(false);
		textFieldArea.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_textFieldArea = new GridBagConstraints();
		gbc_textFieldArea.insets = new Insets(5, 5, 5, 5);
		gbc_textFieldArea.fill = GridBagConstraints.BOTH;
		gbc_textFieldArea.gridx = 2;
		gbc_textFieldArea.gridy = 6;
		panel.add(textFieldArea, gbc_textFieldArea);

		name = calculatorName;
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				Logger.log(name + " calculator opened.");
			}
		});
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				close();
			}
		});

		reset();
	}

	private void reset() {
		textFieldArea.setText("Area not calculated");
		Logger.log(String.format("Calculator (%s): Reset.", name));

		switch (name) {
		case "Circle" -> {
			textFieldVar1.setText(Double.toString(0));
			textFieldFormula.setText("pi * r\u00b2");
		}
		
		case "Triangle" -> {
			textFieldVar1.setText(Double.toString(0));
			textFieldVar2.setText(Double.toString(0));
			textFieldFormula.setText("\u00bd * b * h");
		}
		
		case "Square" -> {
			textFieldVar1.setText(Double.toString(0));
			textFieldFormula.setText("b\u00b2");
		}
		
		case "Rectangle" -> {
			textFieldVar1.setText(Double.toString(0));
			textFieldVar2.setText(Double.toString(0));
			textFieldFormula.setText("b * h");
		}

		case "Parallelogram" -> {
		    textFieldVar1.setText(Double.toString(0));
		    textFieldVar2.setText(Double.toString(0));
		    textFieldFormula.setText("b * h");
		}
		
		case "Trapezoid" -> {
		    textFieldVar1.setText(Double.toString(0));
		    textFieldVar2.setText(Double.toString(0));
		    textFieldVar3.setText(Double.toString(0));
		    textFieldFormula.setText("\u00bd * (b1 + b2) * h");
		}
		
		case "Cube" -> {
			textFieldVar1.setText(Double.toString(0));
			textFieldFormula.setText("6.0 * a\u00b2");
		}
		
		case "Rectangular Prism" -> {
			textFieldVar1.setText(Double.toString(0));
			textFieldVar2.setText(Double.toString(0));
			textFieldVar3.setText(Double.toString(0));
			textFieldFormula.setText("2.0(w*l + h*l + h*w)");
		}
		
		case "Cylinder" -> {
			textFieldVar1.setText(Double.toString(0));
			textFieldVar2.setText(Double.toString(0));
			textFieldFormula.setText("2 * pi * r\u00b2 + 2 * pi * r * h");
		}
		
		case "Cone" -> {
			textFieldVar1.setText(Double.toString(0));
			textFieldVar2.setText(Double.toString(0));
			textFieldFormula.setText("pi * r\u00b2 + pi * r * s");
		}
		
		case "Sphere" -> {
		    textFieldVar1.setText(Double.toString(0));
		    textFieldFormula.setText("4 * pi * r\u00b2");
		}
		
		case "Hemisphere" -> {
		    textFieldVar1.setText(Double.toString(0));
		    textFieldFormula.setText("3 * pi * r\u00b2");
		}

		default -> {
			textFieldFormula.setText("No Formula");
		}

		}
	}

	private void calculate() {
		try {

			switch (name) {
			case "Circle" -> {
				double radius = Double.parseDouble(textFieldVar1.getText());
				textFieldFormula.setText(String.format("%.3f * %.3f\u00b2", Math.PI, radius));
				double area = Math.PI * Math.pow(radius, 2);
				textFieldArea.setText(String.format("%.3f", area));
				Logger.log(String.format("Calculator (%s): Completed calculation with radius: %f, with result: %f.",
						name, radius, area));
			}
			
			case "Triangle" -> {
				double base = Double.parseDouble(textFieldVar1.getText());
				double height = Double.parseDouble(textFieldVar2.getText());
				textFieldFormula.setText(String.format("0.5 * %.3f * %.3f", base, height));
				double area = .5 * base * height;
				textFieldArea.setText(String.format("%.3f", area));
				Logger.log(String.format(
						"Calculator (%s): Completed calculation with base: %f, height: %f, with result: %f.", name,
						base, height, area));
			}
			
			case "Square" -> {
				double base = Double.parseDouble(textFieldVar1.getText());
				textFieldFormula.setText(String.format("%.3f\u00b2", base));
				double area = base * base;
				textFieldArea.setText(String.format("%.3f", area));
				Logger.log(String.format(
						"Calculator (%s): Completed calculation with base: %f, with result: %f.", name,
						base, area));
			}
			
			case "Rectangle" -> {
				double base = Double.parseDouble(textFieldVar1.getText());
				double height = Double.parseDouble(textFieldVar2.getText());
				textFieldFormula.setText(String.format("%.3f * %.3f", base, height));
				double area =base * height;
				textFieldArea.setText(String.format("%.3f", area));
				Logger.log(String.format(
						"Calculator (%s): Completed calculation with base: %f, height: %f, with result: %f.", name,
						base, height, area));
			}
			
			case "Parallelogram" -> {
			    double base = Double.parseDouble(textFieldVar1.getText());
			    double height = Double.parseDouble(textFieldVar2.getText());
			    double area = base * height;
			    textFieldFormula.setText(String.format("%.3f * %.3f", base, height));			  
			    textFieldArea.setText(String.format("%.3f", area));
			    Logger.log(String.format("Calculator (%s): Completed calculation with base: %f and height: %f, with result: %f.", name, base, height, area));
			}
			
			case "Trapezoid" -> {
			    double base1 = Double.parseDouble(textFieldVar1.getText());
			    double base2 = Double.parseDouble(textFieldVar2.getText());
			    double height = Double.parseDouble(textFieldVar3.getText());
			    double area = 0.5 * (base1 + base2) * height;
			    textFieldFormula.setText(String.format("0.5 * (%.3f + %.3f) * %.3f", base1, base2, height));
			    textFieldArea.setText(String.format("%.3f", area));
			    Logger.log(String.format("Calculator (%s): Completed calculation with bases: %f, %.3f and height: %f, with result: %f.", name, base1, base2, height, area));
			}

			case "Cube" -> {
				double edgeLength = Double.parseDouble(textFieldVar1.getText());
				textFieldFormula.setText(String.format("6.0 * %.3f\u00b2", edgeLength));
				double area = 6.0 * Math.pow(edgeLength, 2);
				textFieldArea.setText(String.format("%.3f", area));
				Logger.log(
						String.format("Calculator (%s): Completed calculation with edge length: %f, with result: %f.",
								name, edgeLength, area));
			}
			
			case "Rectangular Prism" -> {
				double length = Double.parseDouble(textFieldVar1.getText());
				double width = Double.parseDouble(textFieldVar2.getText());
				double height = Double.parseDouble(textFieldVar3.getText());
				textFieldFormula.setText(String.format("2.0(%.3f * %.3f + %.3f * %.3f + %.3f * %.3f)", width, length,
						height, length, height, width));
				double area = 2.0 * (width * length + height * length + height * width);
				textFieldArea.setText(String.format("%.3f", area));
				Logger.log(String.format(
						"Calculator (%s): Completed calculation with length: %f, width: %f, height: %f, with result: %f.",
						name, length, width, height, area));
			}
			
			case "Cylinder" -> {
				double radius = Double.parseDouble(textFieldVar1.getText());
				double height = Double.parseDouble(textFieldVar2.getText());
				textFieldFormula.setText(String.format("2(%.3f * %.3f\u00b2)+2(%.3f * %.3f*%.3f)", Math.PI, radius, Math.PI, radius, height));
				double area = 2*(Math.PI * Math.pow(radius, 2))+ 2*Math.PI*height*radius;
				textFieldArea.setText(String.format("%.3f", area));
				Logger.log(String.format("Calculator (%s): Completed calculation with radius: %f and height: %f, with result: %f.",
						name, radius, height, area));
			}
			
			case "Cone" -> {
				double radius = Double.parseDouble(textFieldVar1.getText());
				double height = Double.parseDouble(textFieldVar2.getText());
				textFieldFormula.setText(String.format("%.3f * %.3f\u00b2 + %.3f * %.3f * %.3f", Math.PI, radius, Math.PI, radius, height));
				double area = (Math.PI*Math.pow(radius, 2))+(Math.PI*radius*height);
				textFieldArea.setText(String.format("%.3f", area));
				Logger.log(String.format("Calculator (%s): Completed calculation with radius: %f and slant height: %f, with result: %f.",
						name, radius, height, area));
				
			}
			
			case "Sphere" -> {
			    double radius = Double.parseDouble(textFieldVar1.getText());
			    double area = 4 * Math.PI * Math.pow(radius, 2);			   
			    textFieldFormula.setText(String.format("4 * %.3f * %.3f\u00b2", Math.PI, radius));			    
			    textFieldArea.setText(String.format("%.3f", area));
			    Logger.log(String.format("Calculator (%s): Completed calculation with radius: %f, with result: %f.", name, radius, area));
			}
			
			case "Hemisphere" -> {
			    double radius = Double.parseDouble(textFieldVar1.getText());
			    double area = 3 * Math.PI * Math.pow(radius, 2);
			    textFieldFormula.setText(String.format("3 * %.3f * %.3f\u00b2", Math.PI, radius));
			    
			    textFieldArea.setText(String.format("%.3f", area));			 
			    Logger.log(String.format("Calculator (%s): Completed calculation with radius: %f, with result: %f.", name, radius, area));
			}
			
			default -> {
				throw new Exception("No formula available for calculator");
			}

			}
		} catch (Exception e) {
			var error = new JDialog(this);
			JLabel content = new JLabel("An error has occured in the calculation.");
			content.setFont(new Font("Tahoma", Font.BOLD, 24));
			content.setForeground(Color.red);
			error.setContentPane(content);
			error.pack();
			error.setVisible(true);
			Logger.log("Error: " + e.getMessage());
		}
	}

	public void close() {
		dispose();
		Logger.log(name + " calculator closed.");
	}
}
