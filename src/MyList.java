import java.util.Arrays;

public class MyList<E> {
    private int size = 0 ;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements [];
    public  MyList(){
        elements =new Object[DEFAULT_CAPACITY];
        //tăng gấp đôi  kích  thước
    }private void ensureCapa(){
        int newSize = elements.length *2;
        elements = Arrays.copyOf(elements,newSize);
    }
    // thêm một  phần tử đầu vào cuối danh sách
    public void add (E e){
        if(size == elements.length){
            ensureCapa();
        }
        elements[size ++] =e;
    }
    //phương thức get() trả về phần tử ở vị trí thứ  i trong dah  sách
    public E get (int i){
        if(i >= size || i <0){
            throw new IndexOutOfBoundsException("Index : "+i+"size"+i);
        }
        return (E) elements[i];
    }
}
