import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.FileWriter;
import java.io.IOException;


public class firmware_bridge {
    public static void main(String[] args) {
      Kernel_Logic.start_kernel_logic();
      Path dir_kernel_connect = Paths.get("Kernel_Starter/Kernel_Logic.java");
      if (Files.exists(dir_kernel_connect)) {
        System.out.print("hello\n");
      }
      else {
      System.exit(1);
      }
      try (FileWriter writer = new FileWriter("FirmwareBridgerOS.log")) {
        writer.write("hello");
      } catch (IOException e) {
        e.printStackTrace();
      }

    }
}