package July6;

public class BoxMain {
    public static void main(String[] args) {


         Box<Integer,String> box = new Box<Integer, String>(101,"Ipad");
        System.out.println(box.item1 + " " + box.item2);

    }
}
