import java.util.Random;
public class RPGgame{
	public static void main(String args[]) {
		Character[][] team = new Character[2][4];
		team[0][0]= new Character("ルパン",1000);
		team[0][1]= new Character("五右衛門",1000);
		team[0][2]= new Character("次元",1000);
		team[0][3]= new Character("不二子",1500);
		team[1][0]= new Magician("lucifer",500,40);
		team[1][1]= new Magician("マリック",500,30);
		team[1][2]= new Monster("ポケモン",500);
		team[1][3]= new Monster("ポケポケ",500);
		for(int i =0;i <team.length;i++){
			for(int j=0;j < team[i].length;j++){
				team[i][j].introduce();
			}
		}
		int teamNumber =0;
		while(shoubu(team[0])&shoubu(team[1])){
			Random r = new Random();
			int number1;
			int number2;
			do{
				number1 = r.nextInt(4);
				number2 = r.nextInt(4);
			}while(team[0][number1].getHp()<=0 || team[1][number2].getHp()<=0);
			team[ teamNumber %2 ][number1].attack(team[ (teamNumber+1) %2 ][number2]);
			if(team[(teamNumber+1) %2 ][number2].hp <= 0){
				System.out.println(team[(teamNumber+1) %2 ][number2].name +"は生き絶えた");
			}
			if(!shoubu(team[(teamNumber+1) %2 ])){
				if(teamNumber%2==0){
					System.out.println("teamBは全滅した");
				}else {
					System.out.println("teamAは全滅した");
				}
			}
			teamNumber++;
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
