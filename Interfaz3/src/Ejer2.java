import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Font;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejer2 extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JLabel lblResultado;
	private JLabel lblRResultado;
	private JLabel lblPromedio;
	private JLabel lblRPromedio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejer2 frame = new Ejer2();
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
	public Ejer2() {
		setTitle("CALCULO DE PROMEDIO");
		setFont(new Font("Franklin Gothic Medium", Font.BOLD, 16));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Virginia\\Pictures\\Saved Pictures\\71494590.jfif"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 942, 588);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][][grow][][grow][][grow][][][]", "[][][][][][][][][][][][][][][][][][]"));
		
		JLabel lblCalcular = new JLabel("CALCULA PROMEDIO");
		lblCalcular.setOpaque(true);
		lblCalcular.setBackground(Color.DARK_GRAY);
		lblCalcular.setForeground(Color.WHITE);
		lblCalcular.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalcular.setFont(new Font("Tahoma", Font.BOLD, 32));
		contentPane.add(lblCalcular, "cell 0 0 12 2,grow");
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setFont(new Font("Times New Roman", Font.BOLD, 18));
		contentPane.add(lblNombre, "cell 1 2 2 1");
		
		textNombre = new JTextField();
		textNombre.setFont(new Font("Times New Roman", Font.BOLD, 18));
		contentPane.add(textNombre, "cell 3 2 6 1,growx");
		textNombre.setColumns(10);
		
		JLabel lblNota1 = new JLabel("Nota 1");
		lblNota1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNota1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		contentPane.add(lblNota1, "cell 1 5 2 1");
		
		txtNota1 = new JTextField();
		contentPane.add(txtNota1, "cell 3 5 2 1,growx");
		txtNota1.setColumns(10);
		
		JLabel lblNota2 = new JLabel("Nota 2");
		lblNota2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNota2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		contentPane.add(lblNota2, "cell 5 5,alignx trailing");
		
		txtNota2 = new JTextField();
		contentPane.add(txtNota2, "cell 6 5,growx");
		txtNota2.setColumns(10);
		
		JLabel lblNota3 = new JLabel("Nota 3");
		lblNota3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNota3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		contentPane.add(lblNota3, "cell 7 5,alignx trailing");
		
		txtNota3 = new JTextField();
		contentPane.add(txtNota3, "cell 8 5,growx");
		txtNota3.setColumns(10);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String nombre=textNombre.getText();
				double nota1= Double.parseDouble(txtNota1.getText());
				double nota2= Double.parseDouble(txtNota2.getText());
				double nota3= Double.parseDouble(txtNota3.getText());
				double calcula= (nota1+nota2+nota3)/3;
				lblRPromedio.setText(Double.toString(calcula));
				if(calcula>=5 ) {
					lblRResultado.setText(nombre+" ha aprobado la asignatura");
				}else {
					lblRResultado.setText(nombre+" no ha aprobado");
				}
				
			}
		});
		btnCalcular.setFont(new Font("Times New Roman", Font.BOLD, 20));
		contentPane.add(btnCalcular, "cell 8 9 1 3,alignx center");
		
		lblPromedio = new JLabel("Promedio");
		lblPromedio.setHorizontalAlignment(SwingConstants.CENTER);
		lblPromedio.setFont(new Font("Times New Roman", Font.BOLD, 18));
		contentPane.add(lblPromedio, "cell 1 13 3 1,alignx left");
		
		lblRPromedio = new JLabel("");
		lblRPromedio.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblRPromedio.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblRPromedio, "cell 4 13 3 1,alignx left");
		
		lblResultado = new JLabel("Resultado");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setFont(new Font("Times New Roman", Font.BOLD, 18));
		contentPane.add(lblResultado, "cell 1 17 2 1,alignx center");
		
		lblRResultado = new JLabel("");
		lblRResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblRResultado.setFont(new Font("Times New Roman", Font.BOLD, 18));
		contentPane.add(lblRResultado, "cell 4 17 3 1,alignx left");
	}

}
