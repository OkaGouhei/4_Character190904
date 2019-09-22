import java.util.Random;
class Hero{
	private String name;
	private int mp;
	private int hp;
	public Hero(String  name,int hp,int mp){
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
	public void attack(Hero enemy){
		System.out.println(this.name + "が" + enemy.name +"に攻撃する。");
		Random random = new Random();
		int damagePoint = random.nextInt(50);
		damage(enemy ,damagePoint);
	}
	public void damage(Hero enemy ,int damagePoint){
		enemy.hp -= damagePoint;
		System.out.println(enemy.name+"のライフポイントが"+ damagePoint +"減った。");
		System.out.println(enemy.name+"のライフポイントは"+ enemy.hp +"だ");
	}
}
