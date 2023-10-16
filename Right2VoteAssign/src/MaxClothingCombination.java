
public class MaxClothingCombination {
    public static void main(String[] args) {
        int tShirtPrice = 50;
        int jeansPrice = 80;
        int jacketPrice = 100;
        int budget = 600;

        int maxTShirts = (budget / tShirtPrice)-2;
        int maxJeans = (budget / jeansPrice)-2;
        int maxJackets = (budget / jacketPrice)-2;
		int maxCombinations = 0;
        for (int tShirts = 1; tShirts <= maxTShirts; tShirts++) {
            for (int jeans = 1; jeans <= maxJeans; jeans++) {
                for (int jackets = 1; jackets <= maxJackets; jackets++) {
                    int  totalCost = tShirts * tShirtPrice + jeans * jeansPrice + jackets * jacketPrice;
                    if (totalCost <= budget && totalCost > 550 && tShirts >= 1 && jeans >= 1 && jackets >= 1) {
                        System.out.println("T-shirts: " + tShirts + ", Jeans: " + jeans + ", Jackets: " + jackets+", Total cost : "+ totalCost);
                        maxCombinations++;
                    }
                }
            }
        }
        System.out.println("All Possible Clothing Combinations are : "+maxCombinations);
    }
}

