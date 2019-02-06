class TooYoungException extends RuntimeException
{
	TooYoungException(String s)
	{
		super(s);
	}
}
class TooOldException extends RuntimeException
{
	TooOldException(String s)
	{
		super(s);
	}
}
class CustomizedDemo
{
	public static void main(String[] args) {
		int age = Integer.parseInt(args[0]);
		if(age > 60)
		{
			throw new TooYoungException("Please wait some more time");
		}
		else if(age < 18){
			throw new TooOldException("No chance of getting merried");
		}else{
			System.out.println("you will get match details by mail"); 
		}
	}
}