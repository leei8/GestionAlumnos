import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

public class Acciones extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JComboBox comboBoxAlumnos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Acciones dialog = new Acciones();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Acciones() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		JButton btnInsertarAlumno = new JButton("Insertar alumno");
		JButton btnBorrarAlumno = new JButton("Borrar alumno");
		JButton btnMediaDeEdad = new JButton("Media de edad");
		
		comboBoxAlumnos = new JComboBox();
		
		JLabel lblVerAlumnos = new JLabel("Ver listado de alumnos:");
		lblVerAlumnos.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(24)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnMediaDeEdad, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnBorrarAlumno, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnInsertarAlumno, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblVerAlumnos, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(comboBoxAlumnos, 0, 142, Short.MAX_VALUE))
					.addGap(61))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(45)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblVerAlumnos)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(comboBoxAlumnos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(btnInsertarAlumno)
							.addGap(18)
							.addComponent(btnBorrarAlumno)))
					.addGap(18)
					.addComponent(btnMediaDeEdad)
					.addContainerGap(76, Short.MAX_VALUE))
		);
		contentPanel.setLayout(gl_contentPanel);
	}
	
	public void aniadirAlumno (Alumno alumno){
		this.comboBoxAlumnos.addItem(alumno.getNombre() + " " + alumno.getApellido() + " - " + alumno.getEdad());
	}
}
