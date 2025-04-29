public class Game {

    private String title;
    private boolean isFavorite;

    public String getTitle() {
        if (title != null){
            return title;
        }
        return "[NO TITLE FOUND]";
    }

    public void setTitle(String title) {
        if (title != null){
            this.title = title;
            return;
        }
        this.title = "[NO TITLE FOUND]";
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public Game(String title, boolean isFavorite){
        setTitle(title);
        setFavorite(isFavorite);
    }
    public Game(){}

    @Override
    public String toString(){
        String fav;
        if (isFavorite()){
            fav = "\n is a favorite.";
        }else {
            fav = "\n is not a favorite.";
        }
        String string = "Title: ";
        return string + getTitle() + fav;
    }
}
