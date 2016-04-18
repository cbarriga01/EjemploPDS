/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.orm.*;
public class CreateOrmclasesData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = orm.OrmclasesPersistentManager.instance().getSession().beginTransaction();
		try {
//			orm.Persona lormPersona = orm.PersonaDAO.createPersona();
//			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : reserva, medico, director, paciente, activo, ciudad, direccion, f_nac, rut, apellidos, nombres
//			lormPersona.setNombres("AAAr");
//			lormPersona.setApellidos("AAA");
//			lormPersona.setRut("0");
//			
//			SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
//			String dateInString = "19-04-1989";
//			Date date = sdf.parse(dateInString);
//			lormPersona.setF_nac(date);
//			lormPersona.setTelefono("0A0");
//			lormPersona.setDireccion("aaa");
//			lormPersona.setCiudad("CiudAAad");
//			lormPersona.setEmail("aAAaa");
//			lormPersona.setActivo(1);
//			
//			orm.PersonaDAO.save(lormPersona);
//			orm.Paciente lormPaciente = orm.PacienteDAO.createPaciente();
//			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : reserva, persona
//			orm.PacienteDAO.save(lormPaciente);
//			orm.Director lormDirector = orm.DirectorDAO.createDirector();
//			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : persona
//			orm.DirectorDAO.save(lormDirector);
			orm.Persona persona=orm.PersonaDAO.loadPersonaByORMID(1);
			orm.Especialidad especialidad=orm.EspecialidadDAO.loadEspecialidadByORMID(1);
			orm.Medico lormMedico = orm.MedicoDAO.createMedico();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : hora_medica, persona
			lormMedico.setPersona(persona);
			lormMedico.setEspecialidad(especialidad);
			orm.MedicoDAO.save(lormMedico);
//			orm.Especialidad lormEspecialidad = orm.EspecialidadDAO.createEspecialidad();
//			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : nombre
//			lormEspecialidad.setNombre("General");
//			orm.EspecialidadDAO.save(lormEspecialidad);
//			orm.Reserva lormReserva = orm.ReservaDAO.createReserva();
//			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : hora_medica, paciente, persona
//			orm.ReservaDAO.save(lormReserva);
//			orm.Hora_medica lormHora_medica = orm.Hora_medicaDAO.createHora_medica();
//			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : reserva, box, medico
//			orm.Hora_medicaDAO.save(lormHora_medica);
//			orm.Box lormBox = orm.BoxDAO.createBox();
//			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : hora_medica, nombre
//			orm.BoxDAO.save(lormBox);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateOrmclasesData createOrmclasesData = new CreateOrmclasesData();
			try {
				createOrmclasesData.createTestData();
			}
			finally {
				orm.OrmclasesPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
