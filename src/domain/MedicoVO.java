package domain;

public class MedicoVO {
	
	private PersonaVO personaVO;
	private EspecialidadVO especialidadVO;

	public MedicoVO() {
		super();
	}
	
	public MedicoVO(PersonaVO personaVO, EspecialidadVO especialidadVO) {
		super();
		this.personaVO = personaVO;
		this.especialidadVO = especialidadVO;
	}
	
		public EspecialidadVO getEspecialidadVO() {
		return especialidadVO;
	}

	public void setEspecialidadVO(EspecialidadVO especialidadVO) {
		this.especialidadVO = especialidadVO;
	}

	public PersonaVO getPersonaVO() {
		return personaVO;
	}

	public void setPersonaVO(PersonaVO personaVO) {
		this.personaVO = personaVO;
	}
	
	

}
