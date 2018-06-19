
public class SmurfRun {

	public static void main(String[] args) {
		Smurf h = new Smurf("Handy");
		Smurf p = new Smurf("Papa");
		Smurf e = new Smurf("Smurfette");
		h.eat();
		System.out.println(h.getName());
		p.eat();
		System.out.println(p.isGirlOrBoy());
		System.out.println(p.getHatColor());
		e.eat();
	}

}
