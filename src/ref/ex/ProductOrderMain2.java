package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];

        productOrders[0] = createOrder("두부",2000,2);
        productOrders[1] = createOrder("김치",5000,1);
        productOrders[2] = createOrder("콜라",1500,2);
        printOrders(productOrders);
        
        // Ctrl + Alt + V 하면  Introduce Variable을 한다 정말 편하다
        int totalAmount = getTotalAmount(productOrders);
        System.out.println("총 결제 금액 : "+ totalAmount);
    }

    // ProductOrder 인스턴스를 초기화 해주는 메서드
    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    static void printOrders(ProductOrder[] orders){
        for(int i=0; i<orders.length; i++){
            ProductOrder S = orders[i];
            System.out.println("상품명 : " + S.productName + ", 가격 : " + S.price+" 수량 : " + S.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders){
        int total = 0;
        for (ProductOrder order : orders) {
            total += order.price*order.quantity;
        }
        return total;
    }


}
