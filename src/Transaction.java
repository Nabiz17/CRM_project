import java.time.LocalDate;

public record Transaction(LocalDate dateOfTransaction, Article articleName, Article articleNumber,
                          int quantity) {

  public Transaction(LocalDate dateOfTransaction,
                     Article articleName,
                     Article articleNumber,
                     int quantity) {
    this.dateOfTransaction = dateOfTransaction;
    this.articleNumber = getArticleNumber();
    this.articleName = getArticleName();
    this.quantity = quantity;
  }

  public Article getArticleName() {
    return articleName;
  }

  public Article getArticleNumber() {
    return articleNumber;
  }

  public int getQuantity() {
    return quantity;
  }

  public LocalDate getDateOfTransaction() {
    return dateOfTransaction;
  }
}
