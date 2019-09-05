public class Character{
	public static void main(String args[]) {
		Hero lupin = new Hero("ルパン",100,500);
		Hero jigen = new Hero("次元",200,300);
		lupin.introduce();
		jigen.introduce();
		hikaku(lupin,jigen);
	}
	public static void hikaku(Hero a,Hero b){
		if(a.getHp() > b.getHp()){
			System.out.println(a.getName() + "の方が" + b.getName() + "よりライフポイントが高い。");
		}else if(a.getHp() < b.getHp()){
			System.out.println(b.getName() + "の方が" + a.getName() + "よりライフポイントが高い。");
		}else {
			System.out.println(b.getName() + "と" + a.getName() + "のライフポイントは同じだ。");
		}
	}
}
