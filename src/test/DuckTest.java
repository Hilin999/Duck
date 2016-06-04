package test;

import entity.Duck;
import entity.MallardDuck;
import entity.RedheadDuck;
import entity.RubberDuck;
import interfaceIMPL.FlyNoWay;
import interfaceIMPL.FlyWithRocket;
import interfaceIMPL.FlyWithWings;
import interfaceIMPL.MuteQuack;
import interfaceIMPL.Quack;
import interfaceIMPL.Squeak;

public class DuckTest {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         //MaddlardDuck
              Duck mallard = new MallardDuck();
              mallard.display();
              mallard.swim();
	      mallard.setQuackBehavior(new MuteQuack());
	      mallard.setFlyBehavior(new FlyWithRocket());
	      mallard.performQuack();
	      mallard.performFly();
	 //RubberDuck
	      Duck rubber=new RubberDuck();
              rubber.display();
              rubber.swim();
              rubber.setQuackBehavior(new Squeak());
              rubber.setFlyBehavior(new FlyNoWay());
              rubber.performFly();
              rubber.performQuack();
     
         //RedheadDuck
	      Duck Redhead=new RedheadDuck();
	      Redhead.display();
	      Redhead.swim();
	      Redhead.setQuackBehavior(new Quack());
	      Redhead.setFlyBehavior(new FlyWithWings());
	      Redhead.performFly();
	      Redhead.performQuack();
	}

}
