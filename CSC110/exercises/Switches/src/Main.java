public class Main {
    public static void main(String[] args) {
        rateAnime("MHA");
    }

    public static void rateGame(String game){

        int age = 20;

        if (age < 0){
            System.out.println("you're not born yet");
        }

        if (game == "Titanfall 2"){
            System.out.println("mid");
        } else if (game == "call of duty blackops 2") {
            System.out.println("peak");
        } else if (game == "dark souls remastered") {
            System.out.println("10/10 would die again");
        } else if (game == "saint row 2") {
            System.out.println("funny, better than GTA all of time");
        }else{
            System.out.println("no game specified");
        }
    }

    public static void rateAnime(String anime){
        switch (anime){
            case "demon slayer":
                System.out.println("3/5");
                break;
            case "jujustu kaisen":
                System.out.println("Peak");
                break;
            case "MHA":
                System.out.println("3/10");
                break;
            case "bleach":
                System.out.println("10/10");
                break;
            case "Black Clover":
                System.out.println("Very loud main character");
                break;
            default:
                System.out.println("You clearly don't watch any anime");
                break;
        }
    }
}