public class Main {
  public static void main(String[] args) {
    Builder cafeMocha = new CafeMochaBuilder();
    cafeMocha.setWhippedCream("ライトホイップ")
      .setSource("エキストラソース")
      .setSyrup("ノンシロップ")
      .setSize("トール");
    System.out.println(cafeMocha.toString());

    Builder caramelMacchiato = new CaramelMacchiatoBuilder();
    caramelMacchiato.setSyrup("エクストラシロップ")
      .setFoamedMilk("フォーミー")
      .setSize("グランデ");
    System.out.println(caramelMacchiato.toString());

    Builder cappuccino = new CappuccinoBuilder();
    cappuccino.setMilk("ツーパーセント");
    System.out.println(cappuccino.toString());
  }
}
