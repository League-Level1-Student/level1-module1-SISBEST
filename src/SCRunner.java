
public class SCRunner {
	public static void main(String[] args) {
		SeaCreature s = new SeaCreature("SpongeBob");
		SeaCreature p = new SeaCreature("Patrick");
		SeaCreature sq = new SeaCreature("Squidward");
		s.eat();
		s.laugh();
		p.getName();
		p.eat();
		p.laugh();
		sq.getClass();
		sq.eat();
		sq.laugh();
	}
}
