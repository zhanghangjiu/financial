import com.imooc.entity.Product;
import com.imooc.manager.ManagerApplication;
import com.imooc.manager.repository.ProductRepository;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = ManagerApplication.class)
@RunWith(SpringRunner.class)
public class Test {
    @Autowired
    private ProductRepository productRepository;
    @org.junit.Test
    public void test1(){
        List<Product> all = productRepository.findAll();
        for (Product product:all){
            System.out.println(product);
        }
    }
    @org.junit.Test
    public void test2(){
        Product one = productRepository.getOne("1");
        System.out.println(one);
    }

}
