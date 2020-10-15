class PArray<T> {
    private T[] arr;

    PArray(T[] arr) {
        this.arr = arr;
    }

    public void print() {
        PArray.print(this.arr);
    }

    public static <E> void print(E[] arr) {
        for (E element : arr) {
            System.out.printf("%s, ", element);
        }
        System.out.println();
    }

    public static <E extends Comparable<E>> boolean getMaxElement(E[] arr) {
        E max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }
        System.out.println("The max element is " + max);
        return true;
    }
static class PSortArray<T>{
    private T[] arr;

    PSortArray(T[] arr) {
        this.arr = arr;
    }
    public void print1() {
        PSortArray.print1(this.arr);
    }
    public static <E> void print1(E[] arr) {
        for (E element : arr) {
            System.out.printf("%s, ", element);
        }
        System.out.println();
    }
    public static <E extends Comparable<E>> void swap(E[] a, int i, int j) {
        if (i != j) {
            E temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
    public <E extends Comparable<E>> void selectionSort(E[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j].compareTo(a[max])>0) {
                    max = j;
                }
            }
            swap(a, i, max);
        }
        for (int i = 0; i < a.length; i++)
        System.out.print(a[i] + ", ");
    }


}
  /*      public static class PrintArray {
            public <E> void print(E[] arr) {
                for (E element : arr) {
                    System.out.printf("%s, ", element);
                }
                System.out.println();
            }

            public static <T extends Comparable<T>> T max(T... elements) {
                T max = elements[0];
                for (T element : elements) {
                    if (element.compareTo(max) > 0) {
                        max = element;
                    }
                }
                return max;
            }*/


            public static void main(String args[]) {
                System.out.println("Welcome to Generics ");
                Integer[] intArray = {1, 2, 5, 4, 3};
                Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
                Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
                String[] strArray = {"Apple", "Peach", "Banana"};
                new PArray<>(intArray).print();
                new PArray<>(doubleArray).print();
               // System.out.println("Integer Max: " + max(Integer.valueOf(32), Integer.valueOf(56), Integer.valueOf(89), Integer.valueOf(3), Integer.valueOf(456), Integer.valueOf(78), Integer.valueOf(45)));
              //  System.out.println("Double Max: " + max(Double.valueOf(5.6), Double.valueOf(7.8), Double.valueOf(2.9), Double.valueOf(18.6), Double.valueOf(10.25), Double.valueOf(18.6001)));
              //  System.out.println("String Max: " + max("Strawberry", "Mango", "Apple", "Pomegranate", "Guava", "Blackberry", "Cherry", "Orange", "Date"));
              //  System.out.println("Boolean Max: " + max(Boolean.TRUE, Boolean.FALSE));

                new PArray<>(intArray).getMaxElement(intArray);
                new PArray<>(doubleArray).getMaxElement(doubleArray);
                new PArray<>(strArray).getMaxElement(strArray);

               new PSortArray<>(intArray).print1();
               new PSortArray<>(intArray).selectionSort(intArray);
            }
        }





