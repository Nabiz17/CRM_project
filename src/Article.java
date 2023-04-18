public class Article {
  private final int articleNumber;
  private final String articleName;
  private final String category;
  private final String department;
  private double purchasePrice;
  private double retailPrice;


  public Article(int articleNumber,
                 String articleName,
                 String category,
                 String department,
                 double purchasePrice,
                 double retailPrice) {
    this.articleNumber = articleNumber;
    this.articleName = articleName;
    this.category = category;
    this.department = department;
    this.purchasePrice = purchasePrice;
    this.retailPrice = retailPrice;
  }

  public int getArticleNumber() {
    return articleNumber;
  }

  public String getArticleName() {
    return articleName;
  }

  public String getCategory() {
    return category;
  }

  public String getDepartment() {
    return department;
  }

  public double getPurchasePrice() {
    return purchasePrice;
  }

  public double getRetailPrice() {
    return retailPrice;
  }

  public void setPurchasePrice(double purchasePrice) {
    this.purchasePrice = purchasePrice;
  }

  public void setRetailPrice(double retailPrice) {
    this.retailPrice = retailPrice;
  }

}
