package domain;

public class DirectorVO {
	
	private PersonaVO personaVO;

	public DirectorVO() {
		super();
	}
	
	
	public DirectorVO(PersonaVO personaVO) {
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
