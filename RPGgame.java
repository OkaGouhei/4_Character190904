import java.util.Random;
public class RPGgame{
	public static void main(String args[]) {
		Character[] teamA = new Character[4];
		Character[] teamB = new Character[4];
		teamA[0]= new Character("ルパン",1000);
		teamA[1]= new Character("五右衛門",1000);
		teamA[2]= new Character("次元",1000);
		teamA[3]= new Character("不二子",1500);
		for(int i=0;i < teamA.length;i++){
			teamA[i].introduce();
		}
		teamB[0]= new Magician("lucifer",500,40);
		teamB[1]= new Magician("マリック",500,30);
		teamB[2]= new Monster("ポケモン",500);
		teamB[3]= new Monster("ポケポケ",500);
		for(int i=0;i < teamB.length;i++){
			teamB[i].introduce();
		}
		int teamNumber =0;
		while(shoubu(teamA)&shoubu(teamB)){
			Character[] team1 ;
			Character[] team2 ;
			if(teamNumber%2==0){
				team1 = teamA;
				team2 = teamB;
			}else{
				team1 = teamB;
				team2 = teamA;
			}
			teamNumber++;
			Random r = new Random();
			int number1;
			int number2;
			do{
				number1 = r.nextInt(4);
				number2 = r.nextInt(4);
			}while(team1[number1].getHp()<=0 || team2[number2].getHp()<=0);
			team1[number1].attack(team2[number2]);
			if(team2[number2].hp <= 0){
				System.out.println(team2[number2].name +"は生き絶えた");
			}
			if(!shoubu(team2)){
				if(teamNumber%2==0){
					System.out.println("teamBは全滅した");
				}else {
					System.out.println("teamAは全滅した");
				}
			}
		}
	}
	static boolean shoubu(Character[] Character){
		for(int i=0;i < Character.length;i++){
			if(Character[i].getHp() > 0){
				return true;
			}
		}
		return false;
	}
}
