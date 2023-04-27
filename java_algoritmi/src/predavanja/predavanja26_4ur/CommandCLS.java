package predavanja.predavanja26_4ur;

public class CommandCLS {

    private String command;

    public CommandCLS(String cmd) {
        this.command = cmd;
    }

    @Override
    public String toString() {
        return "CommandCLS{" +
                "command='" + command + '\'' +
                '}';
    }
}
