import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Comprobacion extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			Comprobacion dialog = new Comprobacion();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public Comprobacion(String usuario) {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirVentanaAcciones();
			}
		});
		JLabel lblOngiEtorri = new JLabel("Ongi etorri " + usuario);
		lblOngiEtorri.setFont(new Font("Tahoma", Font.BOLD, 25));
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
					.addContainerGap(100, Short.MAX_VALUE)
					.addComponent(lblOngiEtorri, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(143)
					.addComponent(btnContinuar)
					.addContainerGap(202, Short.MAX_VALUE))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(87)
					.addComponent(lblOngiEtorri)
					.addGap(18)
					.addComponent(btnContinuar)
					.addContainerGap(92, Short.MAX_VALUE))
		);
		contentPanel.setLayout(gl_contentPanel);
	}
	private void abrirVentanaAcciones() {
		Acciones acciones = new Acciones();
		acciones.setVisible(true);
		dispose();
		
	}
}
