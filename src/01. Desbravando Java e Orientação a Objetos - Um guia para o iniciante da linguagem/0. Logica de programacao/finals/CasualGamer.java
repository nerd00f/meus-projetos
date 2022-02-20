package finals;

public class CasualGamer extends Gamer {

    @Override
    public String keyboard() {
        return "Simple keyboard...";
    }

    public String play(final String game) {

        return "Jogando "+ game;
    }
}
