import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class transactionParser {
  final public static String SEP = ";";

  public List<Transaction> transactionParser() throws IOException {
    File TransactionFile = new File("res/Transaction.txt");
    if (!TransactionFile.exists()) {
      System.out.println("Файл не найден.");
      //Menu.menuStart();
    }

    BufferedReader br = new BufferedReader(new FileReader("res/Transaction.txt"));
    List<Transaction> Transaction = new ArrayList<>();

    for (String line = br.readLine(); line != null; line = br.readLine()) {
      int lastSep = line.indexOf(SEP);

      LocalDate dateOfTransaction = LocalDate.parse(line.substring(0, lastSep));
      line = line.substring(lastSep + 2);
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


    System.out.println(Transaction);

    br.close();
    return Transaction;
  }
}
