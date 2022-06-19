package Visual;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Diego
 */

public class PaginaDeIngreso extends JFrame{

    private JLabel nombre, contrasena;
    private JPanel contentPane, pnlNort, pnlbotones;
    private JTextField txtnombre;
    private JPasswordField passwordField;
    private JButton btnIngresar, btnCancelar;
    private final JLabel lblLogo = new JLabel();
    private JLabel lblImagenMicro;
    private JLabel lblImagenCantante;
    
    public PaginaDeIngreso(){
		
	super("Academia de Musica Ruiz");
	setIconImage(Toolkit.getDefaultToolkit().getImage("/src/logo.jpeg"));
	initcomponents();
    }
    public void initcomponents () {
		
	setExtendedState(MAXIMIZED_BOTH);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	contentPane = new JPanel(new BorderLayout());
	setContentPane(contentPane);
		
	pnlNort = new JPanel();
	pnlNort.setBackground(new Color(171, 0, 0));
		
	nombre = new JLabel();
	nombre.setForeground(new Color(255, 255, 255));
	nombre.setBounds(547, 319, 107, 84);
	nombre.setText("USUARIO:");
	nombre.setFont(new java.awt.Font("Yu Gothic UI", 1, 20));
	txtnombre = new JTextField(10);
	txtnombre.setLocation(728, 339);
	txtnombre.setSize(309, 55);
	txtnombre.setEnabled(true);
		
	contrasena = new JLabel();
	contrasena.setForeground(SystemColor.window);
	contrasena.setBounds(529, 413, 145, 84);
	contrasena.setText("CONTRASENA:");
	contrasena.setFont(new java.awt.Font("Yu Gothic UI", 1, 20));
	pnlNort.setLayout(null);
		
	lblImagenMicro = new JLabel("");
	lblImagenMicro.setIcon(new ImageIcon("/src/logoIco"));
	lblImagenMicro.setBounds(35, 59, 434, 666);
	pnlNort.add(lblImagenMicro);
		
	pnlNort.add(nombre);
	pnlNort.add(txtnombre);
	pnlNort.add(contrasena);
	contentPane.add(pnlNort);
		
	passwordField = new JPasswordField();
	passwordField.setBounds(728, 433, 309, 55);
	pnlNort.add(passwordField);
		
	lblLogo.setIcon(new ImageIcon("/src/logo.jpeg"));
	lblLogo.setBounds(439, 0, 716, 299);
	pnlNort.add(lblLogo);;
		
	pnlbotones = new JPanel();
	pnlbotones.setBackground(new Color(171, 0, 0));
	pnlbotones.setBounds(626, 507, 334, 61);
	pnlNort.add(pnlbotones);
	pnlbotones.setLayout(null);
		
	btnIngresar = new JButton("Ingresar");
	btnIngresar.setBounds(10, 5, 109, 29);
	pnlbotones.add(btnIngresar);
	btnIngresar.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		
	btnCancelar = new JButton("Cancelar");
	btnCancelar.setBounds(208, 5, 116, 29);
	pnlbotones.add(btnCancelar);
	btnCancelar.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		
	lblImagenCantante = new JLabel("");
	lblImagenCantante.setIcon(new ImageIcon("C:\\Users\\Diego\\Desktop\\musicaimagenes.png"));
	lblImagenCantante.setBounds(1099, 137, 434, 397);
	pnlNort.add(lblImagenCantante);
	addListeners();
		
	}
    public void addListeners() {

	btnIngresar.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
	char [] clave = passwordField.getPassword();
	String claveFinal = new String (clave);
				
            if(txtnombre.getText().equals("pepe") && claveFinal.equals("123")) {
		limpiarDatos();
		dispose();
		JOptionPane.showMessageDialog(null, "BIENVENIDO AL SISTEMA", "INGRESASTE", JOptionPane.INFORMATION_MESSAGE);
					
		PaginaDeIngreso p = new PaginaDeIngreso();
		p.setVisible(true);
				   
		}else{
		JOptionPane.showMessageDialog(null, "USUARIO O CONTRESENA ESTAN INCORRECTOS VUELVA A INGRESARLO", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
            }
    });
	btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            limpiarDatos();
	}
    });
}
        public void limpiarDatos() {
	passwordField.setText(null);
	txtnombre.setText(null);
    }
	
}
