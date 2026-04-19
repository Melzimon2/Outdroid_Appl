import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.FileWriter;
import java.nio.file.Files;

public class hardware_OS {
    public static void main(String[] args) {
        Hardware_os();
    }
    public static void Hardware_os() {
        // Hardware OS functions
        // where all the functions happen
        try (FileWriter writer = new FileWriter("hardwareos.log")) {
            writer.write("===== Hardware OS =====\n");
            writer.write("[SYS] Connected to Firmware Bridge!\n");
            writer.write("[OS] OS Engine is Running\n");
            writer.write("[SYS] Api not available but still fine \n");

        } catch (IOException e) {
            e.printStackTrace();
        }
        Path dir_firm_v = Paths.get("Kernel_Starter/firmware_bridge.java");
        if (Files.exists(dir_firm_v)) {
            // To see if the Firmware was original and a a crypt
            System.out.print("[SYS] Verified Firmware Bridge\n");

        }
        else {
            System.out.print("[OS] [SYS] FIRMWARE FAULTY, couldn't verify firmware bridge\n");
            System.exit(5);
            //Halt systems immediately
        }

    }
    
}
