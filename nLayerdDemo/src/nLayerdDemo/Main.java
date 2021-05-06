package nLayerdDemo;

import nLayerdDemo.business.abstracts.ProductService;
import nLayerdDemo.business.concretes.ProductManager;
import nLayerdDemo.core.JLoggerManagerAdapter;
import nLayerdDemo.dataAccess.concretes.AbcProductDao;
import nLayerdDemo.dataAccess.concretes.HibernateProductDao;
import nLayerdDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		//todo Spring Ioc ile duzelecek
		ProductService productService = new ProductManager(new AbcProductDao()
				,new JLoggerManagerAdapter());
		/*Interfeysler somut(concrete) siniflerini referansini ozunde saxlaya bilir
		 * yuxarida ProductService interfeysdi HibernateProductDao ise somut sinifdi
		 * */
		
		Product product = new Product(1,2,"alma",12,20);
		productService.add(product);
	}

}
