package in.happycoding.bean;

public class Train 
{
	private String train_no ;
	private String train_name;
	
	public Train() {
		super();
	}

	public Train(String train_no, String train_name) {
		super();
		this.train_no = train_no;
		this.train_name = train_name;
	}

	public String getTrain_no() {
		return train_no;
	}

	public void setTrain_no(String train_no) {
		this.train_no = train_no;
	}

	public String getTrain_name() {
		return train_name;
	}

	public void setTrain_name(String i) {
		this.train_name = i;
	}

	@Override
	public String toString() {
		return "Train [train_no=" + train_no + ", train_name=" + train_name + "]";
	}
	
	
}
