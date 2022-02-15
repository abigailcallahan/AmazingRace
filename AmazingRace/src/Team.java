import java.util.ArrayList;

public class Team
	{
		//static ArrayList<Team> teamsList = new ArrayList<Team>();

		private String name;
		private int countryWins;
		
		
		public Team(String n, int c)
		{
			name = n;
			countryWins = c;
		}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public int getCountryWins()
			{
				return countryWins;
			}

		public void setCountryWins(int countryWins)
			{
				this.countryWins = countryWins;
			}
		
		
	}
