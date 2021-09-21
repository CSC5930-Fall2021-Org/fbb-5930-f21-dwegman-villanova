import java.nio.file.Paths;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
//import java.nio.file.Path;

public class FooBarBaz {
           private static final String BAZ = "baz";
        private static final String BAR = "bar";
        private static final String FOO = "foo";

        public static void main(String[] args) throws Exception {
        if (args == null || args.length == 0)
        // if (args[0])
        {
            System.out.println("Enter \"batch\" or \"console\" as argument.");
        }
        else {
            System.out.println("Hello " + args[0] + ".");

            if (args[0].equals("console")) {
                processConsole();
            }

            // Path filepath = Paths.get("src/resources/fbb-input.txt");
            else if (args[0].equals("batch")) {

                processBatch();
            }

        }
    }

        protected static void processBatch() {
            String filename = "src/resources/fbb-input.txt";
            Scanner sc2 = null;

            String outputfile = "src/resources/fbb-actual-output.txt";
            PrintWriter writer = null;

            try {
                sc2 = new Scanner(Paths.get(filename));
                writer = new PrintWriter(outputfile);
                while (sc2.hasNextLine()) {
                    String inputb = sc2.nextLine();
                    // System.out.println(line);
                    // writer.println(line);
                    String trimb = inputb.trim();

                    try {
                        int b = Integer.parseInt(trimb);

                        if (b >= 0 && b <= 2147483647) {
                            // for (int i=0;i<=n;i++)
                            // {
                            writer.print(inputb + "=");
                            if (b % 3 == 0 && b % 5 == 0 && b % 7 == 0 && b != 0) {
                                writer.print("foobarbaz" + "\n");
                            }
                            else if (b % 3 == 0 && b % 5 == 0 && b != 0) {
                                writer.print("foobar" + "\n");
                            }
                            else if (b % 3 == 0 && b % 7 == 0 && b != 0) {
                                writer.print("foobaz" + "\n");
                            }
                            else if (b % 5 == 0 && b % 7 == 0 && b != 0) {
                                writer.print("barbaz" + "\n");
                            }
                            else if (b % 3 == 0 && b != 0) {
                                writer.print(FOO + "\n");
                            }
                            else if (b % 5 == 0 && b != 0) {
                                writer.print(BAR + "\n");
                            }
                            else if (b % 7 == 0 && b != 0) {
                                writer.print(BAZ + "\n");
                            }
                            else {
                                // System.out.print("\n");
                                writer.print(b + "\n");
                            }
                            // }
                        }
                        else {
                            writer.print(trimb + "=" + "Invalid\n");
                        }

                    }
                    catch (NumberFormatException e) {
                        writer.print(inputb + "=" + "Invalid\n");
                    }

                }

            }
            catch (IOException e) {
                System.err.println("Unable to open file or write file.\n");
            }
            finally {
                sc2.close();
                writer.close();
            }
        }

        protected static void processConsole() {
            Scanner sc = new Scanner(System.in);
            while (true) {
                //Scanner sc = new Scanner(System.in);

                System.out.println("\nEnter the input");
                String input = sc.nextLine();
                String trim = input.trim();
                // String inputws = input.replaceAll("\\s", "");
                String stop = "stop";
                if (trim.equalsIgnoreCase(stop)) {
                    break;
                }
                try {
                    int n = Integer.parseInt(trim);
                    // while(input.equalsIgnoreCase("stop"))
                    // {

                    // int n = 110;
                    if (n >= 0 && n <= 2147483647) {
                        for (int i = 0; i <= n; i++) {
                            System.out.print(i + "=");
                            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0 && i != 0) {
                                System.out.print("foobarbaz" + "\n");
                            }
                            else if (i % 3 == 0 && i % 5 == 0 && i != 0) {
                                System.out.print("foobar" + "\n");
                            }
                            else if (i % 3 == 0 && i % 7 == 0 && i != 0) {
                                System.out.print("foobaz" + "\n");
                            }
                            else if (i % 5 == 0 && i % 7 == 0 && i != 0) {
                                System.out.print("barbaz" + "\n");
                            }
                            else if (i % 3 == 0 && i != 0) {
                                System.out.print(FOO + "\n");
                            }
                            else if (i % 5 == 0 && i != 0) {
                                System.out.print(BAR + "\n");
                            }
                            else if (i % 7 == 0 && i != 0) {
                                System.out.print(BAZ + "\n");
                            }
                            else {
                                // System.out.print("\n");
                                System.out.print(i + "\n");
                            }
                        }
                    }
                    else {
                        System.out.print(trim + "=" + "Invalid\n");
                    }
                }
                catch (NumberFormatException e) {
                    System.out.print(input + "=" + "Invalid\n");
                }
                //sc.close();
            }
            sc.close();
        }
}
