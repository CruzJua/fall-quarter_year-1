public class Coin {
    private Boolean face = true;
    public Boolean flipCoin () {
        int iterations = (int) (Math.random() * (5 + 1));
        for (; iterations > 0 ; iterations--) {
            face = !face;
        }
        return face;
    }


}
