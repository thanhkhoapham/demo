package Server.service;

import java.util.List;

import Server.entity.SanPham.CPU;
import Server.entity.SanPham.Laptop;
import Server.entity.SanPham.SanPham;


public interface SanPhamService {
	public List<SanPham> getAllProduct();
	public SanPham getProductById(int id);
	public String getProductType(int id);
	public List<Laptop> getAllLaptop();
	public List<CPU> getAllCPU();
	public void addProduct(SanPham product);
	
//	public void initData();
}
