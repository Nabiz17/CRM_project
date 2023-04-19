import java.time.LocalDate;
import java.util.Date;

public record Transaction(LocalDate dateOfTransaction, int articleNumber, String articleName,
                          int quantity) {

  public Transaction(LocalDate dateOfTransaction,
                     Article article,
                     int quantity) {
    this(dateOfTransaction, article.getArticleNumber(), article.getArticleName(), quantity);
  }



  public String getArticleName() {
    return articleName;
  }

  public int getArticleNumber() {
    return articleNumber;
  }

  public int getQuantity() {
    return quantity;
  }

  public LocalDate getDateOfTransaction() {
    return dateOfTransaction;
  }

  @Override
  public String toString() {
    return "{" +
        dateOfTransaction +
        ", " + articleNumber + '\'' +
        ", " + articleName + '\'' +
        ", " + quantity +
        '}';
  }
}
