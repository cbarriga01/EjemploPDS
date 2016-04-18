package domain;

public class PacienteVO {
	
	private PersonaVO personaVO;

	public PacienteVO() {
		super();
	}
	
	
	public PacienteVO(PersonaVO personaVO) {
		super();
		this.personaVO = personaVO;
	}



	public PersonaVO getPersonaVO() {
		return personaVO;
	}

	public void setPersonaVO(PersonaVO personaVO) {
		this.personaVO = personaVO;
	}
	
	

}
