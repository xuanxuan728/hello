/**
 * @author Administrator
 * @create 2019-12-15 16:04
 */
public class Array {
    public static void main(String[] args) {

    }
}
class ArrayQueye{
    private int maxSize;//表示数组的对大容量
    private  int front;//队列头
    private  int rear;//队列尾
    private  int[] arr;//该数据用于存放数据，模拟队列
    //创建队列的构造器
    public ArrayQueye(int arrMaxSize){
        maxSize=arrMaxSize;
        arr=new int [maxSize];
        front=-1;//指向队列头部，分析出front是指向队列的前一个位置，
        rear=-1;//指向队列尾，指向队列尾的数据（即就是队列最后一个数据）

    }

}