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
	private JPasswordField textContrase�a;

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
		
		JLabel lblContrase�a = new JLabel("Contrase\u00F1a");
		lblContrase�a.setHorizontalAlignment(SwingConstants.CENTER);
		lblContrase�a.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(lblContrase�a, "cell 1 7 5 1,alignx center");
		
		textContrase�a = new JPasswordField();
		textContrase�a.setHorizontalAlignment(SwingConstants.CENTER);
		textContrase�a.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(textContrase�a, "cell 9 7,growx");
		textContrase�a.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usuario=textUsuario.getText();
				String contrase�a=textContrase�a.getText();
				if(usuario.equals("Pedro")  && contrase�a.equals("123456")) {
					JOptionPane.showMessageDialog(null, "Usuario y contrase�a correcta");
				}
				else {
					JOptionPane.showMessageDialog(null, "Usuario o contrase�a incorrecta");
				
			}
			}});
		btnAceptar.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(btnAceptar, "cell 9 11,alignx center");
	}

}
