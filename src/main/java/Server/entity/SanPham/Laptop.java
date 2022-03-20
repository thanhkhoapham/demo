package Server.entity.SanPham;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "laptop")
public class Laptop extends SanPham{
	private String manHinh;
	private String cpu;
	private int ram;
	private String oCung;
	private String cardDoHoa;
	private String heDieuHanh;
	private double trongLuong;
	
	public Laptop() {
	}

	public String getManHinh() {
		return manHinh;
	}

	public void setManHinh(String manHinh) {
		this.manHinh = manHinh;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getoCung() {
		return oCung;
	}

	public void setoCung(String oCung) {
		this.oCung = oCung;
	}

	public String getCardDoHoa() {
		return cardDoHoa;
	}

	public void setCardDoHoa(String cardDoHoa) {
		this.cardDoHoa = cardDoHoa;
	}

	public String getHeDieuHanh() {
		return heDieuHanh;
	}

	public void setHeDieuHanh(String heDieuHanh) {
		this.heDieuHanh = heDieuHanh;
	}

	public double getTrongLuong() {
		return trongLuong;
	}

	public void setTrongLuong(double trongLuong) {
		this.trongLuong = trongLuong;
	}
	
	
}
