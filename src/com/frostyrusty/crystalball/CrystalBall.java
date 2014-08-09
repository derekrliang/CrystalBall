package com.frostyrusty.crystalball;

import java.util.Random;

public class CrystalBall {
	// Member variables (properties about the object)
	String[] mAnswers = {
			"It is certain",
			"It is decidedly so",
			"All signs say YES",
			"The stars are not aligned",
			"My reply is no",
			"It is doubtful",
			"Better not tell you now",
			"Concentrate and ask again",
			"Unable to answer now",
			"It is hard to say"
	};
	
	// Method (abilities: things the object can do)
	public String getAnAnswer()
	{
		Random randomGenerator = new Random(); // Construct a new Random number generator
		int randomNumber = randomGenerator.nextInt(mAnswers.length);
		
		String answer = mAnswers[randomNumber];
		
		return answer;
	}
}
