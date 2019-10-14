class Doreja implements Movable{
  String name;
  int hp;

  public Doreja(String name,int hp){
    this.name = name;
    this.hp = hp;
  }
  public void move(Character target){
    System.out.println(this.name + "が" + target.name +"からライフポイントを奪う");
    target.hp -= 10;
    this.hp += 10;
    System.out.println(target.name + "が" + this.name + "から" + 10 + "の攻撃を受けた");
    System.out.println(target.name + "のライフポイントは" + target.hp + "だ");
  }
}
