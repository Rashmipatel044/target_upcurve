package com.springcore.expression;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
@Component
public class Demo {
	@Value("#{22+31}")
    private int x;
	@Value("#{20+38+38}")
    private int y;
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private double z;
	
	@Value("#{T(java.lang.Math).PI}")
	private double e;
	
	
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	
	
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + "]";
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
}
