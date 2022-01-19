package FactoryMethod;

/**
 * @Description:
 * @Author: yanzhihao
 * @Date: 2022/1/19 11:03 上午
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        IFactory factory = new ProductFactory();
        IProduct product = factory.createProduct();
        product.productMethod();

        IFactory factory2 = new Product2Factory();
        IProduct product2 = factory2.createProduct();
        product2.productMethod();
    }
}
