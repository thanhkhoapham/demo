package Server.api.home;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Server.entity.SanPham.CPU;
import Server.entity.SanPham.Laptop;
import Server.entity.SanPham.SanPham;
import Server.service.SanPhamService;



@RestController
@RequestMapping("/product")
public class SanPhamApi {
	
	@Autowired
	private SanPhamService pService;
	
	@GetMapping("")
	public List<SanPham> getAllProduct(){
		return pService.getAllProduct();
	}
	
	@GetMapping("/laptop")
	public List<Laptop> getAllLaptop(){
		return pService.getAllLaptop();
	}
	
//	@GetMapping("/init")
//	public String init(){
//		pService.initData();
//		return "inited?";
//	}
	
	@GetMapping("/cpu")
	public List<CPU> getAllCPU(){
		return pService.getAllCPU();
	}
	
	@GetMapping("/{id}")
	public SanPham getProduct(@PathVariable int id){
		return pService.getProductById(id);
	}
	
	@GetMapping("/type/{id}")
	public String getProductType(@PathVariable int id){
		return pService.getProductType(id);
	}
}
