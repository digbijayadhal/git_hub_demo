public class HeapDemo implements Cloneable{
    int i = 100;
    int j = 200;

    public static void main(String[] args) throws CloneNotSupportedException{
        HeapDemo h1 = new HeapDemo();
        HeapDemo h2 = (HeapDemo)h1.clone();

       

        h1.i = 1000;
        h1.j = 2000;

        System.out.println(h1.i+" "+h1.j);


       
    }

}
