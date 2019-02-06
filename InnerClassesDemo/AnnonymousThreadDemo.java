class AnnonymousThreadDemo{
	public static void main(String[] args) {
	
/*	Thread t = new Thread()
		{
			public void run(){
				for(int i =0; i < 10; i++){
					System.out.println("child Thread");
				}
			}
		};
		t.start();
		for(int i =0; i < 10; i++){
					System.out.println("Main Thread");
				}  */
















//Annonymous inner class with implemented runnable interface
 /*       Runnable r= new Runnable(){
        	public void run(){
        		for(int i =0; i < 10; i++){
					System.out.println("child Thread");
				}
        	}
        };
        Thread t = new Thread(r);// target runnable
        t.start();
        for(int i =0; i < 10; i++){
					System.out.println("Main Thread");
				}    */





















//Annonymous inner class within an argument
       new Thread(new Runnable()
       {
       	 public void run(){
       	 	for(int i =0; i < 10; i++){
					System.out.println("child Thread");
				}
       	 }
       }
       	).start();
       for(int i =0; i < 10; i++){
					System.out.println("Main Thread");
				}




	}
}