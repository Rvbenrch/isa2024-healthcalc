package program.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class view {

    private JFrame frame;
    private JButton maleButton;
    private JButton femaleButton;
    private JButton calcBMR;
    private JButton calcIdealWeight;
    private JSpinner ageValue;
    private JTextField weightValue;
    private JTextField heightValue;
    private JTextField idealWeightResults;
    private JTextField bmrResults;
    private char gender; // Variable para almacenar el género
    
    public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view window = new view();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	

    public view() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(249, 246, 247));
        frame.setBounds(100, 100, 745, 607);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
       
        
        JLabel lblNewLabel = new JLabel("Health Calculator");
        lblNewLabel.setForeground(Color.black);
        lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 25));
        lblNewLabel.setBounds(265, 11, 202, 66);
        frame.getContentPane().add(lblNewLabel);
        
        JSeparator separatorvertical = new JSeparator(SwingConstants.VERTICAL);
        separatorvertical.setBounds(250, 11, 200, 550); // Establece las coordenadas y dimensiones de la línea
        separatorvertical.setForeground(Color.BLACK); 
        frame.getContentPane().add(separatorvertical); // Añade el separador al contenedor deseado
        

        JSeparator separatorHorizontal = new JSeparator(SwingConstants.HORIZONTAL);
        separatorHorizontal.setBounds(250, 300, 500, 550);
        separatorHorizontal.setForeground(Color.BLACK);
        frame.getContentPane().add(separatorHorizontal);

        JSeparator separatorHorizontal1 = new JSeparator(SwingConstants.HORIZONTAL);
        separatorHorizontal1.setBounds(250, 420, 500, 550); // Ajusta las coordenadas y dimensiones según tu diseño
        separatorHorizontal1.setForeground(Color.BLACK); // Establecer color
        frame.getContentPane().add(separatorHorizontal1); // Añadir al contenedor
        
        JSeparator separatorHorizontal2 = new JSeparator(SwingConstants.HORIZONTAL);
        separatorHorizontal2.setBounds(250, 90, 500, 550); // Ajusta las coordenadas y dimensiones según tu diseño
        separatorHorizontal2.setForeground(Color.BLACK); // Establecer color
        frame.getContentPane().add(separatorHorizontal2); // Añadir al contenedor

        
        calcIdealWeight = new JButton("Calculate Ideal Weight");
        calcBMR = new JButton("Calculate Basal MR");
        calcBMR.setFont(new Font("SansSerif", Font.PLAIN, 13));
        calcBMR.setBounds(45, 171, 173, 55);
        frame.getContentPane().add(calcBMR);
   
       
        
        calcIdealWeight.setFont(new Font("SansSerif", Font.PLAIN, 13));
        calcIdealWeight.setBounds(45, 271, 173, 55);
        frame.getContentPane().add(calcIdealWeight);
       
        
       

        
        JLabel GenderLabel = new JLabel("Gender:");
        GenderLabel.setFont(new Font("SansSerif", Font.PLAIN, 18));
        GenderLabel.setBounds(285, 310, 88, 29);
        frame.getContentPane().add(GenderLabel);
        
        
        maleButton = new JButton("Male");
        femaleButton = new JButton("Female");
        
        maleButton.setFont(new Font("SansSerif", Font.PLAIN, 15));
        maleButton.setBounds(337, 350, 121, 36);
        frame.getContentPane().add(maleButton);
        
        femaleButton.setFont(new Font("SansSerif", Font.PLAIN, 15));
        femaleButton.setBounds(532, 350, 121, 36);
        frame.getContentPane().add(femaleButton);
        
        JLabel lblAge = new JLabel("Age");
        lblAge.setFont(new Font("SansSerif", Font.PLAIN, 18));
        lblAge.setBounds(285, 131, 88, 29);
        frame.getContentPane().add(lblAge);
        
        ageValue = new JSpinner();
        ageValue.setFont(new Font("SansSerif", Font.PLAIN, 13));
        ageValue.setBounds(427, 131, 135, 36);
        frame.getContentPane().add(ageValue);
        
        JLabel lblWeight = new JLabel("Weight");
        lblWeight.setFont(new Font("SansSerif", Font.PLAIN, 18));
        lblWeight.setBounds(285, 180, 88, 29);
        frame.getContentPane().add(lblWeight);
        
        weightValue = new JTextField();
        weightValue.setBounds(427, 190, 135, 36);
        frame.getContentPane().add(weightValue);
        weightValue.setColumns(10);
        
        JLabel lblNewLabel_1 = new JLabel("kg");
        lblNewLabel_1.setFont(new Font("SansSerif", Font.PLAIN, 13));
        lblNewLabel_1.setBounds(583, 190, 49, 25);
        frame.getContentPane().add(lblNewLabel_1);
        
        JLabel lblHeight = new JLabel("Height");
        lblHeight.setFont(new Font("SansSerif", Font.PLAIN, 18));
        lblHeight.setBounds(285, 230, 88, 29);
        frame.getContentPane().add(lblHeight);
        
        heightValue = new JTextField();
        heightValue.setColumns(10);
        heightValue.setBounds(427, 240, 135, 36);
        frame.getContentPane().add(heightValue);
        
        JLabel lblNewLabel_1_1 = new JLabel("cm");
        lblNewLabel_1_1.setFont(new Font("SansSerif", Font.PLAIN, 13));
        lblNewLabel_1_1.setBounds(583, 240, 49, 25);
        frame.getContentPane().add(lblNewLabel_1_1);
        
        
        
        
        JLabel lblResults = new JLabel("Results");
        lblResults.setFont(new Font("SansSerif", Font.PLAIN, 18));
        lblResults.setBounds(285, 450, 88, 29);
        frame.getContentPane().add(lblResults);
        
        idealWeightResults = new JTextField();
        idealWeightResults.setColumns(10);
        idealWeightResults.setBounds(285, 497, 121, 36);
        frame.getContentPane().add(idealWeightResults);
        
        bmrResults = new JTextField();
        bmrResults.setColumns(10);
        bmrResults.setBounds(495, 497, 121, 36);
        frame.getContentPane().add(bmrResults);
        
        JLabel lblNewLabel_1_2 = new JLabel("kg");
        lblNewLabel_1_2.setFont(new Font("SansSerif", Font.PLAIN, 13));
        lblNewLabel_1_2.setBounds(416, 497, 49, 25);
        frame.getContentPane().add(lblNewLabel_1_2);
        
        JLabel lblNewLabel_1_2_1 = new JLabel("kcal/day");
        lblNewLabel_1_2_1.setFont(new Font("SansSerif", Font.PLAIN, 13));
        lblNewLabel_1_2_1.setBounds(650, 497, 49, 25);
        frame.getContentPane().add(lblNewLabel_1_2_1);
        
        // Agregar acción para cambiar el color del botón cuando se selecciona
        maleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                maleButton.setBackground(Color.GREEN);
                femaleButton.setBackground(UIManager.getColor("Button.background"));
            }
        });
        
        femaleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                femaleButton.setBackground(Color.GREEN);
                maleButton.setBackground(UIManager.getColor("Button.background"));
            }
        });
        
        frame.pack();
        frame.setSize(800, 600);
        frame.setVisible(true);
    }
 // Métodos para mostrar y ocultar la ventana
    public void setVisible(boolean visible) {
    	frame.setVisible(visible);
    }

    public JTextField getWeightValue() {
		return weightValue;
	}

	public JTextField getHeightValue() {
		return heightValue;
	}

	public JTextField getIdealWeightResults() {
		return idealWeightResults;
	}

	public JTextField getBMRResults() {
		return bmrResults;
	}

	public JButton getMaleButton() {
		return maleButton;
	}

	public JButton getFemaleButton() {
		return femaleButton;
	}

	public JSpinner getAgeValue() {
		return ageValue;
	}

	public JButton getCalcBMR() {
		return calcBMR;
	}

	public JButton getCalcIdealWeight() {
		return calcIdealWeight;
	}
	
	public void registrarControlador(ActionListener ctrl) {
		calcBMR.addActionListener(ctrl);
		calcBMR.setActionCommand("getBMR");
        
		calcIdealWeight.addActionListener(ctrl);
		calcIdealWeight.setActionCommand("getIdealW");
        
		maleButton.addActionListener(ctrl);
		maleButton.setActionCommand("maleButton");
        
		femaleButton.addActionListener(ctrl);
		femaleButton.setActionCommand("femaleButton");
	}
	
	public void setBMRResults(float res) {
		bmrResults.setText(String.valueOf(res));
	}
	
	public void setIdealWResults(float res) {
		idealWeightResults.setText(String.valueOf(res));
	}
	
	public void invalidInputsIdealWError(String errCode) {
		JOptionPane.showMessageDialog(frame,
				errCode,
                "Ingrese números válidos para la altura y género",
                JOptionPane.ERROR_MESSAGE);
	}
	
	public void invalidInputsBMR(String errCode) {
		JOptionPane.showMessageDialog(frame,
                errCode,
                "Ingrese números válidos para la altura, peso, género y edad",
                JOptionPane.ERROR_MESSAGE);
	}
	
	public void noInputsErr() {
		JOptionPane.showMessageDialog(frame,
                "Debe rellenar los campos necesarios antes de calcular",
                "Ha sucedido un error",
                JOptionPane.ERROR_MESSAGE);
	}
}	
	

