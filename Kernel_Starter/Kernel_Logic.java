import java.io.File;
import java.util.Scanner;

public class Kernel_Logic {
    public static void main(String[] args) {
        kernelV();
        bootkernel();
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
        String kernel_version = "Kernel: Version One(Preview)";
    }
    public static void bootkernel() { // kernel startup
        String redText = "\u001B[31m";
        String normalText = "\u001B[0m";
        String messageBoot = "BOOTLOADER KERNEL";
        System.out.println(redText + messageBoot + normalText + "\n");
        byte min = -128;
        byte max = 127;
        System.out.print("Minimum Byte: -128\n");
        System.out.print("Maximum Byte: 128\n");
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
 }