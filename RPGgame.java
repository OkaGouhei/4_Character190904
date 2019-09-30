import java.util.Random;
public class RPGgame{
	public static void main(String args[]) {
		Character[] TeamA = new Character[4];
		Character[] TeamB = new Character[4];
		TeamA[0]= new Character("ルパン",1000);
		TeamA[1]= new Character("五右衛門",1000);
		TeamA[2]= new Character("次元",1000);
		TeamA[3]= new Character("不二子",1500);
		for(int i=0;i < TeamA.length;i++){
			TeamA[i].introduce();
		}
		TeamB[0]= new Magician("lucifer",500,40);
		TeamB[1]= new Magician("マリック",500,30);
		TeamB[2]= new Monster("ポケモン",500);
		TeamB[3]= new Monster("ポケポケ",500);
		for(int i=0;i < TeamB.length;i++){
			TeamB[i].introduce();
		}
		int TeamNumber =0;
		while(shoubu(TeamA,TeamA,TeamB)&shoubu(TeamB,TeamA,TeamB)){
			Character[] Team1 ;
			Character[] Team2 ;
			if(TeamNumber%2==0){
				Team1 = TeamA;
				Team2 = TeamB;
			}else{
				Team1 = TeamB;
				Team2 = TeamA;
			}
			TeamNumber++;
			Random r = new Random();
			int number1;
			int number2;
			do{
				number1 = r.nextInt(4);
				number2 = r.nextInt(4);
			}while(Team1[number1].getHp()<=0 || Team2[number2].getHp()<=0);
			Team1[number1].attack(Team2[number2]);
			if(Team2[number2].hp <= 0){
				System.out.println(Team2[number2].name +"は生き絶えた");
			}
		}
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
	static boolean shoubu(Character[] Character,Character[] CharacterA,Character[] CharacterB){
		for(int i=0;i < Character.length;i++){
			if(Character[i].getHp() > 0){
				return true;
			}
		}
		if (Character == CharacterA){
			System.out.println("TeamAは全滅した");
		}else if(Character== CharacterB){
			System.out.println("TeamBは全滅した");
		}
		return false;
	}
}
