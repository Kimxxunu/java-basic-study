package ref;

public class VarChange2 {
    public static void main(String[] args) {
       Data dataA = new Data();
       dataA.value = 10;
       Data dataB = dataA;

        System.out.println("dateA 참조값= " + dataA);
        System.out.println("dateB 참조값= " + dataB);
        System.out.println("dateA.value = " + dataA.value);
        System.out.println("dateB.value = " + dataB.value);

        dataA.value = 20;
        System.out.println("변경 dateA.value = 20" );
        System.out.println("dateA.value = " + dataA.value);
        System.out.println("dateB.value = " + dataB.value);

        dataB.value = 30;
        System.out.println("변경 dateB.value = 30" );
        System.out.println("dateA.value = " + dataA.value);
        System.out.println("dateB.value = " + dataB.value);
        
        // 참조값(주소)이 같으니 안에 있는 값은 같을 수 밖에 없음
    }
}
