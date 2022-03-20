package Server.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import Server.entity.SanPham.CPU;
import Server.entity.SanPham.Laptop;
import Server.entity.SanPham.SanPham;


@Repository
public interface SanPhamRepository extends JpaRepository<SanPham, Integer>{

	@Query(value = "SELECT * FROM san_pham WHERE loai_sanpham = 'laptop'", nativeQuery = true)
	List<Laptop> getAllLaptop();
	
	@Query(value = "SELECT * FROM san_pham WHERE loai_sanpham = 'cpu'", nativeQuery = true)
	List<CPU> getAllCPU();
	
	@Query(value = "SELECT loai_sanpham FROM san_pham WHERE id = ?1", nativeQuery = true)
	String getProductType(int id);
}
