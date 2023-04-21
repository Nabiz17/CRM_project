import java.util.Comparator;

public class transactionDateComparator implements Comparator<Transaction> {

  @Override
  public int compare(Transaction o1, Transaction o2) {
    if (!o1.dateOfTransaction().equals(o2.dateOfTransaction())) {
      return o1.dateOfTransaction().compareTo(o2.dateOfTransaction());
    }
    return o1.dateOfTransaction().compareTo(o2.dateOfTransaction());
  }
}
