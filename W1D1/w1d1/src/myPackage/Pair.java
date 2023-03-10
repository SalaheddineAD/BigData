package myPackage;

public class Pair {
	private String key;
	private int value;
	public Pair(String key) {
		this.key = key;
		this.value = 1;
	}
	public Pair(String key, Integer value) {
		this.key = key;
		this.value = value;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Pair)) {
            return false;
        }
		Pair ob=(Pair)o;
		if(this.key.equals(ob.key) && this.value==ob.value ) {
			return true;
		}
		return false;
	}
	public String toString() {
		return "\n"+"key= "+this.key+", value= "+this.value;
	}
	
}
