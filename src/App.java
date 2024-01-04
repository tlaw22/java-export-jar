public class App {
// To Export a Jar executable in VSCODE
// Open the command palette CTRL + SHIFT + P
// Type Export
// Select Java: Export Jar

    public static void main(String[] args) throws Exception {
        System.out.println("The program run successfully");
    }
}

// To Export a jar from the terminal
// Create a mainfest.mf file and specify the main class. Main-Class: App
// The manifest must have 1 blank link below the main class decloration
// Type jar -cmf manifest.mf myjarfile.jar *.class
// into the terminal
// type java -jar myjarfile.jar to run the program
