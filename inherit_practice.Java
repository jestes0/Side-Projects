
class main{

  public static void main(String[] args) {

    Creature test = new Creature();
    Creature hooman = new Human();
    Creature wulf = new Wolf();

      test.health();
      hooman.health();
      wulf.health();
  }
}

class Creature{

  public void health(){
    //int hp = 0;
    System.out.println("Empty");
  }

  public void attack(){
    //int damage = 0;
  }
}

class Human extends Creature{
  public void health(){
    //int hp = 30;
    System.out.println("Human HP: ");
  }

  public void attack(){
    //int damage = 5;
  }
}

class Wolf extends Creature{
  public void health(){
    //int hp = 10;
    System.out.println("Wolf HP: ");

  }

  public void attack(){
    //int damage = 2;
  }
}
