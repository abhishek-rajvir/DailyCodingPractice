Java 2 solutions 


```
/* 1. Stream one liner solution */

    public static int camelcase(String s) {
        // since count return long downcast it to int
        // for exact precision use Math.exactInt
        return (int)
            // convert string to IntStream
            s.chars()
                // filter out only uppercase letters
                .filter( Character::isUpperCase )
                // count uppercase letters + 1 for first string
                .count() + 1
            ;
    }
			
/* 2. For Each Solution */

			public static int camelcase(String s) {
					// store count
					int camelCount = 0;

					// iterate the string
					for(char c : s.toCharArray()){
							// check if uppercase no need to check alphabet
							if(Character.isUpperCase(c)){
									// then increment
									camelCount++;
							}
					}
					// increment to consider 1st string
					return ++camelCount;
			}
``

2. For Each solution

