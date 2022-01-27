import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejer3 extends JFrame {

	private JPanel contentPane;
	private JButton btnCentral;
	private JButton btnHabilita;
	private JButton btnDeshabilita;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejer3 frame = new Ejer3();
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
	public Ejer3() {
		setTitle("HABILITA O DESHABILITA");
		setFont(new Font("Franklin Gothic Medium", Font.BOLD, 18));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Virginia\\Pictures\\Saved Pictures\\71494590.jfif"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 896, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnDeshabilita = new JButton("Deshabilita Central");
		btnDeshabilita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCentral.setEnabled(false);
				btnDeshabilita.setEnabled(false);
				btnHabilita.setEnabled(true);
			}
		});
		btnDeshabilita.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDeshabilita.setBounds(30, 149, 294, 61);
		contentPane.add(btnDeshabilita);
		
		btnCentral = new JButton("Central");
		btnCentral.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCentral.setBounds(401, 156, 105, 55);
		contentPane.add(btnCentral);
		
		 btnHabilita = new JButton("Habilita Central");
		 btnHabilita.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		btnCentral.setEnabled(true);
		 		btnDeshabilita.setEnabled(true);
		 		btnHabilita.setEnabled(false);
		 	}
		 });
		btnHabilita.setEnabled(false);
		btnHabilita.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnHabilita.setBounds(593, 156, 264, 55);
		contentPane.add(btnHabilita);
	}
}
