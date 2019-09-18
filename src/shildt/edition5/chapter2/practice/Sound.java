package shildt.edition5.chapter2.practice;
/* Задача.Написать программу, вычисляющую расстояние в футах до источника
звука при ударе молнии. Звук распространяется в воздухе со скоростью, приблизительно
равной 1100 футам в секунду. Следовательно, зная промежуток времени между теми
моментами, когда наблюдатель увидит вспышку молнии и услышит сопровождающий
ее раскат грома, можно рассчитать расстояние до нее. Допустим, что этот промежуток
времени составляет 7,2 секунды.

Задача*. Рассчитать расстояние до крупного объекта, например скалы,
можно по времени прихода эхо. Так, если вы хлопнете в ладоши, время, через
которое вернется эхо, будет равно времени прохождения звука в прямом и обратном
направлении. Разделив этот промежуток времени на два, вы получите время
прохождения звука от вас до объекта. Это время можно затем использовать для расчета
расстояния до объекта. Видоизмените рассмотренную выше программу, использовав
в качестве заданного промежутка время прихода эха.

 */

public class Sound {
    public static void main(String args[]) {

        double speed = 1100;
        double time = 7.2;
        double distance;
        double time2;

        distance = time * speed;
        System.out.println("The lightning is " + distance + " feet away");

        distance /= 2;

        System.out.println(distance);

        time2=distance*time;
        System.out.println(time2);

    }
}