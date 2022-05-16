import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JInternalFrame;

public class peliculaUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuarioComentario;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					peliculaUI frame = new peliculaUI();
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
	public peliculaUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 561);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(peliculaUI.class.getResource("/portadas/climax.jpg")));
		lblNewLabel.setBounds(18, 104, 180, 233);
		contentPane.add(lblNewLabel);
		
		JLabel lbl_nombrePelicula = new JLabel("TITULO");
		lbl_nombrePelicula.setFont(new Font("Tahoma", Font.BOLD, 25));
		lbl_nombrePelicula.setBounds(63, 61, 289, 31);
		contentPane.add(lbl_nombrePelicula);
		
		JLabel lbl_sinopsis = new JLabel("Hazlo bien puto");
		lbl_sinopsis.setBounds(18, 375, 263, 86);
		contentPane.add(lbl_sinopsis);
		
		JLabel lbl_calif = new JLabel("*****");
		lbl_calif.setForeground(new Color(255, 215, 0));
		lbl_calif.setFont(new Font("Tahoma", Font.BOLD, 24));
		lbl_calif.setBounds(70, 349, 86, 14);
		contentPane.add(lbl_calif);
		
		txtUsuarioComentario = new JTextField();
		txtUsuarioComentario.setText("Usuario: comentario");
		txtUsuarioComentario.setEditable(false);
		txtUsuarioComentario.setBounds(399, 125, 142, 20);
		contentPane.add(txtUsuarioComentario);
		txtUsuarioComentario.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario: respuesta");
		lblNewLabel_1.setBackground(SystemColor.activeCaption);
		lblNewLabel_1.setBounds(412, 157, 205, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblDirector = new JLabel("Director");
		lblDirector.setBounds(210, 117, 86, 14);
		contentPane.add(lblDirector);
		
		JLabel lblProductora = new JLabel("Productora");
		lblProductora.setBounds(210, 157, 94, 14);
		contentPane.add(lblProductora);
		
		JLabel lblAno = new JLabel("Año de estreno");
		lblAno.setBounds(210, 198, 142, 14);
		contentPane.add(lblAno);
		
		JLabel lblNewLabel_1_1 = new JLabel("Usuario: respuesta");
		lblNewLabel_1_1.setBackground(SystemColor.activeCaption);
		lblNewLabel_1_1.setBounds(412, 186, 205, 14);
		contentPane.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setText("Usuario: comentario");
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(399, 223, 142, 20);
		contentPane.add(textField);
		
		JLabel lblNewLabel_1_2 = new JLabel("Usuario: respuesta");
		lblNewLabel_1_2.setBackground(SystemColor.activeCaption);
		lblNewLabel_1_2.setBounds(412, 264, 205, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Usuario: respuesta");
		lblNewLabel_1_1_1.setBackground(SystemColor.activeCaption);
		lblNewLabel_1_1_1.setBounds(412, 298, 205, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField_1 = new JTextField();
		textField_1.setText("Usuario: comentario");
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(399, 335, 142, 20);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Usuario: respuesta");
		lblNewLabel_1_2_1.setBackground(SystemColor.activeCaption);
		lblNewLabel_1_2_1.setBounds(412, 375, 205, 14);
		contentPane.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Usuario: respuesta");
		lblNewLabel_1_1_1_1.setBackground(SystemColor.activeCaption);
		lblNewLabel_1_1_1_1.setBounds(412, 411, 205, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JButton btnNewButton = new JButton("Agregar Post");
		btnNewButton.setBounds(377, 84, 189, 29);
		contentPane.add(btnNewButton);
	}
}
