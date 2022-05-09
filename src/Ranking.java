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
import javax.swing.JList;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

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
		setBounds(100, 100, 596, 502);
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
		
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//hacer consulta, primero nombre de pelicula, en caso de no encontrar, por nombre de director
			}
		});
		btnNewButton.setBounds(481, 10, 89, 23);
		contentPane.add(btnNewButton);
	}
}
