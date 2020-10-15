class PArray<T>{
  private T[] arr;
  PArray(T[] arr){
      this.arr = arr ;
  }
  public void print(){
      PArray.print(this.arr);
  }
    public static <E> void print(E[] arr){
        for(E element : arr){
            System.out.printf("%s, " ,element);
        }System.out.println();
    }
}

public class PrintArray {

    public static <E> void print(E[] arr){
        for(E element : arr){
            System.out.printf("%s, " ,element);
        }System.out.println();
    }

    public static void main(String args[]) {
        System.out.println("Welcome to Generics ");
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = {'H','E','L','L','O'};
        //new PArray<>(intArray).print();
        PrintArray.print(doubleArray);
        PrintArray.print(charArray);
    }
}

