import java.util.Random;
class Monster extends Character implements Movable{
  public void introduce(){
    System.out.println("私はモンスターだ");
    System.out.println("私の名前は" + name + "だ");
    System.out.println("ライフポイントは" + hp + "だ");
  }
  public Monster(String name,int hp){
    super(name,hp);
  }
  public void attack(Character character){
    System.out.println(this.name + "が" + character.name +"に攻撃する。");
    Random random = new Random();
    int damagePoint = random.nextInt(50) + 50;
    character.damage(this ,damagePoint);
  }
  public void move(Character target){
    System.out.println(this.name + "が" + target.name +"からライフポイントを奪う");
    Random random = new Random();
    int damagePoint = random.nextInt(50) + 50;
    target.damage(this ,damagePoint);
    this.hp = + ( damagePoint / 2 );
  }
}
