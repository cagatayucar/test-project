package com.cagatay;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named("test")
@ViewScoped
public class testbean implements Serializable
{

	private List<String> list;

	@PostConstruct
	void init() {

		list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");

	}

	public void clear() {
		list.remove(2);
		list.remove(2);
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list)
	{
		this.list = list;
	}
}
