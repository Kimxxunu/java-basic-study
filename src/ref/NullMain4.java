package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data(); // 이렇게 참조를 해줘야 NullPointerException이 발생하지 않는다.
        System.out.println("bigData.count= "+bigData.count);
        System.out.println("bigData.data= "+bigData.data);

        System.out.println("bigData.data.value= "+bigData.data.value);

        // NullPointerException이 발생하면 null값에 '.'(dot) 을 찍었다고 생각하면 문제를 쉽게 찾을 수 있다!!
    }
}
