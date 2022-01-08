package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilties.results.DataResult;
import kodlamaio.northwind.core.utilties.results.Result;
import kodlamaio.northwind.entities.concretes.Product;


@RestController //Sen bir kontrolursun demek bu
@RequestMapping("/api/products") //Böyle bir istek gelirse bu karşılaycak demek
public class ProdusctsConroller {
	//Sistemin dış dunya ile iletişim kurdugu yer bura
	//Burda android ıos gibi işlemlerde api gorevi kuran aradaki bağlantıyı kuran yer burası
	@Autowired
	private ProductService productService;
	
	
	
	public ProdusctsConroller(ProductService productService) {
		super();
		this.productService = productService;
	}



	@GetMapping("/getall") //Veri istediğmiz zaman biz buna getMapping diyoruz
	public DataResult<List<Product>> getAll(){
		return this.productService.getAll();
		
	}
	@PostMapping("/add")
	public Result add(@RequestBody Product product) {
		return this.productService.add(product);
	}
	//kodlama.io domain demek bu
	@GetMapping("getByProductName")
	public DataResult<Product> getByProductName(@RequestParam String productName){
		return this.productService.getByProductName(productName);
	}
	@GetMapping("/getAllByPage")
	public DataResult<List<Product>> getAll(int pageNo, int pageSize){
		return this.productService.getAll(pageNo,pageSize);
	}
	@GetMapping("/getAllDesc")
	DataResult<List<Product>> getAllSorted(){
		return this.productService.getAllSorted();

	}
}
