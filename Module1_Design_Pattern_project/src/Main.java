import TextProcessor.*;

import java.util.Scanner;


public class Main {
    public static void textProcessorMenu(){
        System.out.println("|    Menu   |");
        System.out.println("Bold");
        System.out.println("Italic");
        System.out.println("Underlined");
        System.out.println("ItalicBold");
        System.out.println("UnderlinedBold");
        System.out.println("UnderlinedItalic");
        System.out.println("UnderlinedItalicBold");
        System.out.println("Exit");
        System.out.println("Type menu to show commands");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TextFormatter textFormatter;
        String text;
        String choice;

        System.out.print("Enter Text: ");
        text = input.nextLine();
        textProcessorMenu();
        do{

            System.out.print("Text Format: ");
            choice = input.nextLine();
            if(choice.equalsIgnoreCase("menu"))
                textProcessorMenu();
            else if(choice.equalsIgnoreCase("bold")){
                textFormatter = new BoldFormatter(new BaseFormatter());
                System.out.println(textFormatter.format(text));
            }
            else if(choice.equalsIgnoreCase("italic")){
                textFormatter = new ItalicFormatter(new BaseFormatter());
                System.out.println(textFormatter.format(text));
            }
            else if(choice.equalsIgnoreCase("underlined")){
                textFormatter = new UnderlineFormatter(new BaseFormatter());
                System.out.println(textFormatter.format(text));
            }
            else if(choice.equalsIgnoreCase("italicbold")){
                textFormatter = new BoldFormatter(new ItalicFormatter(new BaseFormatter()));
                System.out.println(textFormatter.format(text));
            }
            else if(choice.equalsIgnoreCase("underlinedbold")){
                textFormatter = new BoldFormatter(new UnderlineFormatter(new BaseFormatter()));
                System.out.println(textFormatter.format(text));
            }
            else if(choice.equalsIgnoreCase("underlineditalic")){
                textFormatter = new ItalicFormatter(new UnderlineFormatter(new BaseFormatter()));
                System.out.println(textFormatter.format(text));
            }
            else if(choice.equalsIgnoreCase("underlineditalicbold")){
                textFormatter = new BoldFormatter(new ItalicFormatter(new UnderlineFormatter(new BaseFormatter())));
                System.out.println(textFormatter.format(text));
            }
            else if(choice.equalsIgnoreCase("exit"))
                System.out.println("Exiting...");
            else
                System.out.println("Invalid Text Formatter");
        }while(!choice.equalsIgnoreCase("exit"));
    }
}
