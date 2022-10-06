package org.tnsindia.Final;

class FinalClass
{
	protected String name="Prajakta";
}

/*final class FinalClass
{
	protected String name="Prajakta";
}*/

class ChildFinal extends FinalClass
{
	public void print()
	{
		System.out.println(name);
	}
}

