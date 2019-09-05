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
}
