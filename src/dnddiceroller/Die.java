package dnddiceroller;

import java.util.Random;

/**
 * A Die is a many sided object that when rolled provides a random value from
 * 1 through the number of sides on the object. Some dice are 6 sided and have
 * the numbers 1-6 on them. Some dice are 20 sided with the numbers 1-20 on them.
 * Others are called fudge dice and have the values of -1 0 or +1
 * @author Paul Scarrone
 */
public class Die {
  
  //requried fields
  private int dieSize;
  private int result;

  /**
   *Die Constructor
   * 
   * @param dieSize
   */
    public Die(int dieSize){
    this.dieSize = dieSize;
    this.result = 0;
  }
  
  //acquries the possible die results
  public int getDieSize(){
    return this.dieSize;
  }
  
  //returns the die's result
  public int getResult(){
    return this.result;
  }
  
  //roll method used to roll a single die
  public void roll() {
    Random randomRoll = new Random();
    this.result = randomRoll.nextInt(this.dieSize) + 1;
  }
  
}
