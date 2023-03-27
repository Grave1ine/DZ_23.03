public class Phone {

    String number;
    String model;
    int weight;
    String name;

    Phone(){};

    Phone(String number, String model){
        this.number = number;
        this.model = model;
    };
    Phone(String number, String model, int weight){
        this.number = number;
        this.model = model;
        this.weight = weight;

    };

    void receiveCall(){
        System.out.println(name);
    }

    void getNumber(){
        System.out.println(number);

    }

    void receivePhoneCall(String name, String number){
        System.out.printf("Звонит: %s %s\n", name , number);
    }

    void sendMessages(String[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.printf("На номер %s было отправлено сообщение с номера %s\n", arr[i], this.number);
        }
        System.out.println("############################################################");
    }


}
/*
    Класс Phone.
       + 1. Создайте класс Phone, который содержит переменные number, model и weight.
       + 2. Создайте три экземпляра(объекта) этого класса.
       + 3. Выведите на консоль значения их переменных.
       + 4. Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
        Выводит на консоль сообщение “Звонит {name}”, где {name} - значение поля name .
        getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
       + 5. Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
       + 6. Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
       + 7. Добавить конструктор без параметров.
       + 8. Добавьте метод receivePhoneCall, который принимает два параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
       + 9. Создать метод sendMessages c массивом строк (String[]) в качестве одного из параметров.
        Данный метод принимает на вход номера телефонов (которые являются элементами переданного массива), которым будет отправлено сообщение.
        Метод выводит на консоль номера этих телефонов:

        - На номер {} было отправлено сообщение с номера {number}.

 */