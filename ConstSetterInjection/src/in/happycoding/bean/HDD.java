package in.happycoding.bean;

public class HDD 
{
	private int prodId;
	private int capacity;
	
	public HDD() {
		super();
	}

	public HDD(int prodId, int capacity) {
		super();
		this.prodId = prodId;
		this.capacity = capacity;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	
	
	@Override
	public String toString() {
		return "HDD [prodId=" + prodId + ", capacity=" + capacity + "]";
	}
	
}
