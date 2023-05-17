import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField textNombreEquipo;
	private JTextField textCiudad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Titulo = new JLabel("Registro de equipos");
		Titulo.setFont(new Font("Tahoma", Font.BOLD, 15));
		Titulo.setBounds(198, 10, 162, 19);
		contentPane.add(Titulo);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.LIGHT_GRAY);
		panel.setBounds(10, 59, 265, 151);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre del equipo\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(11, 21, 111, 13);
		panel.add(lblNewLabel);
		
		textNombreEquipo = new JTextField();
		textNombreEquipo.setBounds(131, 18, 124, 19);
		panel.add(textNombreEquipo);
		textNombreEquipo.setColumns(10);
		
		JLabel lblCiudadDeProcedencia = new JLabel("Ciudad de procedencia");
		lblCiudadDeProcedencia.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCiudadDeProcedencia.setBounds(11, 50, 111, 13);
		panel.add(lblCiudadDeProcedencia);
		
		textCiudad = new JTextField();
		textCiudad.setColumns(10);
		textCiudad.setBounds(131, 47, 124, 19);
		panel.add(textCiudad);
		
		JLabel lblPosicion = new JLabel("Posicion");
		lblPosicion.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPosicion.setBounds(11, 76, 111, 13);
		panel.add(lblPosicion);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				añadirDatos();
			}

			private void añadirDatos() {
				String nombreEquipo,ciudadProcedencia;
				nombreEquipo=textNombreEquipo.getText();
				ciudadProcedencia=textCiudad.getText();
				
			}
		});
		btnAgregar.setBounds(11, 120, 85, 21);
		panel.add(btnAgregar);
		
		JComboBox comboPosicon = new JComboBox();
		comboPosicon.setToolTipText("1\r\n2\r\n3\r\n4\r\n5");
		comboPosicon.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboPosicon.setBounds(131, 76, 124, 21);
		panel.add(comboPosicon);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(309, 59, 257, 151);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 144, 247, -142);
		panel_1.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 12, 237, 129);
		panel_1.add(textArea);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(481, 232, 85, 21);
		contentPane.add(btnSalir);
	}
}
