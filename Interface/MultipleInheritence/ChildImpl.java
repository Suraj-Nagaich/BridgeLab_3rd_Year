package Interface.MultipleInheritence;

public class ChildImpl implements Iparent1,IParent2 {
	@Override
	public void m2()
	{
		System.out.println("m2");
	}
	@Override
	public void m1()
	{
		System.out.println("Hii m1");
	}

}
