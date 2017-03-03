public class S2A3
{
	public static void main(String args[])
    {
		int a=29,b=57,c=40;
		if(a>b && a>c) // checking a is greater than b & c
		System.out.println(a + " is highest among three numbers " +a +", "+b + " & " +c );
		else if(b>a && b>c) // checking b is greater than a & c
		System.out.println(b + " is highest among three numbers " +a +", "+b + " & " +c );
		else
		System.out.println(c + " is highest among three numbers " +a +", "+b + " & " +c );
}
}