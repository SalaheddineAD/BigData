package myPackage;

import java.util.ArrayList;
import java.util.List;

public class Mapper <T> {
	private List<T> list;

	public Mapper(List<T> list) {
		super();
		this.list = list;
	}
	public Mapper() {
		super();
		this.list = new ArrayList<T>();
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}
	public void add(T element) {
//		if(!list.contains(element) )
		this.list.add(element);
	}
	
}
