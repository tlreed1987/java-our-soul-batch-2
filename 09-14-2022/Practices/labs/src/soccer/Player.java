
package soccer;


public class Player {
    
    private String playerName;
    private int goalsScored;
    
    public void incGoalsScored() {
        this.goalsScored++;
    }
    
    public Player(String playerName) {
        this.playerName = playerName;
    }
    
    public Player() {}

    /**
     * @return the playerName
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     * @param playerName the playerName to set
     */
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    /**
     * @return the goalsScored
     */
    public int getGoalsScored() {
        return goalsScored;
    }
    
}
