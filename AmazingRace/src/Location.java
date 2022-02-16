public class Location
	{
		
		private String country;
		private String game1;
		private String game2;
		private String tieGame;
		
		
		public Location(String c, String g1, String g2, String tg)
		{
			country = c; 
			game1 = g1;
			game2 = g2;
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


		public String getGame1()
			{
				return game1;
			}


		public void setGame1(String game1)
			{
				this.game1 = game1;
			}


		public String getGame2()
			{
				return game2;
			}


		public void setGame2(String game2)
			{
				this.game2 = game2;
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
