package com.mil0812.beautySalon.persistence.entity;

public abstract class Entity {
	private Integer id;

	public Entity(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
