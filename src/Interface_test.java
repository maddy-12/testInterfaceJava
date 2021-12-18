import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JList;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JProgressBar;
import javax.swing.JSpinner;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JEditorPane;
import java.awt.Font;
import java.awt.Choice;
import java.awt.Panel;

public class Interface_test extends JFrame {

	//ContentPane => objet de type Jpanel => conteneur dans lequel on met tous les objets graphiques 
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface_test frame = new Interface_test();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Constructeur qui va créer la frame
	 */
	public Interface_test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//taille de la fenêtre
		setBounds(100, 100, 697, 404);
		contentPane = new JPanel();
		contentPane.setForeground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRcapitulatidDeLa = new JLabel("R\u00E9capitulatif de la commande");
		lblRcapitulatidDeLa.setBounds(225, 13, 226, 16);
		contentPane.add(lblRcapitulatidDeLa);
		
		JLabel lblFournisseur = new JLabel("Fournisseur :");
		lblFournisseur.setBounds(56, 66, 94, 16);
		contentPane.add(lblFournisseur);
		
		JLabel lblNomDeLarticle = new JLabel("Nom de l'article :");
		lblNomDeLarticle.setBounds(56, 103, 132, 16);
		contentPane.add(lblNomDeLarticle);
		
		JLabel lblFournisseur_1_1 = new JLabel("R\u00E9f\u00E9rence :");
		lblFournisseur_1_1.setBounds(56, 147, 94, 16);
		contentPane.add(lblFournisseur_1_1);
		
		JLabel lblFournisseur_1_1_1 = new JLabel("Quantit\u00E9 :");
		lblFournisseur_1_1_1.setBounds(56, 184, 94, 16);
		contentPane.add(lblFournisseur_1_1_1);
		
		JLabel lblValeurFournisseur = new JLabel("FournisseurB");
		lblValeurFournisseur.setBounds(216, 66, 226, 16);
		contentPane.add(lblValeurFournisseur);
		
		JLabel lblValeurNom = new JLabel("Akatsuki no Yona");
		lblValeurNom.setBounds(216, 103, 245, 16);
		contentPane.add(lblValeurNom);
		
		JLabel lblValeurRef = new JLabel("02154869MB");
		lblValeurRef.setBounds(216, 147, 83, 16);
		contentPane.add(lblValeurRef);
		
		JLabel lblValeurQtt = new JLabel("1155");
		lblValeurQtt.setBounds(216, 184, 56, 16);
		contentPane.add(lblValeurQtt);
		
		JButton btnPrecedent = new JButton("Pr\u00E9c\u00E9dent");
		btnPrecedent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPrecedent.setBounds(181, 296, 97, 25);
		contentPane.add(btnPrecedent);
		
		JButton btnModifier_fourni = new JButton("Modifier");
		btnModifier_fourni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModifier_fourni.setBounds(516, 62, 97, 25);
		contentPane.add(btnModifier_fourni);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAnnuler.setBounds(294, 296, 97, 25);
		contentPane.add(btnAnnuler);
		
		JButton btnValider = new JButton("Valider");
		btnValider.setBounds(405, 296, 97, 25);
		contentPane.add(btnValider);
		
		JButton btnModifier_nom = new JButton("Modifier");
		btnModifier_nom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModifier_nom.setBounds(516, 99, 97, 25);
		contentPane.add(btnModifier_nom);
		
		JButton btnModifier_ref = new JButton("Modifier");
		btnModifier_ref.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModifier_ref.setBounds(516, 143, 97, 25);
		contentPane.add(btnModifier_ref);
		
		JButton btnModifier_qtt = new JButton("Modifier");
		btnModifier_qtt.setBounds(516, 180, 97, 25);
		contentPane.add(btnModifier_qtt);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(53, 213, 560, 2);
		contentPane.add(separator);
		
		JLabel lblPrix = new JLabel("Prix :");
		lblPrix.setBounds(56, 235, 43, 16);
		contentPane.add(lblPrix);
		
		JLabel lblValeurPrix = new JLabel("23564");
		lblValeurPrix.setBounds(111, 235, 56, 16);
		contentPane.add(lblValeurPrix);
	}
}
