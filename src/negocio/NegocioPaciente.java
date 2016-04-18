package negocio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.google.gson.Gson;

import domain.EspecialidadVO;
import domain.HoraMedicaVO;
import domain.MedicoVO;
import domain.PersonaVO;

public class NegocioPaciente {
	
	public String obtenerEspecialidades(){
		Gson gson= new Gson();
		
		List<EspecialidadVO>especialidadVOs=new ArrayList<EspecialidadVO>();
		
		try {
			orm.Especialidad[] ormEspecialidads = orm.EspecialidadDAO.listEspecialidadByQuery(null, null);

			for(int i=0; i<ormEspecialidads.length;i++){
				especialidadVOs.add(new EspecialidadVO(ormEspecialidads[i].getNombre()));
			}
			String salida=gson.toJson(especialidadVOs);
			return salida;
			
		} catch (PersistentException e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		}
	
	public String obtenerMedicoEspecialidad(String especialidad){
		Gson gson = new Gson();
		List<MedicoVO> medicoVOs= new ArrayList<MedicoVO>();
		
		try {
			orm.Especialidad ormEspecialidads = orm.EspecialidadDAO.loadEspecialidadByQuery("nombre='"+especialidad+"'", null);
			orm.Medico[] medicos =orm.MedicoDAO.listMedicoByQuery("especialidad_id= '"+ormEspecialidads.getId()+"'", null);
			
			EspecialidadVO especialidadVO=new EspecialidadVO(ormEspecialidads.getNombre());
			
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

    public String buscarHoraAPS(int medico, Date fecha1, Date fecha2){
    	Gson gson= new Gson();
    	List<HoraMedicaVO>horaMedicaVOs= new ArrayList<HoraMedicaVO>();
    	
    	try {
    		String fec="";
    		String fec2="";
    		
    		String query="medicoid='"+medico+"'"+;
    		
    		orm.Hora_medica[]hora_medicas=orm.Hora_medicaDAO.listHora_medicaByQuery("medicoid='"+, null);
    		
			orm.Medico[] medicos =orm.MedicoDAO.listMedicoByQuery("especialidad_id= '"+ormEspecialidads.getId()+"'", null);
			
			EspecialidadVO especialidadVO=new EspecialidadVO(ormEspecialidads.getNombre());
			
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
