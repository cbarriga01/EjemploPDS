package negocio;

import java.util.ArrayList;
import java.util.List;

import org.orm.PersistentException;

import com.google.gson.Gson;

import domain.BoxVO;
import domain.EspecialidadVO;
import domain.MedicoVO;
import domain.PersonaVO;

public class NegocioDirector {
	
	public String obtenerBoxs(){
		Gson gson = new Gson();
		List<BoxVO> boxVOs= new ArrayList<BoxVO>();
		
		try {
			orm.Box[] boxs=orm.BoxDAO.listBoxByQuery(null, null);

			for(int i=0; i<boxs.length;i++){
				boxVOs.add(new BoxVO(boxs[i].getNombre()));
			}
			String salida=gson.toJson(boxVOs);
			return salida;
			
		} catch (PersistentException e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		
	}

	public String obtenerMedicos(){		
		Gson gson = new Gson();
		List<MedicoVO>medicoVOs=new ArrayList<MedicoVO>();		
		try {
			orm.Medico[] medicos=orm.MedicoDAO.listMedicoByQuery(null, null);

			for(int i=0; i<medicos.length;i++){
				PersonaVO personaVO = new PersonaVO(medicos[i].getPersona().getNombres(), 
						medicos[i].getPersona().getApellidos(),
						medicos[i].getPersona().getRut(),
						medicos[i].getPersona().getF_nac(), 
						medicos[i].getPersona().getTelefono(), 
						medicos[i].getPersona().getDireccion(), 
						medicos[i].getPersona().getCiudad(), 
						medicos[i].getPersona().getEmail(), 
						medicos[i].getPersona().getActivo());
				
				EspecialidadVO especialidadVO= new EspecialidadVO(medicos[i].getEspecialidad().getNombre());
				
				medicoVOs.add(new MedicoVO(personaVO, especialidadVO));

			}
			String salida=gson.toJson(medicoVOs);
			return salida;
			
		} catch (PersistentException e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		
	}
}
