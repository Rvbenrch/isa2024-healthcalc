package program.gui;

import java.awt.event.ActionListener;

import javax.swing.UIManager;

import java.awt.Color;
import java.awt.event.ActionEvent;
import program.HealthCalcImpl;


public class Controller implements ActionListener{

	private char gender = 'x';
	private int height = 0;
	private int age = 0;
	private float weight = 0;
	private HealthCalcImpl calculadora = new HealthCalcImpl();
	private view vista;
	
	public Controller(HealthCalcImpl calc, view gui) {
		this.calculadora = calc;
		this.vista = gui;
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	    String comando = e.getActionCommand();

	    switch (comando) {
	        case "maleButton":
	        	vista.getMaleButton().setBackground(new Color(244, 182, 194));
				vista.getFemaleButton().setBackground(Color.WHITE);
				gender = 'm';
	            break;
	        case "femaleButton":
	        	gender = 'w'; // Establecer el género como femenino
	            vista.getFemaleButton().setBackground(Color.GREEN); // Cambiar el color del botón femenino
	            vista.getMaleButton().setBackground(UIManager.getColor("Button.background")); // Restaurar el color del botón masculino
	            break;
	        case "getBMR":
	            try {
	                height = Integer.parseInt(vista.getHeightValue().getText());
	                weight = Float.parseFloat(vista.getWeightValue().getText());
	                age = (Integer) vista.getAgeValue().getValue();

	                // Verificar si los campos están llenos y los datos son válidos
	                if (height <= 0 || weight <= 0 || age <= 0) {
	                    vista.noInputsErr();
	                    return;
	                }

	                // Calcular el BMR
	                float bmr = this.calculadora.basalMetabolicRate(weight, height, gender, age);
	                vista.setBMRResults(bmr);
	            } catch (NumberFormatException e1) {
	                vista.invalidInputsBMR("Ingrese números válidos para altura, peso y edad.");
	            } catch (Exception e2) {
	                vista.invalidInputsBMR(e2.getMessage());
	            }
	            break;
	        case "getIdealW":
	            try {
	                height = Integer.parseInt(vista.getHeightValue().getText());

	                // Verificar si el campo de altura está lleno y el dato es válido
	                if (height <= 0) {
	                    vista.noInputsErr();
	                    return;
	                }

	                // Calcular el peso ideal
	                float idealWeight = this.calculadora.idealWeight(height, gender);
	                vista.setIdealWResults(idealWeight);
	            } catch (NumberFormatException e1) {
	                vista.invalidInputsIdealWError("Ingrese un número válido para la altura.");
	            } catch (Exception e2) {
	                vista.invalidInputsIdealWError(e2.getMessage());
	            }
	            break;
	    }
	}


}