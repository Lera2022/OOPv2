
class Printer {
    public static <T> void print(T[] items){
        for(T item : items){
            System.out.println(item);
        }
    }
}
