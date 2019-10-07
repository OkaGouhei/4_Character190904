class Magician extends Character implements Movable{
  private int mp;
  public void introduce(){
    System.out.println("私は魔術師だ");
    System.out.println("私の名前は" + name + "だ");
    System.out.println("ライフポイントは" + hp + "だ");
    System.out.println("マジックポイントは" + mp + "だ");
  }
  public Magician(String name,int hp,int mp){
    super(name,hp);
    this.mp = mp;
  }
  public void attack(Character character){
    System.out.println(this.name + "が" + character.name +"に魔術攻撃する。");
    int damagePoint = this.mp;
    character.damage(this ,damagePoint);
  }
  public void move(Character target){
    System.out.println(this.name + "が" + target.name +"からライフポイントを奪う");
    target.damage(this ,20);
    this.hp = +10;
  }
}


