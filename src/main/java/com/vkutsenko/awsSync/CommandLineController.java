package com.vkutsenko.awsSync;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import java.util.Scanner;

/**
 * Controller handling command line interaction.
 */
@Controller
public class CommandLineController implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {

            printLine("enter something:");
            String text = scanner.nextLine();
            printLine("you've entered: '" + text + "'");
        }
        catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }

    private void printLine(String line) {
            System.out.print(line);
    }
}
