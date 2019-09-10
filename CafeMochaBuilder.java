public class CafeMochaBuilder implements Builder{
  private String whippedCream = "";
  private String milk = "";
  private String source = "";
  private String syrup = "";
  private String size = "ショート";
  private static final String name = "カフェモカ";

  public Builder setWhippedCream(String size) {
    this.whippedCream = size;
    return this;
  }

  public Builder setMilk(String kind) {
    this.milk = kind;
    return this;
  }

  public Builder setFoamedMilk(String size) {
    return this;
  }

  public Builder setSource(String size) {
    this.source = size;
    return this;
  }

  public Builder setSyrup(String size) {
    this.syrup = size;
    return this;
  }

  public Builder setSize(String size) {
    this.size = size;
    return this;
  }

  public String toString() {
    return this.size
      + this.syrup
      + this.milk
      + this.whippedCream
      + this.source
      + this.name;
  }
}
