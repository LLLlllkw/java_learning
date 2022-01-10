import java.lang.reflect.Array;
import java.util.Arrays;
/* 数组的创建 */

public class Demo02_Array {
    void print_array(int[] test_array) {
        System.out.println(test_array);  // 直接打印打印的是地址
        System.out.println(Arrays.toString(test_array));  // Arrays类里面的toString方法可以把基本类型的数组直接打印
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};  // 数组创建方式1 创建时指定元素
        int[] arr2 = new int[5];  // 数组创建方式2 创建时指定数组大小，默认值为0
        int arr3[] = new int[5];  // 数组创建方式3 感觉有点变扭，把 '[]' 写在变量名上
        // java 执行单元测试时注意
        //     main方法不是类中的方法(虽然他确实是在类中)
        //     所以如果你要执行其他在类中的方法，需要在 main 中新建类的实例，然后用实例调
        Demo02_Array array_printer = new Demo02_Array();
        array_printer.print_array(arr1);
        array_printer.print_array(arr2);
        array_printer.print_array(arr3);
    }


}
