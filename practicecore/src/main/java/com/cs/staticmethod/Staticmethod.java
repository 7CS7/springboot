package com.cs.staticmethod;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Staticmethod {
	@Value("#{2>5?15:30}")
private int x;
	@Value("#{ T(java.lang.Math).sqrt(144)}")
private int y;
	@Value("#{T(java.lang.Math).PI}")
	private double z;
	@Value("#{8-3>4}")
	private boolean isActive;
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Staticmethod(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public Staticmethod() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Staticmethod [x=" + x + ", y=" + y + ", z=" + z + ", isActive=" + isActive + "]";
	}

}
