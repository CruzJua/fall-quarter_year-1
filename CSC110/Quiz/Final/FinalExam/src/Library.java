public class Library {
    private Game[] games = new Game[50];
    private int currentGame;


    public Game[] getGames() {
        return games;
    }

    public void addGame(String title, boolean isFavorite){
        for (int i = 0; i < games.length; i++) {
                if (games[i] == null || !games[i].getTitle().equalsIgnoreCase(title)) {
                    assert games[i] != null;
                    if (!games[i].getTitle().equalsIgnoreCase(title)) {
                        games[i] = new Game(title, isFavorite);
                        return;
                    }
                }
        }

    }

    public void removeGame(String title){
        if(searchGames(title) < games.length){
            games[currentGame - 1] = new Game();
        }

    }

    public void favoriteGame(String title){
        if(searchGames(title) < games.length){
            games[currentGame - 1].setFavorite(true);
        }

    }

    public void unfavoriteGame(String title){
        if(searchGames(title) < games.length){
            games[currentGame - 1].setFavorite(false);
        }

    }

    public int searchGames(String title){
        currentGame = 0;
        for (Game game:games){
            currentGame++;
            if (title.equalsIgnoreCase(game.getTitle())){
                System.out.println(game);
            }else {
                String noGame = "[NO GAME FOUND]";
                System.out.println(noGame);

            }
        }
        return currentGame;
    }


//    Games added should be unique in your collection by name. If you try to add with the same name, it should not be added.
//    Remove a game by name (should do nothing if the game is not found)
//    Favorite a game by name (should do nothing if the game is not found)
//    Un-Favorite a game by name (should do nothing if the game is not found)
//    Get all games as a collection (used for LibraryRunner display)

}
