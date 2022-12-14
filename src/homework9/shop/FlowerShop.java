package homework9.shop;

import homework9.entity.Accessory;
import homework9.entity.Flower;
import homework9.exceptions.NegativeParams;
import homework9.util.Utils;

public class FlowerShop {
    private Bouquet[] bouquets;

    public FlowerShop() {
        this.bouquets = new Bouquet[0];
    }

    public Bouquet[] getBouquets() {
        return bouquets;
    }

    public void addBouquet(Bouquet bouquet) {
        bouquets = Utils.increaseMassive(bouquet, bouquets);
    }

    public void addFlowerToBouquet(Bouquet existingBouquet, Flower flower) {
        existingBouquet.addFlower(flower);
    }

    public void addAccessoryToBouquet(Bouquet existingBouquet, Accessory accessory) {
        existingBouquet.addAccessory(accessory);
    }

    public Bouquet sortByFreshness(Bouquet bouquet) {
        Flower[] flowers = bouquet.getFlowers();
        for (int i = flowers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (flowers[j].getPercentageOfFreshness() > flowers[j + 1].getPercentageOfFreshness()) {
                    Flower temporal = flowers[j];
                    flowers[j] = flowers[j + 1];
                    flowers[j + 1] = temporal;
                }
            }
        }
        bouquet.setFlowers(flowers);
        return bouquet;
    }

    public int calculateCost(Bouquet bouquet) {
        Flower[] flowers = bouquet.getFlowers();
        Accessory[] accessories = bouquet.getAccessories();
        int cost = 0;
        for (Flower flower : flowers) {
            cost += flower.price;
        }
        for (Accessory accessory : accessories) {
            cost += accessory.price;
        }
        return cost;
    }

    public Flower[] findByStem(Bouquet bouquet, int minStem, int maxStem) {
        if (minStem < 0 || maxStem < 0) {
            try {
                throw new NegativeParams();
            } catch (NegativeParams negativeParams) {
                System.out.println("You enter negative numbers!");
            }
        } else {
            Flower[] flowers = bouquet.getFlowers();
            Flower[] result = new Flower[0];
            for (Flower flower : flowers) {
                if (flower.getStemLength() >= minStem && flower.getStemLength() <= maxStem) {
                    result = Utils.increaseMassive(flower, flowers);
                }
            }
            return result;
        }
        return null;
    }
}


