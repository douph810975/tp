package commands.deadlinecommand;

import manager.DeadlineManager;
import ui.TextUi;

public class ViewDeadlineCommand extends commands.Command {
    public static final String COMMAND_WORD = "view_deadline";

    /**
     * Executes the view deadline command.
     * @param ui manages user input.
     */
    @Override
    public void execute(TextUi ui) {
        DeadlineManager.printDeadlines(ui);
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
