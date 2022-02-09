import java.util.ArrayList;


public class LocationArrayList
	{
		static ArrayList<Location> countries = new ArrayList<Location>();
		
		public static void fillList()
		{
			countries.add(new Location("Ireland", "Number Guessing Game", "Find the Letter",  "Unscramble"));
		}
	}
