public class RPGgame{
	public static void main(String args[]) {
		Character lupin = new Character("ルパン",100,500);
		Character jigen = new Character("次元",200,300);
		lupin.introduce();
		jigen.introduce();
		hikaku(lupin,jigen);
		lupin.attack(jigen);
		jigen.attack(lupin);
	}
	public static void hikaku(Character a,Character b){
		if(a.getHp() > b.getHp()){
			System.out.println(a.getName() + "の方が" + b.getName() + "よりライフポイントが高い。");
		}else if(a.getHp() < b.getHp()){
			System.out.println(b.getName() + "の方が" + a.getName() + "よりライフポイントが高い。");
		}else {
			System.out.println(b.getName() + "と" + a.getName() + "のライフポイントは同じだ。");
		}
	}
}
