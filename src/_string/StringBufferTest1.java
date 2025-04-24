package _string;

public class StringBufferTest1 {

    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = new String("World");

        // 새로 배우는
        StringBuffer buffer1 = new StringBuffer(str1);
        System.out.println("수정 전 : " + System.identityHashCode(buffer1));
        // buffer1 의 값을 수정해보자
        buffer1.append(str2);
        buffer1.append("!111");
        buffer1.append("22222");
        System.out.println("수정 후 : " + System.identityHashCode(buffer1));



    }
}
