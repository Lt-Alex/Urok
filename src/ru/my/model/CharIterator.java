package ru.my.model;

public class CharIterator {

    public static void main(String[] args) {
        String s = "Х.М.А.В"; // 'П', 'р', 'и'
        char[] charArray = s.toCharArray();


        //WithForIt(charArray);
        //printSharsWithFor(charArray);


        Switch(charArray);


    }

    private static void Switch(char[] charArray) {
        for (char selectChar : charArray) {
            switch (selectChar) {
                case 'Х':
                    System.out.println("Хлебный");
                    break;
                case 'М':
                    System.out.println("Молочный");
                    break;
                case 'А':
                    System.out.println("Алклголь");
                    break;
                case 'В':
                    System.out.println("Техника");
                    break;
                default:
                    System.out.println("-");
                    break;
            }

        }
    }

    private static void WithForIt(char[] charArray) {
        //Вариант хождения по массиву
        for (char selectChar : charArray) {
            //пропускаем элемент массива, одну итерацию
            //if (selectChar == 'A') continue;

            //Заканчиваент цикл
            //if (selectChar == 'А') break;


            System.out.println(selectChar);
            // Выход из процудуры, фунции и циклов
            //return;
        }
    }

    private static void printSharsWithFor(char[] charArray) {
        //if (true) return;// всегда выполняется и прерывает процедуру

        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }
    }
}
