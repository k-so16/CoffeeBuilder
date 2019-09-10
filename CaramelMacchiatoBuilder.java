public class CaramelMacchiatoBuilder implements Builder{
  private String milk = "";
  private String foamedMilk = "";
  private String source = "";
  private String syrup = "";
  private String size = "ショート";
  private static final String name = "キャラメルマキアート";

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
      + this.foamedMilk
      + this.source
      + this.name;
  }
}
