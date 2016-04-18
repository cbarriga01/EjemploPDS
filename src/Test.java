import javax.swing.JOptionPane;

import negocio.NegocioDirector;
import negocio.NegocioPaciente;


public class Test {
	public static void main(String[] args){
		NegocioDirector nD=new NegocioDirector();
		String salida=nD.obtenerMedicos();
		
		JOptionPane.showMessageDialog(null, salida);
		System.out.println(salida);
	}
	
	

}
