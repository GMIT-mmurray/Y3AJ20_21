   // Pig "implements" the Animal interface
    class Pig implements Animal {
        public void animalSound() {
            // The body of animalSound() is provided here
            System.out.println("The pig says: wee wee");
        }
        public void sleep() {
            // The body of sleep() is provided here
            System.out.println("Zzz");
        }
        public void eat() {
            System.out.println("eating");
        }
    }

    class MyMainClass {
        public static void main(String[] args) {
            Pig myPig = new Pig();  // Create a Pig object
            myPig.animalSound();
            myPig.sleep();
            myPig.eat();
            Animal myPig1 = new Pig();
            myPig1.animalSound();
            myPig1.sleep();
//            myPig1.eat();

        }
    }

