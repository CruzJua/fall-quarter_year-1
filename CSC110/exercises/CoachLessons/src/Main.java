public class Main {
    private static Car car1;
    private static Car car2;
    public static void main(String[] args) {
//String[] names = new String[50];
//for (int i = 0; i < 10; i++){
//    names[i] = "hi";
//}
//
//
//
//For each string in Names do something with name
//        for (String name:names){
//            if(!name.equals("no")){
//                System.out.println(name);
//            } else if (name.equals("no")) {
//                return;
//            }
//        }
        run();

    }
    public static void run(){
        car1 = new Car();
        car2 = new Car("Honda", "Accord",
                Color.SILVER, 2002,
                4, true);
        System.out.println(car1.toString());
        System.out.println();
        System.out.println(car2.toString());
        System.out.println();
        car2.setColor(Color.VIOLET);
        System.out.println(car2.toString());
    }
}