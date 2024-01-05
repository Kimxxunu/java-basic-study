package ref.ex;

import java.util.Scanner;
public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력할 주문의 개수를 입력하세요 : ");
        int n = scanner.nextInt();
        scanner.nextLine();
        ProductOrder[] productOrders = new ProductOrder[n];
        for (int i=0; i< productOrders.length; i++){
            System.out.println((i+1)+"번째 주문 정보를 입력하세요.");

            System.out.println("상품명: ");
            String productName = scanner.nextLine();

            System.out.println("가격: ");
            int price = scanner.nextInt();

            System.out.println("수량: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            productOrders[i] = createOrder(productName,price,quantity);
        }

//        productOrders[0] = createOrder("두부",2000,2);
//        productOrders[1] = createOrder("김치",5000,1);
//        productOrders[2] = createOrder("콜라",1500,2);
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
