package domain;

public class HoraMedicaReservaVO {

	private HoraMedicaVO horaMedicaVO;
	private ReservaVO reservaVO;
	
	public HoraMedicaReservaVO() {
		super();
	}

	public HoraMedicaReservaVO(HoraMedicaVO horaMedicaVO, ReservaVO reservaVO) {
		super();
		this.horaMedicaVO = horaMedicaVO;
		this.reservaVO = reservaVO;
	}

	public HoraMedicaVO getHoraMedicaVO() {
		return horaMedicaVO;
	}

	public void setHoraMedicaVO(HoraMedicaVO horaMedicaVO) {
		this.horaMedicaVO = horaMedicaVO;
	}

	public ReservaVO getReservaVO() {
		return reservaVO;
	}

	public void setReservaVO(ReservaVO reservaVO) {
		this.reservaVO = reservaVO;
	}
	
	
	
	
}
