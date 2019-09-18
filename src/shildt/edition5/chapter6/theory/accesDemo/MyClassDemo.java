package shildt.edition5.chapter6.theory.accesDemo;

class MyClassDemo {
    private int alpha; // закрытый доступ
    public int beta; //открытый доступ
    int gamma; // тип доступа по умолчанию (открытый)

    /*Методы доступа к переменной alpha. Переменные класса могут
    обращаться к закрытым переменным этого же класса.
     */
    void setAlpha(int a) {
        alpha = a;
    }

    int getAlpha() {
        return alpha;
    }

}
