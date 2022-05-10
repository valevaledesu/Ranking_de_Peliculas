package src;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.ImageIcon;

public class Ranking extends JFrame {

	private JPanel contentPane;
	private JTextField txtBuscaPorPelicula;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ranking frame = new Ranking();
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
	public Ranking() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 596, 506);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtBuscaPorPelicula = new JTextField();
		txtBuscaPorPelicula.setBorder(new RoundedBorder(20));
		txtBuscaPorPelicula.setText("Busca por pelicula o director");
		txtBuscaPorPelicula.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtBuscaPorPelicula.setText("");
			}
		});
		
		txtBuscaPorPelicula.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
		txtBuscaPorPelicula.setBounds(10, 11, 461, 20);
		contentPane.add(txtBuscaPorPelicula);
		txtBuscaPorPelicula.setColumns(10);
		
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//hacer consulta, primero nombre de pelicula, en caso de no encontrar, por nombre de director
			}
		});
		btnNewButton.setBounds(481, 10, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel portada1 = new JLabel("New label");
		portada1.setIcon(new ImageIcon(Ranking.class.getResource("/portadas/climax.jpg")));
		portada1.setBounds(10, 46, 148, 159);
		contentPane.add(portada1);
		
		JLabel lblcalif = new JLabel("Calificacion");
		lblcalif.setBounds(51, 311, 76, 14);
		contentPane.add(lblcalif);
		
		JLabel lblnombre = new JLabel("Director");
		lblnombre.setBounds(51, 260, 46, 14);
		contentPane.add(lblnombre);
		
		JLabel lblNewLabel_1_1 = new JLabel("TITULO");
		lblNewLabel_1_1.setBounds(51, 216, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(481, 374, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("New button");
		btnNewButton_1_1.setBounds(25, 374, 89, 23);
		contentPane.add(btnNewButton_1_1);
		
		JLabel portada1_1 = new JLabel("New label");
		portada1_1.setBounds(193, 46, 148, 159);
		contentPane.add(portada1_1);
		
		JLabel lblcalif_1 = new JLabel("Calificacion");
		lblcalif_1.setBounds(240, 311, 76, 14);
		contentPane.add(lblcalif_1);
		
		JLabel portada1_1_1 = new JLabel("New label");
		portada1_1_1.setBounds(401, 46, 148, 159);
		contentPane.add(portada1_1_1);
		
		JLabel lblcalif_1_1 = new JLabel("Calificacion");
		lblcalif_1_1.setBounds(453, 311, 76, 14);
		contentPane.add(lblcalif_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("TITULO");
		lblNewLabel_1_1_1.setBounds(240, 216, 46, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("TITULO");
		lblNewLabel_1_1_2.setBounds(453, 216, 46, 14);
		contentPane.add(lblNewLabel_1_1_2);
		
		JLabel lblnombre_1 = new JLabel("Director");
		lblnombre_1.setBounds(240, 260, 46, 14);
		contentPane.add(lblnombre_1);
		
		JLabel lblnombre_2 = new JLabel("Director");
		lblnombre_2.setBounds(453, 260, 46, 14);
		contentPane.add(lblnombre_2);
	}
}
