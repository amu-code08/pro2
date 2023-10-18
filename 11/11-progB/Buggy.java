import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class Buggy {
	public boolean isPrime(int x){
		int max=1;
		for (int i=2; i<x/2; i++) {
			if (x%i == 0)
				max = i;
		}
		if (x==2 || max==1)
			return true;
		else
			return false;
	}
	@Test
    public void test_true() {
        int[] primeNums = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		boolean result;
		for (int i = 0; i < primeNums.length; i++) {
            result = isPrime(primeNums[i]);
            assertTrue(result, "prime failed");
        }
    }

	@Test
	public void test_false(){
		int[] nonprimeNums = {1, 4, 6, 8, 9, 10, 12, 14, 15, 16};
		boolean result;
		for (int i = 0; i < nonprimeNums.length; i++){
			result = isPrime(nonprimeNums[i]);
			assertFalse(result, "non-prime failed");
		}

	}

}
