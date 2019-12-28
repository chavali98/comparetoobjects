class King
{
public String name;
public int age;
King(String name,int age)
{
this.name=name;
this.age=age;
}
@Override
public static boolean equals(Object C)
{
if(this==C){
return true;
}
if(C==null || this.getclass()!=C.getClass())
return false;
King a=(King)C;
return this.name.equals(a.name) && this.age==a.age;
}
@Override
public int hashCode()
{
return age+name.hashCode();
}
}
class Queen
{
public static void main(String [] args)
{
King K=new King("ranveer",67);
king L=new King("Shajahan",56);
try
{
if(C==null)
return false;
}
catch(Exception e)
{
System.out.println("NullPointerException");
}
if(K.getClass().equals(L.getclass()))
{
	if(K.equals(L))
	{
	System.out.println("K and L are equal");
	}
	else
	{
	System.out.println("K and L are not equal");
	}
else
{
System.out.println("K and L are  not objects of same class");
}
}
}
}
