package com.cskaoyan.bean;

import java.util.*;

/**
 * Created by little Stone
 * Date 2019/3/19 Time 16:45
 */
public class CollectionData {

	String[] arrayData;
	List<String> listData;
	Set<Person> setData;
	Map<String,String> mapData;
	Properties properties;

	public String[] getArrayData() {
		return arrayData;
	}

	public void setArrayData(String[] arrayData) {
		this.arrayData = arrayData;
	}

	public List<String> getListData() {
		return listData;
	}

	public void setListData(List<String> listData) {
		this.listData = listData;
	}

	public Set<Person> getSetData() {
		return setData;
	}

	public void setSetData(Set<Person> setData) {
		this.setData = setData;
	}

	public Map<String, String> getMapData() {
		return mapData;
	}

	public void setMapData(Map<String, String> mapData) {
		this.mapData = mapData;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "CollectionData{" +
				"arrayData=" + Arrays.toString(arrayData) +
				", listData=" + listData +
				", setData=" + setData +
				", mapData=" + mapData +
				", properties=" + properties +
				'}';
	}
}
