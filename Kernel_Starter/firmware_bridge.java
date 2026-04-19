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
      }
      else {
      System.exit(1);
      }
      try (FileWriter writer = new FileWriter("FirmwareBridgerOS.log")) {
        //creates a BridgeOS Log
        writer.write("Firmware: Official\n");
        writer.write("ClassBridge: Connected\n");
        writer.write("Exception: none\n");
      } catch (IOException e) {
        e.printStackTrace();
      }
      try (FileWriter writer = new FileWriter("Optimization.log")) {
        // Where the user could see the optimization of the firmware
        // Not really available but mostly is optimized to avoid errors
        writer.write("Optimization Setting MaxVar: " + Optimization.optimization_setting_var + "\n");
        writer.write("Config libs set to: " + Optimization.config_libs + "\n");
      } catch (IOException e) {
        e.printStackTrace();
      }
      
    }
    private static class Optimization {
      static final String optimization_setting_var = "64";
      static final boolean config_libs = true;
      // configuration libs are set to true incase of libraries
    }
    public static void final_hardware() {
      // Checking if hardware os does exist
      // final step for the firmware bridge
      Path dir_hardware = Paths.get("Hardware_OS.java");
      if (Files.exists(dir_hardware)) {
        System.out.print("");
      } else {
        System.out.print("");
        System.exit(4);
      }

    }
    private static class ERR_MES {
      static final String err_hardware = "[OS] [SYS] Couldn't find Hardware OS files! Return 4;";
      // Firmware faulty happens
      static final String Firmware_faulty = "";
    }
    
}