import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Program that reads files and reverses its contents.
 *
 * @author Jessah
 * @version 1.0 @2024-04-24
 */
public final class ReverseString {

  /** Private constructor to prevent instantiation of this utility class. */
  private ReverseString() {
    // whitespace
  }

  /**
   * Reverses the order of strings.
   *
   * @param input Reads the contents of input file to reverse.
   * @return Returns by calling recursive function or empty variable.
   */
  public static String recReverseStr(String input) {

    // Check if there is a length.
    if (input.length() == 0) {
      // Returns empty string.
      return "";
    } else {
      // Calls itself, takes one character (1) and indexes it to start (0).
      return recReverseStr(input.substring(1)) + input.charAt(0);
    }
  }

  /**
   * Main program.
   *
   * @param args Command-line arguments (not used in program).
   * @throws IOException
   *
   */

  // Main program.
  public static void main(final String[] args) throws IOException {

    // Create file for input.
    final File inputFile =
     new File("Unit3/Unit3-01/Unit3-01-Java-ReverseString/input.txt");
    // Create scanner to scan input.
    final Scanner input = new Scanner(inputFile);

    // Create file for output.
    final File outputFile =
     new File("Unit3/Unit3-01/Unit3-01-Java-ReverseString/output.txt");
    // Allow to file write onto output file.
     final FileWriter output = new FileWriter(outputFile);

    // Checks if file has contents.
    if (input.hasNextLine()) {
      // Declare contents as string to pass to function.
      final String line = input.nextLine();
      // Call recursive function as string.
      final String reverse = recReverseStr(line);
      // Write the reversed file onto output file.
      output.write(reverse);
    } else {
      // If there is nothing in the file.
      System.out.println("There is nothing in the file.");
    }

    // Close input and output file.
    input.close();
    output.close();

    // Display when finished file reading.
    System.out.println("File reading is finished.");
  }
}
