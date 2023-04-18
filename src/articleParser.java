import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class articleParser {
  final public static String SEP = ";";

  public static List<Article> articleParser() throws IOException {
    File ArticlesFile = new File("res/Articles.txt");
    if (!ArticlesFile.exists()) {
      System.out.println("Файл не найден.");
      //Menu.menuStart();
    }

    BufferedReader br = new BufferedReader(new FileReader("res/Articles.txt"));
    List<Article> Articles = new ArrayList<>();

    for (String line = br.readLine(); line != null; line = br.readLine()) {
      int lastSep = line.indexOf(SEP);

      int articleNumber = Integer.parseInt(line.substring(0, lastSep));
      line = line.substring(lastSep + 1);
      lastSep = line.indexOf(SEP);

      String articleName = line.substring(0, lastSep);
      line = line.substring(lastSep + 1);
      lastSep = line.indexOf(SEP);

      String category = line.substring(0, lastSep);
      line = line.substring(lastSep + 1);
      lastSep = line.indexOf(SEP);

      String department = line.substring(0, lastSep);
      line = line.substring(lastSep + 1);
      lastSep = line.indexOf(SEP);

      double purchasePrice = Double.parseDouble(line.substring(0, lastSep));

      double retailPrice = Double.parseDouble(line.substring(lastSep + 1));


      double margin =
          Double.parseDouble(String.valueOf(retailPrice - purchasePrice));

      Article readedArticle = new Article(articleNumber, articleName, category, department,
          purchasePrice, retailPrice, margin);
      Articles.add(readedArticle);

      System.out.println(readedArticle);
    }


    System.out.println(Articles);

    br.close();
    return Articles;
  }
}




