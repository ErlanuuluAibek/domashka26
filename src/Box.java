public class Box <T>{
    public static <T> Box box(){
        return  new Box();
    }

    @Override
    public String toString() {
        return "Box{}";
    }
}