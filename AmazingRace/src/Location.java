public class Location
	{
		
		private String country;
		private String againstTeamGame;
		private String againstOwnGame;
		private String tieGame;
		
		
		public Location(String c, String atg, String aog, String tg)
		{
			country = c; 
			againstTeamGame = atg;
			againstOwnGame = aog;
			tieGame = tg;
		}


		public String getCountry()
			{
				return country;
			}


		public void setCountry(String country)
			{
				this.country = country;
			}


		public String getAgainstTeamGame()
			{
				return againstTeamGame;
			}


		public void setAgainstTeamGame(String againstTeamGame)
			{
				this.againstTeamGame = againstTeamGame;
			}


		public String getAgainstOwnGame()
			{
				return againstOwnGame;
			}


		public void setAgainstOwnGame(String againstOwnGame)
			{
				this.againstOwnGame = againstOwnGame;
			}


		public String getTieGame()
			{
				return tieGame;
			}


		public void setTieGame(String tieGame)
			{
				this.tieGame = tieGame;
			}
	}
