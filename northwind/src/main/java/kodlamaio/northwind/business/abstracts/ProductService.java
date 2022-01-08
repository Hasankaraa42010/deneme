package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.core.utilties.results.DataResult;
import kodlamaio.northwind.core.utilties.results.Result;
import kodlamaio.northwind.entities.concretes.Product;
import org.springframework.data.jpa.repository.Query;

public interface ProductService {
	DataResult<List <Product>>  getAll();
	Result add(Product product);

	DataResult<Product> getByProductName(String productName);
	DataResult<List<Product>> getAll(int pageNo, int pageSize);
	DataResult<List<Product>> getAllSorted();
	DataResult<Product> getByProductNameAndCategory_CategoryId(String productName, int categoryId);

	DataResult<List<Product>> getByProductNameOrCategory_CategoryId(String productName, int categoryId);

	DataResult<List<Product>> getByCategoryIn(List<Integer> categories);

	DataResult<List<Product>> getByProductNameContains(String productName);

	DataResult<List<Product>> getByProductNameStartsWith(String productName);

	DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId);

}
