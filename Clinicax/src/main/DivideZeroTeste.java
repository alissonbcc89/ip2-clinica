package main;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class DivideZeroTeste extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JTextField inputField1,inputField2,outputField;
	
	private int n1, n2;
	
	private double resultado;
	
	public DivideZeroTeste()
	{
		super("Demonstrando excecoes");
		
	Container container = getContentPane();
		
	container.setLayout(new GridLayout(3,2));
		
	container.add(			
				new JLabel("Digite o numerador", SwingConstants.RIGHT ));		
	inputField1 = new JTextField(10);				
	container.add(inputField1);			
				
				
	 container.add(			 
			 new JLabel("Digite o denominador", SwingConstants.RIGHT));	 
	 inputField2 = new JTextField(10);	 
	 container.add(inputField2);	 
	 inputField2.addActionListener(this);
	 
	 container.add(			 
			 new JLabel ("Resultado: ", SwingConstants.RIGHT)			 
			 );
	 
	 outputField = new JTextField();
	 
	 container.add(outputField);
	 
	 setSize(425,100);
	 setVisible(true);		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		DecimalFormat precision3 = new DecimalFormat("0.000");
		
		outputField.setText("");
		
		try
		{
			n1  = Integer.parseInt(inputField1.getText());
			n2 = Integer.parseInt(inputField2.getText());
			
			resultado = quociente(n1,n2);
			
			outputField.setText(precision3.format(resultado));
			
		}
		catch(NumberFormatException n)
		{
			JOptionPane.showMessageDialog(this,"Sua entrada necessita ser de dois inteiros","Formato do numero invalido",
					JOptionPane.ERROR_MESSAGE);
		}
		
		catch(ArithmeticException a)
		{
			JOptionPane.showMessageDialog(this,a.toString(),"Arithmetic Exception", JOptionPane.ERROR_MESSAGE);
			
			
		} catch (DivideZeroException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			JOptionPane.showMessageDialog(this,e1.toString(),"Divisão por zero exception", JOptionPane.ERROR_MESSAGE);
		}	
		
	}	
	public double quociente(int numerador, int denominador)
			throws DivideZeroException
	{		
		if(denominador == 0)
			throw new DivideZeroException();			
			return (double) numerador/denominador;
				
		
	}
	
	public  static void main(String args[])
	{
		DivideZeroTeste divideZeroTeste = new DivideZeroTeste();
		
		divideZeroTeste.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE	);
	}
	

}
