package Server.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class CT_DonHang_PK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -22031318912394308L;
	
	private int donHang;
	private int sanPham;
	
	public CT_DonHang_PK() {
	}

	public int getDonHang() {
		return donHang;
	}

	public void setDonHang(int donHang) {
		this.donHang = donHang;
	}

	public int getSanPham() {
		return sanPham;
	}

	public void setSanPham(int sanPham) {
		this.sanPham = sanPham;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + donHang;
		result = prime * result + sanPham;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CT_DonHang_PK other = (CT_DonHang_PK) obj;
		if (donHang != other.donHang)
			return false;
		if (sanPham != other.sanPham)
			return false;
		return true;
	}

	
	
}
