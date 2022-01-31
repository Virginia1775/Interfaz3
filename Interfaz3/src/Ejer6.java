import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejer6 extends JFrame {

	private JPanel contentPane;
	private JButton btnAceptar;
	private JLabel lblSeleccionas;
	private JComboBox comboxCiudad;
	private JLabel lblResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejer6 frame = new Ejer6();
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
	public Ejer6() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Virginia\\Pictures\\Saved Pictures\\71494590.jfif"));
		setTitle("Elige ciudad");
		setFont(new Font("Dialog", Font.BOLD, 20));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 722, 464);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][][grow]", "[][][][][][][][][][][][][][]"));
		
		JLabel lblCiudades = new JLabel("Ciudades");
		lblCiudades.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblCiudades, "cell 1 1 2 1,aligny top");
		
		comboxCiudad = new JComboBox();
		comboxCiudad.setModel(new DefaultComboBoxModel(new String[] {"", "Adam\u00FAz", "Aguilar", "Cabra", "C\u00F3rdoba", "Lucena", "Montilla"}));
		comboxCiudad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(comboxCiudad, "cell 4 1,growx");
		
		 lblSeleccionas = new JLabel("Has seleccionado:");
		lblSeleccionas.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblSeleccionas, "cell 1 11 2 1");
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblResultado.setText((String) comboxCiudad.getSelectedItem());
			}
		});
		
		lblResultado = new JLabel("");
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblResultado, "cell 4 11");
		btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(btnAceptar, "cell 4 13,alignx center");
	}

}
