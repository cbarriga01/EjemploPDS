package domain;

public class ReservaVO {	
	private PersonaVO personaVO;
	private PacienteVO pacienteVO;
	
	public ReservaVO() {
		super();
	}

	public ReservaVO(PersonaVO personaVO, PacienteVO pacienteVO) {
		super();
		this.personaVO = personaVO;
		this.pacienteVO = pacienteVO;
	}

	public PersonaVO getPersonaVO() {
		return personaVO;
	}

	public void setPersonaVO(PersonaVO personaVO) {
		this.personaVO = personaVO;
	}

	public PacienteVO getPacienteVO() {
		return pacienteVO;
	}

	public void setPacienteVO(PacienteVO pacienteVO) {
		this.pacienteVO = pacienteVO;
	}
	
	
	

}
