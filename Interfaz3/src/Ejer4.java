import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Toolkit;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejer4 extends JFrame {

	private JPanel contentPane;
	private JCheckBox chckbxDeportes;
	private JCheckBox chckbxCocina;
	private JTextPane textPane;
	private JCheckBox chckbxJuegos;
	private JCheckBox chckbxTecnologia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejer4 frame = new Ejer4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ejer4() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Virginia\\Pictures\\Saved Pictures\\71494590.jfif"));
		setTitle("HAS SELECCIONADO");
		setFont(new Font("Dialog", Font.BOLD, 24));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 634, 416);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][][][][][][][][]", "[][][][][][][16.00][][][][]"));
		
		JLabel lblHobbies = new JLabel("Hobbies: ");
		lblHobbies.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblHobbies, "cell 1 2");
		
		JLabel lblSelección = new JLabel("Has seleccionado: ");
		lblSelección.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblSelección, "cell 8 2");
		
		 chckbxDeportes = new JCheckBox("Deportes");
		chckbxDeportes.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(chckbxDeportes, "cell 2 4");
		
		chckbxTecnologia = new JCheckBox("Tecnologia");
		chckbxTecnologia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(chckbxTecnologia, "cell 2 5");
		
		chckbxJuegos = new JCheckBox("Juegos");
		chckbxJuegos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(chckbxJuegos, "cell 2 6");
		
		textPane = new JTextPane();
		contentPane.add(textPane, "cell 8 4 1 4,grow");
		
		chckbxCocina = new JCheckBox("Cocina");
		chckbxCocina.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(chckbxCocina, "cell 2 7");
		
		JButton Comprobar = new JButton("Comprobar");
		Comprobar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane.setText(null);
				if(chckbxDeportes.isSelected()) {
					textPane.setText(textPane.getText()+"\nDeportes");
				}
				if(chckbxTecnologia.isSelected()) {
					textPane.setText(textPane.getText()+"\nTEcnología");
				}
				if(chckbxJuegos.isSelected()) {
					textPane.setText(textPane.getText()+"\nJuegos");
				}
				if(chckbxCocina.isSelected()) {
					textPane.setText(textPane.getText()+"\nCocina");
				}
			}
		});
		Comprobar.setFont(new Font("Tahoma", Font.BOLD, 22));
		contentPane.add(Comprobar, "cell 8 9");
	}

}
