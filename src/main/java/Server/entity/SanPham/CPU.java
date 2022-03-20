package Server.entity.SanPham;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "cpu")
public class CPU extends SanPham{
	private String loaiCPU;
	private int soNhan;
	private String congNgheCPU;
	private int boNhoDem;
	
	public CPU() {
	}

	public String getLoaiCPU() {
		return loaiCPU;
	}

	public void setLoaiCPU(String loaiCPU) {
		this.loaiCPU = loaiCPU;
	}

	public int getSoNhan() {
		return soNhan;
	}

	public void setSoNhan(int soNhan) {
		this.soNhan = soNhan;
	}

	public String getCongNgheCPU() {
		return congNgheCPU;
	}

	public void setCongNgheCPU(String congNgheCPU) {
		this.congNgheCPU = congNgheCPU;
	}

	public int getBoNhoDem() {
		return boNhoDem;
	}

	public void setBoNhoDem(int boNhoDem) {
		this.boNhoDem = boNhoDem;
	}
	
	
}
