class Doreja implements Movable{
  String name;
  int hp;

  public Doreja(String name,int hp){
    this.name = name;
    this.hp = hp;
  }
  public void move(Character target){
    System.out.println(this.name + "が" + target.name +"からライフポイントを奪う");
    target.hp = -10;
    this.hp = +10;
  }
}
