package com.caveofprogramming.spring.aop;

public interface ICamera {

	public abstract void snap();

	public abstract void snap(int exposure);

	public abstract String snap(String name);

	public abstract void snapNightTime();

	public abstract void snapCar(ICar car);

	void snap(double exposure);

	void snap(int i, double d);

}