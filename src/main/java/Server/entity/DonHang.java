package Server.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "don_hang")
public class DonHang implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8144422167954630850L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private Date ngayDat;
	private int trangThai;
	
	@ManyToOne
	@JoinColumn(name = "nguoidung_id")
	private NguoiDung nguoiDung;
	
	@OneToMany(mappedBy = "donHang", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<CT_DonHang> dsChiTiet = new ArrayList<CT_DonHang>();
	
	public DonHang() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getNgayDat() {
		return ngayDat;
	}

	public void setNgayDat(Date ngayDat) {
		this.ngayDat = ngayDat;
	}

	public int getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(int trangThai) {
		this.trangThai = trangThai;
	}

	public NguoiDung getNguoiDung() {
		return nguoiDung;
	}

	public void setNguoiDung(NguoiDung nguoiDung) {
		this.nguoiDung = nguoiDung;
	}

	public List<CT_DonHang> getDsChiTiet() {
		return dsChiTiet;
	}

	public void setDsChiTiet(List<CT_DonHang> dsChiTiet) {
		this.dsChiTiet = dsChiTiet;
	}
	
	
}
