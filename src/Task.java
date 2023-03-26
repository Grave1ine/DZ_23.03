public class Task {
    public static void main(String[] args) {

        Phone phoneOne = new Phone("8910662657", "Samsung Z flip 3", 150);
        Phone phoneTwo = new Phone("8920896523", "Motorola a1", 120);
        Phone phoneThree = new Phone("9658327856", "Alcatel one", 120);

        System.out.println("############################################################");
        System.out.printf("number: %s \nmodel: %s\nweight: %d\n", phoneOne.number, phoneOne.model, phoneOne.weight);
        System.out.println("############################################################");
        System.out.printf("number: %s \nmodel: %s\nweight: %d\n", phoneTwo.number, phoneTwo.model, phoneTwo.weight);
        System.out.println("############################################################");
        System.out.printf("number: %s \nmodel: %s\nweight: %d\n", phoneThree.number, phoneThree.model, phoneThree.weight);
        System.out.println("############################################################");

        phoneOne.name = "Gabriel Angelos";
        phoneOne.receiveCall();
        phoneOne.getNumber();

        System.out.println("############################################################");

        phoneTwo.name = "Lord Vader";
        phoneTwo.receiveCall();
        phoneTwo.getNumber();

        System.out.println("############################################################");

        phoneThree.name = "Davy Jones";
        phoneThree.receiveCall();
        phoneThree.getNumber();

        System.out.println("############################################################");

        phoneOne.receivePhoneCall("John Week", "893654785");

        System.out.println("############################################################");

        phoneOne.sendMessages("89562487595");

        phoneTwo.sendMessages("75623587962");

        phoneThree.sendMessages("45623589621");
    }
}
