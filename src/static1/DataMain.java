package static1;

public class DataMain {
    public static void main(String[] args) {
        Data data1 = new Data("A");
        System.out.println("A count = " + Data.count);

        Data data2 = new Data("B");
        System.out.println("B count = " + Data.count);

    }
}
