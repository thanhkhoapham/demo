package Server.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import Server.entity.SanPham.SanPham;

@Entity
@IdClass(CT_DonHang_PK.class)
public class CT_DonHang implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8121005158908216939L;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "donhang_id")
	private DonHang donHang;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "sanpham_id")
	private SanPham sanPham;
	
	private int soLuong;
	private double donGia;
	
	public CT_DonHang() {
	}

	public DonHang getDonHang() {
		return donHang;
	}

	public void setDonHang(DonHang donHang) {
		this.donHang = donHang;
	}

	public SanPham getSanPham() {
		return sanPham;
	}

	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	
	
}
