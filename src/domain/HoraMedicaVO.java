package domain;

public class HoraMedicaVO {
	private MedicoVO medicoVO;
	private BoxVO boxVO;
	
	public HoraMedicaVO() {
		super();
	}

	public HoraMedicaVO(MedicoVO medicoVO, BoxVO boxVO) {
		super();
		this.medicoVO = medicoVO;
		this.boxVO = boxVO;
	}

	public MedicoVO getMedicoVO() {
		return medicoVO;
	}

	public void setMedicoVO(MedicoVO medicoVO) {
		this.medicoVO = medicoVO;
	}

	public BoxVO getBoxVO() {
		return boxVO;
	}

	public void setBoxVO(BoxVO boxVO) {
		this.boxVO = boxVO;
	}
	
	
	
	

}
