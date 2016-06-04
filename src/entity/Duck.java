package entity;

import interfaces.FlyBehavior;
import interfaces.QuackBehavior;

public abstract class Duck{
  
	public void swim(){
		System.out.println("����Ӿ");
	}
	public void display(){
		
	}
	//Ѽ�����ڽ����ĵ���Ϊί�ɸ����˴��������ǽ����������Լ���������
	QuackBehavior quackBehavior;
	FlyBehavior flyBehavior;
	
	public void performQuack(){
		quackBehavior.quack();
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
    //��̬�趨
	public void setQuackBehavior(QuackBehavior quackBehavior) {
	      this.quackBehavior =quackBehavior;
	   }
 
   public void setFlyBehavior(FlyBehavior flyBehavior){
	      this.flyBehavior= flyBehavior;
   }
}
