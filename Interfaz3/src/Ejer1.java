import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;
import javax.swing.JPasswordField;

public class Ejer1 extends JFrame {

	private JPanel contentPane;
	private JTextField textUsuario;
	private JPasswordField textContraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejer1 frame = new Ejer1();
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
	public Ejer1() {
		setTitle("Login");
		setFont(new Font("Franklin Gothic Medium", Font.BOLD, 14));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Virginia\\Pictures\\Saved Pictures\\71494590.jfif"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 768, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][][][][][][][grow]", "[][][][][][][][][][][][]"));
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(lblUsuario, "cell 1 4 5 1,alignx center");
		
		textUsuario = new JTextField();
		textUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		textUsuario.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(textUsuario, "cell 9 4,growx");
		textUsuario.setColumns(10);
		
		JLabel lblContraseña = new JLabel("Contrase\u00F1a");
		lblContraseña.setHorizontalAlignment(SwingConstants.CENTER);
		lblContraseña.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(lblContraseña, "cell 1 7 5 1,alignx center");
		
		textContraseña = new JPasswordField();
		textContraseña.setHorizontalAlignment(SwingConstants.CENTER);
		textContraseña.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(textContraseña, "cell 9 7,growx");
		textContraseña.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usuario=textUsuario.getText();
				String contraseña=textContraseña.getText();
				if(usuario.equals("Pedro")  && contraseña.equals("123456")) {
					JOptionPane.showMessageDialog(null, "Usuario y contraseña correcta");
				}
				else {
					JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta");
				
			}
			}});
		btnAceptar.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(btnAceptar, "cell 9 11,alignx center");
	}

}
