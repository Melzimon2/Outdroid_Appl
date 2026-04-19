package OS_Entry;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Hardware_OS {
    public static void main(String[] args) {
        hardware_OS();
        
    }
    private static class official_settings {
        //The official settings code
        //Only accessed during Hardware optimization
        static final String setting = "SettingLibs: true";
        static final String hardware_version = "Hardware Version: 1";
    }
    public static void hardware_OS() {
        try (FileWriter writer = new FileWriter("hardwareos.log")) {
            // would create the file for the Hardware Os
            // can view this file
            writer.write("===== Hardware OS =====\n");
            writer.write("[SYS] Setting libs set to: " + official_settings.setting + "\n");
            writer.write("[OS] " + official_settings.hardware_version + "\n");
            writer.write("[INFO] Starting up OS");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileWriter writer = new FileWriter("booleanOS.txt")) {
            // so the user will know the boolean properties
            writer.write("Bool: true, Version: true");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Path dir_firmware = Paths.get("Kernel_Starter/firmware_bridge.java");
        if (Files.exists(dir_firmware)) {
            // to check if Firmware os does exist
            System.out.print("[OS] Checked Firmware OS!\n");
        } 
        else {
            // Firmware faulty thus Hardware faulty if not find...
            System.out.print("[OS] [SYS] Could not find Firmware OS! HALT SYSTEMS IMMEDIATELY\n");
            System.exit(3);
        }

    }
 }