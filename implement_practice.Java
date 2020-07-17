class main{

  public static void main(String[] args) {

    Creature hooman = new Human();
    Creature wulf = new Wolf();

      hooman.health();
      wulf.health();

      hooman.attack();
      wulf.attack();

      hooman.defense();
      wulf.defense();
  }
}

interface Creature{
  public void health();
  public void attack();
  public void defense();
}

class Human implements Creature{
  public void health(){
    int hp = 30;
    System.out.println("Human HP: " + hp);
  }

  public void attack(){
    int damage = 5;
    System.out.println("Human ATK: " + damage);

  }

  public void defense(){
    int def = 2;
    System.out.println("Human Def: " + def);
  }
}

class Wolf implements Creature{
  public void health(){
    int hp = 10;
    System.out.println("Wolf HP: " + hp);

  }

  public void attack(){
    int damage = 2;
    System.out.println("Wolf ATK: " + damage);
  }
public void defense() {
  int def = 0;
  System.out.println("Wolf Def: " + def);
}
}
