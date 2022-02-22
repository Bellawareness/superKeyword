 // 2. Create a class Turtle that inherits from Reptile. 

  // 3. Create a instance variable that will hold the length of time our turtle will hold it's breath. 

  // 4. Make a constructor that takes in variables for the reptile super constructor. Make sure to get a value in the constructor to initialize breath.

  // 5. Override the whoAmI() method. Make sure to use the super method like in the Tortoise class. My name is Squirtle. Sample output for whoAmI: "I am a reptile and a turtle. My skin is scaly. I can hold my breath for 60 minutes.""
  
   class Turtle extends Reptile {

private static final int life = 150;


			boolean parent;


	   String name1="Squirtle";
	  
	  int breath = 60;
	  


	  public Turtle(String name1, String limbs, int breath){
	    super(name1, limbs, life, breath);
	    parent = false;

	  }

	  @Override
	  public void whoAmI(){
	    super.whoAmI();
	    System.out.println(" and a turtle. My skin is " + super.skin + ". I can hold my breath for " + super.breath + " minutes.");
	  }
	  
   }


