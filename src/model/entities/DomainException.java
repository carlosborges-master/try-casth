package model.entities;

public class DomainException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msm) {
		super(msm);
	}

}
