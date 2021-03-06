public class BasketItems {
	
	private int noOfBananas;
	private int noOfOranges;
	private int noOfApples;
	private int noOfLemons;
	private int noOfPeaches;
	
	public BasketItems(){
		this.noOfBananas = 0;
		this.noOfOranges = 0;
		this.noOfApples = 0;
		this.noOfLemons = 0;
		this.noOfPeaches = 0;
	}
	/**
	 * @param noOfBananas
	 * @param noOfOranges
	 * @param noOfApples
	 * @param noOfLemons
	 * @param noOfPeaches
	 */
	public BasketItems(int noOfBananas, int noOfOranges, int noOfApples,
			int noOfLemons, int noOfPeaches) {
			if(noOfBananas>0)
				setNoOfBananas(noOfBananas);
					
			if(noOfOranges>0)
				setNoOfOranges(noOfOranges);
		
			if(noOfApples>0)
				setNoOfApples(noOfApples);
		
		
			if(noOfLemons>0)
				setNoOfLemons(noOfLemons);
		
			if(noOfPeaches>0)
				setNoOfPeaches(noOfPeaches);
	}
	/**
	 * @return the noOfBananas
	 */
	public int getNoOfBananas() {
		return noOfBananas;
	}
	/**
	 * @param noOfBananas the noOfBananas to set
	 */
	public void setNoOfBananas(int noOfBananas) {
		this.noOfBananas = noOfBananas;
	}
	/**
	 * @return the noOfOranges
	 */
	public int getNoOfOranges() {
		return noOfOranges;
	}
	/**
	 * @param noOfOranges the noOfOranges to set
	 */
	public void setNoOfOranges(int noOfOranges) {
		this.noOfOranges = noOfOranges;
	}
	/**
	 * @return the noOfApples
	 */
	public int getNoOfApples() {
		return noOfApples;
	}
	/**
	 * @param noOfApples the noOfApples to set
	 */
	public void setNoOfApples(int noOfApples) {
		this.noOfApples = noOfApples;
	}
	/**
	 * @return the noOfLemons
	 */
	public int getNoOfLemons() {
		return noOfLemons;
	}
	/**
	 * @param noOfLemons the noOfLemons to set
	 */
	public void setNoOfLemons(int noOfLemons) {
		this.noOfLemons = noOfLemons;
	}
	/**
	 * @return the noOfPeaches
	 */
	public int getNoOfPeaches() {
		return noOfPeaches;
	}
	/**
	 * @param noOfPeaches the noOfPeaches to set
	 */
	public void setNoOfPeaches(int noOfPeaches) {
		this.noOfPeaches = noOfPeaches;
	}

}
