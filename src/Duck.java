
public class Duck {
int numberOfFriends;
String favoriteFood;
Duck(String favoriteFood, int numberOfFriends) {
  	this.favoriteFood = favoriteFood;
  	this.numberOfFriends = numberOfFriends;
}
void quack(){
	System.err.println("The duck doesn't want to quack! He's eating " + favoriteFood + " with his " + numberOfFriends + " Friends!");
}
}
