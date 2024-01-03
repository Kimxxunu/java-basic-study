package ref;

public class MethodChange2 {
    //참조형과 메서드 호출
    public static void main(String[] args) {

        Data dateA = new Data();
        dateA.value = 10;
        System.out.println("메서드 호출 전: dateA.value = " + dateA.value);
        changeReference(dateA);
        System.out.println("메서드 호출 후: dateA.value = " + dateA.value);
    }
    // 참조값을 복사후 값을 변경했으니 dateA.value도 20이 나올 수 밖에 없음
    static void changeReference(Data dataX){
        dataX.value  = 20;
    }
}
