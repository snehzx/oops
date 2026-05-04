public class singelton {
    private singelton(){

    }
    private static singelton instance;
    public static singelton getInstance(){
        if(instance == null){
            instance = new singelton();
        }
        return instance;
    }
    public static void main(String[] args) {
        // singelton obj  = new singelton();
        // singelton obj2 = new singelton();
        // both of the obj points to the same ref var
    }
}
