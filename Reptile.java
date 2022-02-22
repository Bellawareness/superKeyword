class Reptile {

  String skin = "scaly";
		  String name;
		  String limbs;
		  int life;
		   int breath;
		  
		  public Reptile(String name, String limbs, int life, int breath){
		    this.name = name;
		    this.limbs = limbs;
		    this.life = life ;
		    this.breath = breath ;
		  }

		


		public void whoAmI(){
		    System.out.print("My name is " + name + ". I am a reptile");
		  }
}