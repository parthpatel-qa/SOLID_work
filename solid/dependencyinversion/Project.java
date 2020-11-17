package com.qa.community.solid.dependencyinversion;

import java.util.List;

public class Project {
	
	private List<Developer> developers;

	public Project(List<Developer> developers) {
		this.developers = developers;
	}
	
	public void develop() {
		developers.forEach(d->d.develop());
	}
	
	
}
