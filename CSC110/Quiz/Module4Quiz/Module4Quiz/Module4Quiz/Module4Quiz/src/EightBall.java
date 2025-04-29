public class EightBall {
    private String positive1 = "It is certain";
    private String positive2 = "As I see it, yes";
    private String positive3 = "Yes definitely";
    private String mid1 = "Cannot predict now";
    private String mid2 = "Ask again later";
    private String negative1 = "Don’t count on it";
    private String negative2 = "My sources say no";
    private String negative3 = "Very doubtful";


    public String shake () {
        String answer = "";
        int ranNum = (int)(Math.random() * (8 - 1 + 1)) + 1;
        switch (ranNum){
            case 1:
            answer = positive1;
                break;
                case 2:
            answer = positive2;
                break;
                case 3:
            answer = (positive3);
                break;
                case 4:
            answer = (mid1);
                break;
                case 5:
            answer = (mid2);
                break;
                case 6:
            answer = (negative1);
                break;
                case 7:
            answer = (negative2);
                break;
                case 8:
            answer = (negative3);
                break;
        }


        return answer;
    }

}
