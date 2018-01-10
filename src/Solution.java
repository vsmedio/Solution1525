
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
1. Инициализируй переменную Statics.FILE_NAME полным путем к файлу с данными, который содержит несколько строк.
2. В статическом блоке считай из файла с именем Statics.FILE_NAME все строки и добавь их по отдельности в List lines.


Требования:
1. Константа FILE_NAME не должна быть пустой.
2. В статическом блоке все строки из файла с именем FILE_NAME должны быть добавлены по-отдельности в список lines.
3. Поле FILE_NAME НЕ должно быть final.
4. Класс Solution должен содержать список lines.
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        try {
            BufferedReader freader = new BufferedReader(new InputStreamReader(new FileInputStream(Statics.FILE_NAME),
                    "Windows-1251"));

            while (freader.ready()) {
                String s = freader.readLine();
                lines.add(s);
            }
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File "+Statics.FILE_NAME+" not found!");
        } catch (IOException e) {
            System.out.println("ERROR: File "+Statics.FILE_NAME+" can't read!");
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}