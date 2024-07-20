class Standard
{    
     public static void main(String[] args)
    {
	  Paint.wall("Asian paints");
      Paint.wall("Asian paints","Saffron");
	  Paint.wall("Asian paints",4599.99);
	  Paint.wall("Saffron","Oil Paint",4599.99);
	  
	  Train.book("Belagavi","Hubbali");
      Train.book("Belagavi","Hubbali",100);
	  Train.book("Belagavi","Hubbali",100,200);
	  Train.cancel(1357);
	  Train.cancel("Belagavi","Hubbali");

     Cool.actor("Rocking star");
	 Cool.actress("Yash wife");
	 Cool.match(76);
	 Cool.liter(99.99);
	 Cool.status('S');
	  
	}
	  
}