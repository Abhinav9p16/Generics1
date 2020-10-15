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
        System.out.println("The max element is " +max);
      }
}
public class PrintArray {
    public static <E> void print(E[] arr){
        for(E element : arr){
            System.out.printf("%s, " ,element);
        }System.out.println();
    }
    public static <T extends Comparable<T>> T max(T... elements) {
        T max = elements[0];
        for (T element : elements) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public static void main(String args[]) {
        System.out.println("Welcome to Generics ");
        Integer[] intArray = { 1, 2, 5, 4, 3 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = {'H','E','L','L','O'};
        String[] strArray = {"Apple", "Peach","Banana"};
        new PArray<>(intArray).print();
        new PArray<>(doubleArray).print();
        System.out.println("Integer Max: " + max(Integer.valueOf(32), Integer.valueOf(56), Integer.valueOf(89), Integer.valueOf(3), Integer.valueOf(456), Integer.valueOf(78), Integer.valueOf(45)));
        System.out.println("Double Max: " + max(Double.valueOf(5.6), Double.valueOf(7.8), Double.valueOf(2.9), Double.valueOf(18.6), Double.valueOf(10.25), Double.valueOf(18.6001)));
        System.out.println("String Max: " + max("Strawberry", "Mango", "Apple", "Pomegranate", "Guava", "Blackberry", "Cherry", "Orange", "Date"));
        System.out.println("Boolean Max: " + max(Boolean.TRUE, Boolean.FALSE));
        new PArray<>(intArray).getMaxElement(intArray);
        new PArray<>(doubleArray).getMaxElement(doubleArray);
        new PArray<>(strArray).getMaxElement(strArray);
        PrintArray.print(doubleArray);
        PrintArray.print(charArray);


    }
}

