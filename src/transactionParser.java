import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class transactionParser {
  String SEP = ";";
  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

  List<Transaction> transactionParser;
  {
    File TransactionFile = new File("res/Transaction.txt");
    if (!TransactionFile.exists()) {
      System.out.println("Файл не найден.");
      //Menu.menuStart();
    }


    BufferedReader br;
    try {
      br = new BufferedReader(new FileReader("res/Transaction.txt"));
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    }
    List<Transaction> Transaction = new ArrayList<>();

    try {
      for (String line = br.readLine(); line != null; line = br.readLine()) {
        int lastSep = line.indexOf(SEP);


        LocalDate dateOfTransaction = LocalDate.parse(line.substring(0, lastSep), formatter);
        line = line.substring(lastSep + 1);
        lastSep = line.indexOf(SEP);


        int articleNumber = Integer.parseInt(line.substring(0, lastSep));
        line = line.substring(lastSep + 1);
        lastSep = line.indexOf(SEP);

        String articleName = line.substring(0, lastSep);

        int quantity = Integer.parseInt(line.substring(lastSep + 1));

        Transaction readedTransaction = new Transaction(dateOfTransaction, articleNumber,
            articleName, quantity);
        Transaction.add(readedTransaction);

        System.out.println(readedTransaction);
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    System.out.println(Transaction);
    try {
      br.close();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}



