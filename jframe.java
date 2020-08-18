package exercicios;
	import java.awt.EventQueue;
	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;
	import javax.swing.JPasswordField;
	import javax.swing.JButton;
	import javax.swing.JTextField;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import java.awt.Font;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;

		public class jframe extends JFrame {
			private JTextField login;
			private JPasswordField senha;
			private JButton botaoOK;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						JFrame frame = new jframe();
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
		public jframe() {
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			JPanel painel = new JPanel();
			painel.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(painel);
			painel.setLayout(null);
			
			
			senha = new JPasswordField();
			senha.setBounds(125, 109, 150, 20);
			painel.add(senha);
			
			
			botaoOK = new JButton("OK");
			botaoOK.addActionListener(new ActionListener() {
				@SuppressWarnings("deprecation")
				public void actionPerformed(ActionEvent arg0) {
				
					
					
					if ("admin".equals(login.getText()) && "swordfish".equals(senha.getText()))
					{JOptionPane.showMessageDialog(painel, "Logado com sucesso");}
					
					else {JOptionPane.showMessageDialog(painel, "Login ou senha incorreto");}
						
				}
			});
			
			
			
			botaoOK.setFont(new Font("Tahoma", Font.BOLD, 11));
			botaoOK.setBounds(175, 227, 89, 23);
			painel.add(botaoOK);
			
			
			login = new JTextField();
			login.setBounds(125, 65, 150, 20);
			painel.add(login);
			login.setColumns(10);
			
			
			JLabel lblNewLabel = new JLabel("Login:");
			lblNewLabel.setBounds(81, 65, 46, 18);
			painel.add(lblNewLabel);
			
			
			JLabel lblSenha = new JLabel("Senha:");
			lblSenha.setBounds(81, 109, 46, 18);
			painel.add(lblSenha);
		}
		}