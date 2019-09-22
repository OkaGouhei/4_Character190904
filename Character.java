import java.util.Random;
class Character{
	private String name;
	private int mp;
	private int hp;
	public Character(String  name,int hp,int mp){
		this.hp = hp;
		this.mp = mp;
		this.name = name;
	}
	public void introduce(){
		System.out.println("私の名前は" + name + "だ");
		System.out.println("ライフポイントは" + hp + "だ");
		System.out.println("マジックポイントは" + mp + "だ");
	}
	public String getName(){
		return name;
	}
	public int getHp(){
		return hp;
	}
	public void attack(Character hero){
		System.out.println(this.name + "が" + hero.name +"に攻撃する。");
		Random random = new Random();
		int damagePoint = random.nextInt(50);
		hero.damage(this ,damagePoint);
	}
	public void damage(Character hero,int damagePoint){
		this.hp -= damagePoint;
		System.out.println(this.name + "が" + hero.name + "から" + damagePoint + "の攻撃を受けた");
		System.out.println(this.name + "のライフポイントは" + this.hp + "だ");
	}
}
