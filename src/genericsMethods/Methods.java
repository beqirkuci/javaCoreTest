package genericsMethods;



public class Methods {
    public <T> Cup<T>  load (T liquid){
        return new Cup<>(liquid);
    }
}
