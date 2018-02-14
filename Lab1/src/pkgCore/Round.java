package pkgCore;

import java.util.LinkedList;

public class Round {

	private int ComeOutScore;
	private eGameResult eGameResult;
	private LinkedList<Roll> rolls = new LinkedList<Roll>();
	int Score = 0;
	
	public Round() {
		
		Roll roll = new Roll();
		ComeOutScore = roll.getScore();

		if (ComeOutScore == 2 || ComeOutScore == 3 ||
				ComeOutScore == 12) {
			
			//eGameResult
		
		}
		
		else if ( ComeOutScore == 7 || ComeOutScore == 11) {
			
			//eGameResult 
		}
		
		else {
			while (ComeOutScore != Score || ComeOutScore != 7){
				
				Roll newRoll = new Roll();
				Score = newRoll.getScore();
				ComeOutScore = Score;
				
			}
			
		}

		// TODO: value the eGameResult after the round is complete
	}

	public int RollCount() {
		// Return the roll count
		return 0;
	}

}
