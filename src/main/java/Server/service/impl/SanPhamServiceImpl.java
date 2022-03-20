package Server.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Server.entity.SanPham.CPU;
import Server.entity.SanPham.Laptop;
import Server.entity.SanPham.SanPham;
import Server.repository.SanPhamRepository;
import Server.service.SanPhamService;



@Service
public class SanPhamServiceImpl implements SanPhamService{

	@Autowired
	private SanPhamRepository pRepository;
	
	@Override
	public List<SanPham> getAllProduct() {
		return pRepository.findAll();
	}

	@Override
	public SanPham getProductById(int id) {
		return pRepository.findById(id).orElse(null);
	}

	@Override
	public List<Laptop> getAllLaptop() {
		return pRepository.getAllLaptop();
	}

	@Override
	public void addProduct(SanPham product) {
		pRepository.save(product);
	}

//	@Override
//	public void initData() {
//		Laptop l1 = new Laptop();
//		l1.setTenSanPham("Laptop 1");
//		l1.setEnable(true);
//		l1.setMoTa("just a laptop?");
//		l1.setGia(999999);
//		l1.setCardDoHoa("rtx");
//		l1.setHeDieuHanh("win 11");
//		l1.setRam(8);
//		l1.setTrongLuong(2);
//		l1.setUrlHinhAnh("https://cdn.nguyenkimmall.com/images/detailed/775/10050940-laptop-dell-latitude-3420-i5-1135g7-l3420i5ssd-1.jpg");
//		
//		Laptop l2 = new Laptop();
//		l2.setTenSanPham("Laptop 2");
//		l2.setEnable(true);
//		l2.setMoTa("just a laptop but no2?");
//		l2.setGia(1234567);
//		l2.setCardDoHoa("rtx");
//		l2.setHeDieuHanh("win 10");
//		l2.setRam(16);
//		l1.setTrongLuong(1.8);
//		l2.setUrlHinhAnh("https://cdn.tgdd.vn/Products/Images/44/268712/dell-xps-17-9710-i7-xps7i7001w1-1-600x600.jpg");
//		
//		CPU c1 = new CPU();
//		c1.setTenSanPham("CPU 1");
//		c1.setEnable(true);
//		c1.setMoTa("cpu");
//		c1.setGia(55555);
//		c1.setBoNhoDem(128);
//		c1.setSoNhan(4);
//		c1.setUrlHinhAnh("https://media.bkns.vn/uploads/2020/02/cpu-la-gi.jpg");
//		
//		pRepository.save(l1);
//		pRepository.save(l2);
//		pRepository.save(c1);
//	}

	@Override
	public List<CPU> getAllCPU() {
		return pRepository.getAllCPU();
	}

	@Override
	public String getProductType(int id) {
		return pRepository.getProductType(id);
	}

	

}
