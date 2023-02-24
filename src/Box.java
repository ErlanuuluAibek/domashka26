public class Box <T>{
    private static <T> T box(){
        return (T) new Box();
    }
}