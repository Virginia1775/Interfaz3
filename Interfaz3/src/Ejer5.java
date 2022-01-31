import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Font;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejer5 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup GrupoColores = new ButtonGroup();
	private JRadioButton jrbAzul;
	private JPanel panelColores;
	private JRadioButton jrbRojo;
	private JRadioButton jrbMagenta;
	private JRadioButton jrbVerde;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejer5 frame = new Ejer5();
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
	public Ejer5() {
		setFont(new Font("Dialog", Font.BOLD, 18));
		setTitle("SELECCIONA UN COLOR");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Virginia\\Pictures\\Saved Pictures\\71494590.jfif"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 710, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][][grow]", "[][][][][][][][][][][]"));
		
		JLabel lblSelecciona = new JLabel("Selecciona un color");
		lblSelecciona.setForeground(Color.BLUE);
		lblSelecciona.setFont(new Font("Tahoma", Font.BOLD, 30));
		contentPane.add(lblSelecciona, "cell 1 1 3 1");
		
		 jrbAzul = new JRadioButton("Azul");
		 jrbAzul.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		panelColores.setBackground(Color.BLUE);
		 		
		 	}
		 });
		GrupoColores.add(jrbAzul);
		jrbAzul.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(jrbAzul, "cell 3 4");
		
		panelColores = new JPanel();
		
		contentPane.add(panelColores, "cell 4 3 1 7,grow");
		
		 jrbRojo = new JRadioButton("Rojo");
		 jrbRojo.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		panelColores.setBackground(Color.RED);
		 	}
		 });
		GrupoColores.add(jrbRojo);
		jrbRojo.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(jrbRojo, "cell 3 6");
		
		jrbVerde = new JRadioButton("Verde");
		jrbVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelColores.setBackground(Color.GREEN);
			}
		});
		GrupoColores.add(jrbVerde);
		jrbVerde.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(jrbVerde, "cell 3 8");
		
		jrbMagenta = new JRadioButton("Magenta");
		jrbMagenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelColores.setBackground(Color.MAGENTA);
			}
		});
		GrupoColores.add(jrbMagenta);
		jrbMagenta.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(jrbMagenta, "cell 3 10");
		
	}

}
