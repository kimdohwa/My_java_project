package ch05_package_inheritance.myAnimal;

public class AnimalMain01 {
    public static void main(String[] args) {
        Animal01[] animal ={
                new GoldFish01("금붕어",2,"거실어항",2,10),
                new Lion01("사자",15,"세렝게티",4,10),
                new Eagle01("독수리",20,"푸른창공",2,50)
        };

        for (int i = 0; i < animal.length; i++) {
            animal[i].showInfo();

            if (animal[i] instanceof GoldFish01){
                GoldFish01 goldFish = (GoldFish01)animal[i];
                goldFish.swim();
            } else if (animal[i] instanceof Lion01){
                Lion01 lion = (Lion01)animal[i];
                lion.run();
            } else if(animal[i] instanceof Eagle01){
                Eagle01 eagle = (Eagle01)animal[i];
                eagle.fly();
            }
        }//for


    }
}
