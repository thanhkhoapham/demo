package Server.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import Server.entity.SanPham.SanPham;

@Entity
@Table(name = "hang_san_xuat")
public class HangSanXuat implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8505588917344492414L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String tenHang;
	private String xuatXu;
	
	@OneToMany(mappedBy = "hangSanXuat", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<SanPham> dsSanPham;
	
	public HangSanXuat() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}

	public String getXuatXu() {
		return xuatXu;
	}

	public void setXuatXu(String xuatXu) {
		this.xuatXu = xuatXu;
	}

	public List<SanPham> getDsSanPham() {
		return dsSanPham;
	}

	public void setDsSanPham(List<SanPham> dsSanPham) {
		this.dsSanPham = dsSanPham;
	}
	
	
}
