package py.edu.uaa.pooj.example.tpfinal.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;

import py.edu.uaa.pooj.example.tpfinal.dao.AlumnoDao;
import py.edu.uaa.pooj.example.tpfinal.model.Alumno;

import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Clase que tiene la responsabilidad de manejar la interfaz de usuario, 
 * En base a los datos ingresados por el usuario, crea un objeto del modelo 
 * (Alumno) y ese objeto lo persiste utilizando el DAO (AlumnoDao)
 * 
 * @author gsoria
 *
 */

//TODO faltan validaciones y limpiar los campos luego de insertar registros.

public class AlumnoView {

	
	private JFrame frmAlumnoView;
	private JTextField txtNroCedula;
	private JTextField txtNombre;
	private JTextField txtEmail;
	private JTextField txtCelular;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlumnoView window = new AlumnoView();
					window.frmAlumnoView.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AlumnoView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAlumnoView = new JFrame();
		
		//TODO los recursos de imagenes deberian poner en una ruta dentro del proyecto (ruta relativa
		//porque el path no deberia ser dependiente ni del sistema operativo ni de la ruta propia del usuario
		//cambiar C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg por algo parecido a ./imgs/Desert.jpg
		
		frmAlumnoView.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg"));
		frmAlumnoView.setTitle("ALUMNO");
		frmAlumnoView.setBounds(100, 100, 342, 291);
		frmAlumnoView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addMouseListener(new MouseAdapter() {
			
			/**
			 * Click en el boton Agregar
			 */
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				try {
					 
					//TODO antes de insertar un alumno, se debe verificar si el alumno no esta registrado ya
					//eso seria haciendo un query a la tabla, filtrando con el numero de ceula de alumno
					//eso aplica a todos los ABMS.
					
					//Se crea un objeto del modelo
					Alumno alumno = new Alumno();
					
					//Se setean las propiedades en base a lo ingresado por el usuario en la interfaz
					
					//En el caso de numero de cedula se recibe un string en el JTextField
					//Para eso se tiene que convertir el String a integer, y se hace con la instruccion Integer.valueOf(nroCedula)
					String nroCedula = txtNroCedula.getText();
					alumno.setNroCedula(Integer.valueOf(nroCedula));
					
					//Las demas propiedades no necesitan la conversion
					alumno.setNombreApellido(txtNombre.getText());
					
					alumno.setEmail(txtEmail.getText());
					
					alumno.setNroCelular(txtCelular.getText());

					AlumnoDao alumnoDao = new AlumnoDao();
					Boolean isInserted = alumnoDao.insertarAlumno(alumno);
					
					if (isInserted){
				        JOptionPane.showMessageDialog(null, "Alumno insertado correctamente", "", JOptionPane.INFORMATION_MESSAGE);

					}else{
				        JOptionPane.showMessageDialog(null, "No se pudo insertar el registro del alumno", null, JOptionPane.ERROR_MESSAGE, null);
					}
					
				} catch (SQLException e) {
		 
					System.out.println(e.getMessage());
		 
				}
			} 
		});
		
		
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//Se crea un objeto del modelo
				Alumno alumno = new Alumno();
			
				String nroCedula = txtNroCedula.getText();
				alumno.setNroCedula(Integer.valueOf(nroCedula));
				
				//Las demas propiedades no necesitan la conversion
				alumno.setNombreApellido(txtNombre.getText());
				
				alumno.setEmail(txtEmail.getText());
				
				alumno.setNroCelular(txtCelular.getText());

				AlumnoDao alumnoDao = new AlumnoDao();
				Boolean isDeleted = alumnoDao.eliminarAlumno(alumno);
			
				if (isDeleted){
			        JOptionPane.showMessageDialog(null, "Alumno eliminado correctamente", "", JOptionPane.INFORMATION_MESSAGE);
				}else{
			        JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro del alumno", null, JOptionPane.ERROR_MESSAGE, null);
				}
				
			}
		});
		
		JButton btnActualizar = new JButton("Actualizar");
		
		JLabel lblNroCedula = new JLabel("Nro.Cedula");
		
		JLabel lblNombre = new JLabel("Nombre");
		
		JLabel lblEmail = new JLabel("Email");
		
		JLabel lblCelular = new JLabel("Celular");
		
		txtNroCedula = new JTextField();
		txtNroCedula.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		
		txtCelular = new JTextField();
		txtCelular.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(frmAlumnoView.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(23)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnAgregar)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnEliminar)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnActualizar))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNroCedula)
								.addComponent(lblNombre)
								.addComponent(lblEmail)
								.addComponent(lblCelular))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(txtNroCedula, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
								.addComponent(txtNombre)
								.addComponent(txtEmail)
								.addComponent(txtCelular))))
					.addContainerGap(64, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(22)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNroCedula)
						.addComponent(txtNroCedula, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombre)
						.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmail)
						.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCelular)
						.addComponent(txtCelular, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAgregar)
						.addComponent(btnEliminar)
						.addComponent(btnActualizar))
					.addGap(32))
		);
		frmAlumnoView.getContentPane().setLayout(groupLayout);
	}
	
	
}
