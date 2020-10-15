class PArray<T>{
  private T[] arr;
  PArray(T[] arr){ this.arr = arr ; }
  public void print(){ PArray.print(this.arr); }
    public static <E> void print(E[] arr){
        for(E element : arr){
            System.out.printf("%s, " ,element);
        }System.out.println();
    }

    public static <E extends Comparable<E> > void getMaxElement(E[] arr){
      E max = arr[0];
      for(int i =1;i< arr.length;i++){
          if(arr[i].compareTo(max)>0){
              max = arr[i];
             }
          }
        System.out.println(max);
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
        new PArray<>(intArray).print();
        new PArray<>(intArray).getMaxElement(intArray);
        PrintArray.print(doubleArray);
        PrintArray.print(charArray);

    }
}

