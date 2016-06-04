package entity;

import interfaces.FlyBehavior;
import interfaces.QuackBehavior;

public abstract class Duck{
  
	public void swim(){
		System.out.println("会游泳");
	}
	public void display(){
		
	}
	//鸭子现在将它的的行为委派给别人处理，而不是将它定义在自己或子类里
	QuackBehavior quackBehavior;
	FlyBehavior flyBehavior;
	
	public void performQuack(){
		quackBehavior.quack();
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
    //动态设定
	public void setQuackBehavior(QuackBehavior quackBehavior) {
	      this.quackBehavior =quackBehavior;
	   }
 
   public void setFlyBehavior(FlyBehavior flyBehavior){
	      this.flyBehavior= flyBehavior;
   }
}
