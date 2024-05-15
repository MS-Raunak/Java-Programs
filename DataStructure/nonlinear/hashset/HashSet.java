package DataStructure.nonlinear.hashset;

public class HashSet {
    int default_capacity = 16;  //default size of HashSet
    double load_factor = 0.75;  //Load factor of HashSet, it means max capacity of hashSet is 75%
    Object[]arr = new Object[default_capacity];
    int size=0;

    //getting indexNum based on hashCode
    public int getIndex(Object element){
        if (element==null) return 0;
        else return Math.abs(element.hashCode() % arr.length);
        //return element == null ? 0 : Math.abs(element.hashCode() % arr.length);
    }

    //Adding element in hashSet collection
    public boolean add(Object element){
        if ((double)size / arr.length > load_factor ) increase();
        int index = getIndex(element);

        if(arr[index]==null){
            arr[index] = element;
            size++;
            return true;
        }
        return false;
    }

    //increasing hashSet capacity
    private void increase() {
        Object[]new_arr = new Object[arr.length*2];
       for (int i=0; i<size; i++){
           new_arr[i] =arr[i];
       }
       arr = new_arr;
    }

    //Checking whether the given element is available  in given HashSet or not
    public boolean contains(Object element){
        int index = getIndex(element);
        if (arr[index].equals(element) )
            return true;
        else
            return false;
    }

    //Removing given element from HashSet
    public void remove(Object element){
        int index = getIndex(element);
        if (arr[index].equals(element)) {
            arr[index] = element;
            size--;
        }
        else System.out.println("No such element found");
    }

    //Getting length of HashSet
    public int getSize(){
        return size;
    }

    //Retrieving HashSet elements
    public void display(){
        for (int i=0; i< arr.length; i++){
            if (arr[i]!=null){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();

    }
}
