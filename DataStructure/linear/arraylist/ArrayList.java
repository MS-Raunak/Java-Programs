package DataStructure.linear.arraylist;

public class ArrayList {
    Object[]objects = new Object[10];
    int count=0;

    public void addElement(int element){
        if (count==objects.length)
            increaseArrayLength();
        objects[count] = element;
        count++;
    }

    public void insertAt(int element, int index){
        if (index<0 || index> objects.length)
            System.out.println("Index doesn't exist");
        if (count==size())
            increaseArrayLength();
        for (int i=size(); i>0; i--){
            objects[i] = objects[i-1];
        }
        objects[index] = element;
        count++;
    }

    public void removeEle(int index){
        if (index<0 || index> objects.length)
            System.out.println("Index doesn't exist");
        for (int i=index; i<size(); i++){
            objects[i] = objects[i+1];
        }
        count--;
    }

    public void increaseArrayLength() {
        Object []newObj = new Object[objects.length+5];
        for (int i=0; i<size(); i++){
            newObj[i] = objects[i];
        }
        objects=newObj;
    }

    public Object getElement(int index){
        if (index<0 || index> objects.length) return null;
        return objects[index];
    }

    public void setElement(int element, int index){
        if (index<0 || index> objects.length)
            System.out.println("Index doesn't exist");
        objects[index] = element;
    }

    public int size() {
        return count;
    }

    //optional
    public void display(){
        for (int i=0; i< objects.length; i++){
            System.out.print(objects[i] + " ");
        }
    }
}
