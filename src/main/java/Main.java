import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Assalomu alaykum matematika dasturiga xush kelibsiz");
        Scanner scanner = new Scanner(System.in);
        int n;
        while (true) {
            System.out.print("1 -> Qo'shish, ayirish, ko'paytirish va bo'lishni hisoblash\n" +
                    "2 -> Kiritilgan raqamni faktorialini aniqlash\n" +
                    "3 -> Kiritilgan 2ta raqamni ekubini va ekukini hisoblash\n" +
                    "0 -> Dasturni tugatish\n" +
                    "Biror bir xizmatni tanlang: ");
            n = scanner.nextInt();
            switch (n) {
                case 1:
                    String e = scanner.nextLine();
                    String s = scanner.nextLine();
                    calculate(s);
                    break;
                case 2:
                    //Todo Hindolbek funksiya yozadi
                case 3:
                    //Todo Abdulloh funksiya yozadi
                case 0:
                    System.out.println("Bizning xizmatlardan foydalanganingiz uchun raxmat.");
                    System.exit(1);
            }
        }
    }
 static void calculate(String s){
     ScriptEngineManager mgr = new ScriptEngineManager();
     ScriptEngine engine = mgr.getEngineByName("Java");
     try {
         System.out.println(engine.eval(s));
     } catch (ScriptException e) {
         throw new RuntimeException(e);
     }
 }
}

