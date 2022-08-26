import java.util.*;
class Cashier {
    int count = 0;
    int n = 0;
    int discount = 0;
    Hashtable<Integer,Double> map = new Hashtable<>();
    public Cashier(int n, int discount, int[] products, int[] prices) {
        this.n = n;
        this.discount = discount;
        for(int i=0;i<products.length;i++){
            map.put(products[i],(double)prices[i]);
        }
    }
    
    public double getBill(int[] product, int[] amount) {
        count++;
        double bill = 0;
        for(int i=0;i<product.length;i++){
            bill += map.get(product[i])*(double)amount[i];
        }
        
        if(count%n==0){
            bill = bill * ((100d-(double)discount)/100d);
        }
        return bill;
    }
}

/**
 * Your Cashier object will be instantiated and called as such:
 * Cashier obj = new Cashier(n, discount, products, prices);
 * double param_1 = obj.getBill(product,amount);
 */