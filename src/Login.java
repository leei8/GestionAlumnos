import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUsuario;

	Usuario leire = new Usuario("Leire","12345678");
	Usuario jon = new Usuario("Jon","87654321");
	private JPasswordField passwordField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		
		JLabel lblContrasena = new JLabel("Contrase\u00F1a:");
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (textFieldUsuario.getText().equals(leire.getUser()) &&
					String.valueOf(passwordField.getPassword()).equals(leire.getPassword())) {
					
					abrirVentanaComprobacion();
					
				} else {
					JOptionPane.showMessageDialog(getContentPane(), 
					"ERROR. Usuario y/o contraseña incorrectos.","Error",JOptionPane.ERROR_MESSAGE);
				}
			}

		});
		
		JLabel lblAplicacinAlumnos = new JLabel("APLICACI\u00D3N ALUMNOS");
		lblAplicacinAlumnos.setHorizontalAlignment(SwingConstants.CENTER);
		lblAplicacinAlumnos.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		passwordField = new JPasswordField();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(120)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblContrasena)
								.addComponent(lblUsuario))
							.addGap(32)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
								.addComponent(textFieldUsuario, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(53)
							.addComponent(btnAceptar)))
					.addContainerGap(119, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(50, Short.MAX_VALUE)
					.addComponent(lblAplicacinAlumnos, GroupLayout.PREFERRED_SIZE, 335, GroupLayout.PREFERRED_SIZE)
					.addGap(39))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblAplicacinAlumnos, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblUsuario))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblContrasena)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnAceptar)
					.addContainerGap(77, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	private void abrirVentanaComprobacion() {
		Comprobacion comprobacion = new Comprobacion(textFieldUsuario.getText());
		comprobacion.setVisible(true);
		dispose();
		
	}
}
