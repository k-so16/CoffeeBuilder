public class CappuccinoBuilder implements Builder{
  private String milk = "";
  private String foamedMilk = "";
  private String size = "ショート";
  private static final String name = "カプチーノ";

  public Builder setWhippedCream(String size) {
    return this;
  }

  public Builder setMilk(String kind) {
    this.milk = kind;
    return this;
  }

  public Builder setFoamedMilk(String size) {
    this.foamedMilk = size;
    return this;
  }

  public Builder setSource(String size) {
    return this;
  }

  public Builder setSyrup(String size) {
    return this;
  }

  public Builder setSize(String size) {
    this.size = size;
    return this;
  }

  public String toString() {
    return this.size
      + this.milk
      + this.foamedMilk
      + this.name;
  }
}
