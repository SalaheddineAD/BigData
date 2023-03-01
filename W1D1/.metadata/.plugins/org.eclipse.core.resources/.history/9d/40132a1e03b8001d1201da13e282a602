package myPackage;

import java.util.ArrayList;
import java.util.List;

public class GroupByPair <K,V> {
	private K key;
	private List<V> listValue;
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public List<V> getListValue() {
		return listValue;
	}
	public void setListValue(List<V> listValue) {
		this.listValue = listValue;
	}
	public GroupByPair(K key, List<V> listValue) {
		super();
		this.key = key;
		this.listValue = listValue;
	}
	public GroupByPair(K key) {
		super();
		this.key = key;
		this.listValue = new ArrayList<V>();
	}
	public void add(V value) {
		this.listValue.add(value);
	}
	
}
