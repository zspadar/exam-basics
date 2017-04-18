import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * Created by zsuzsanna.padar on 2017. 04. 18..
 */
public class Copy {
  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("copy [source] [destination]");
    } else if (args.length == 1) {
      System.out.println("No destination provided");
    } else {
      File sourceFile = new File(args[0]);
      File destinationFile = new File(args[1]);
      try {
        Files.copy(sourceFile.toPath(), destinationFile.toPath());
      } catch(IOException e) {
        System.out.println("Copy error");
      }
    }
  }
}