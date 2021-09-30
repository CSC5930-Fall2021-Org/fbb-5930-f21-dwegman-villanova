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
        FooBarBaz fbb = new FooBarBaz();
                
        if (args == null || args.length == 0)
        {
            //System.out.println("Enter \"batch\" or \"console\" as argument.");
            fbb.processConsole();
        }
        else {
            System.out.println("Hello " + args[0] + ".");

            if (args[0].equals("console")) {
                fbb.processConsole();
            }

            // Path filepath = Paths.get("src/resources/fbb-input.txt");
            else if (args[0].equals("batch")) {

                fbb.processBatch();
            }

        }
    }

        protected void processBatch() {
            String filename = "src/resources/fbb-input.txt";
            Scanner sc2 = null;

            String outputfile = "src/resources/fbb-actual-output.txt";
            PrintWriter writer = null;

            try {
                sc2 = new Scanner(Paths.get(filename));
                writer = new PrintWriter(outputfile);
                while (sc2.hasNextLine()) {
                    String inputb = sc2.nextLine();
                    
                    String trimb = inputb.trim();

                    try {
                        int b = Integer.parseInt(trimb);

                        if (b >= 0 && b <= 2147483647) {
                            
                            writer.print(inputb + "=");
            
                            String transformedValue = transform(b); 
                            writer.println(transformedValue);
                            
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

        protected void processConsole() {
            Scanner sc = new Scanner(System.in);
                
                System.lineSeparator();
                System.out.println("Enter the input");
                String input = sc.nextLine();
                String trim = input.trim();
                
                //String stop = "stop";
                //while
                //if (stop.equalsIgnoreCase(trim)) {
                //    break;
              //  }
                while(!"stop".equalsIgnoreCase(trim)) {
                try {
                    int n = Integer.parseInt(trim);
                    
                    if (n >= 0 && n <= 2147483647) {
                        for (int i = 0; i <= n; i++) {
                            System.out.print(i + "=");
                            
                            String transformedValue = transform(i); 
                            System.out.println(transformedValue);
                        }
                    }
                    else {
                        System.out.println(trim + "=" + "Invalid");
                    }
                }
                catch (NumberFormatException e) {
                    System.out.println(input + "=" + "Invalid");
                }
                System.out.println("Enter the input");
                input = sc.nextLine();
                trim = input.trim();
                }
                sc.close();
                
        }
        
        protected String transform(int test) {
            StringBuilder transformedValue = new StringBuilder();
            if (test % 3 == 0) {
                transformedValue.append(FOO);
            }

            if (test % 5 == 0) {
                transformedValue.append(BAR);
            }

            if (test % 7 == 0) {
                transformedValue.append(BAZ);
            }

            if (test % 7 != 0 && test % 5 != 0 && test % 3 != 0) {
                transformedValue.append(test);
            }
            return transformedValue.toString();
        }
}
