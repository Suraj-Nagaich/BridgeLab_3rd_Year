package Interface.MultipleInheritence;

public class Main {

	public static void main(String[] args) {
		Iparent1 p=new ChildImpl();
		p.m1();
		IParent2 p2=new ChildImpl();
				p2.m2();

	}

}
