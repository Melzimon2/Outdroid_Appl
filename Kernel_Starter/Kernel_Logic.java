import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Kernel_Logic {
    private static int MAX_OS_VARS = 64; // maximum vars for the kernel OS
    //constant codes will be set here
    private static String OS_INFO = "KERNEL OS NONE: CONST";
    public static void start_kernel_logic() {
        Scanner start_up = new Scanner(System.in);
        System.out.print("> Start Boot?> ");
        String startup = start_up.nextLine();
        if (startup.equals("yes")) {
            System.out.print("");
        }
        else {
            System.out.println("[INFO] [OS] Bootloader halted due to input user startup");
            System.exit(1);
        }
        kernelV();
        bootkernel();
        log_kernel();
        operating_kernel();
        final_OS();
    }
    public static void kernelV() { // to verify the kernel before startup of software and hardware
        boolean mismatch_boolean = true;
        if (mismatch_boolean == true) {
            System.out.print(""); // Proceed
        }
        else {
            System.err.println("Code");
            System.exit(1); // Halt systems immediately
        }
        //String kernel_version = "Kernel: Version One(Preview)";
    }
    public static void bootkernel() { // kernel startup
        String redText = "\u001B[31m";
        String normalText = "\u001B[0m";
        String messageBoot = "BOOTLOADER KERNEL";
        System.out.println(redText + messageBoot + normalText + "\n");
        // the bytes server as memory usage locally
        byte min = -128;
        byte max = 127;
        System.out.print("Minimum Byte: " + min + "\n");
        System.out.print("Maximum Byte: " + max + "\n");
        String mistmatch_exception = "Kernel JavaLogic";
        if (mistmatch_exception.equals("Kernel JavaLogic")) {
            System.out.print(""); // Proceed
        }
        else {
            String KERNEL_mismatch = "KERNEL MISMATCH PANIC!";
            System.out.println(redText + KERNEL_mismatch + normalText + "\n" );
            throw new IllegalArgumentException("Hello"); 
        }  
    }
    public static void log_kernel() {
        // After the boot might as well make a text folder for the boot startup
        // the boot.log will contain the information.
        try (FileWriter writer = new FileWriter("bootloader.logs", false)) { // file writer for the bootlog
            // You can find this in your directory but running this in github creates it the code space files
            // Its almost the same but errors may cause changes
            writer.write("===== Bootloader Kernel Logic =====\n");
            writer.write("// Wow!\n");
            writer.write("Version: Kernel One (Preview)\n");
            writer.write("OS Ver: Official in Github");
            writer.write("Kernel: API NONE, RUNNING: OK");
            writer.write("\n");
            writer.write("[SYS] Boot starting up\n");
            writer.write("[OS] Bytes processed\n");
            writer.write("[INFO] Did not find any mismatch so good.\n");
            writer.write("[SYS] Processing final statics for setting:. Done...\n");
            writer.write("[OS] Operating Kernel for Verifying Kernel starting...\n");           
            writer.write("-End of log\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void operating_kernel() {
        // final step for kernel
        // OS will be optimized here as the bootloader is done.
        //contains code that is constant throughout the application but dosen't share function of the code
        int OS = 255; // constant
        try (FileWriter writer = new FileWriter("kernelOs.log")) {
            // File for kernel os
            // this is where api and functions are stored
            writer.write("===== KERNEL OS // wow\n");
            writer.write("[OS] Kernel Constant OS bytes set to: " + OS + "\n");
            writer.write("[OS] Max Variable for OS is set to" + const_settings.MAX_VARS_OS + "\n");
            writer.write("[OS] OS Version of Kernel Settings set to: " + const_settings.OS_VER + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static class const_settings {
        // constant settings
        // does not be seen by the OS and SYS
        // only for intended settings and not for functional use
        // only accessed for emergencies and useful functionality
        static final int MAX_VARS_OS = 64; // final limit for OS VARIBALES
        static final String OS_VER = "OS: Version 1.01"; // final version for OS Preview
    }
    private static class ERR_MESSAGE {
        // official error message when the kernel fails. 
        // official one that the system must access
        // this error is only for the Kernel Side
        // User may only get this when the Kernel fails
        // It is read only
        static final String errmessage = "[ERR] [OS] Kernel failed to boot by a error. Return and exited 2\n";
        static final String errsecond = "[INFO] [OS] [SYS] Please check your crash logs file to ensure what happend\n";
    }
    public static void final_OS() {
        // Final Step for the Kernel
        // Part where it is then transferred to the firmware bridge
        // This part is critical
        boolean final_OS = true;
        if (final_OS) {
            System.out.print("");
        }
        else {
            String RED = "\u001B[31m";
            String RESET = "\u001B[0m";
            System.out.print(RED + ERR_MESSAGE.errmessage);
            System.out.print(ERR_MESSAGE.errsecond + RESET);
            System.exit(2);
        }
        String os = "64"; // Maximum final os vars
        System.out.print("[OS] Loaded Maximum Vars: " + os + "\n");
        Path dir_firmware = Paths.get("Kernel_Starter/firmware_bridge.java");
        if (Files.exists(dir_firmware)) {
            System.out.print("\n");
            System.out.print("[OS] Verify and finding Firmware Bridge...");
            // proceeds without halting
            // OS proceeds to firmware
            System.out.println("[OS] [SYS] Connected to Firmware Bridge!");
        }
        else {
            String RED = "\u001B[31m";
            String RESET = "\u001B[0m";
            System.out.print(RED + "KERNEL PANIC ATTACK!" + RESET + "\n");
            System.out.print("SYS: OK, OS: OK\n");
            System.out.print("KRN: OK, FIRM: NO\n");
            System.out.println("[SYS] Could not find Firmware File!");
            System.out.println("[OS] HALT SYSTEMS IMMEDIATELY");
            System.exit(10); // exits and halts immediately
            //Kernel Panic Attack where it halts
            // All other systems will be shutdown
    }

   }
}