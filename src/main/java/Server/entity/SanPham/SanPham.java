package Server.entity.SanPham;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import Server.entity.CT_DonHang;
import Server.entity.HangSanXuat;
import Server.entity.NhaCungCap;

@Entity
@Table(name = "san_pham")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "loai_sanpham")
public class SanPham implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1258700308128228952L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String tenSanPham;
	private double gia;
	private long soLuong;
	private String moTa;
	private String UrlHinhAnh;
	private boolean enable;
	
	@ManyToOne
	@JoinColumn(name = "nhacungcap_id")
	private NhaCungCap nhaCungCap;
	
	@ManyToOne
	@JoinColumn(name = "hangsx_id")
	private HangSanXuat hangSanXuat;
	
	@OneToMany(mappedBy = "sanPham", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<CT_DonHang> dsChiTiet = new ArrayList<CT_DonHang>();
	
	public SanPham() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenSanPham() {
		return tenSanPham;
	}

	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}

	public double getGia() {
		return gia;
	}

	public void setGia(double gia) {
		this.gia = gia;
	}

	public long getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(long soLuong) {
		this.soLuong = soLuong;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public String getUrlHinhAnh() {
		return UrlHinhAnh;
	}

	public void setUrlHinhAnh(String urlHinhAnh) {
		UrlHinhAnh = urlHinhAnh;
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}
	
	
}
