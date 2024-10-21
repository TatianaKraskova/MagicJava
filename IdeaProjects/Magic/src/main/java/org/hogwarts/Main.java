package main.java.org.hogwarts;

public class Main {
    public static void main(String[] args) {
        RandomAssignments randomAssignments = new RandomAssignments();
        randomAssignments.forthTask();


//        Potion potion = new Potion();
//        potion.prepare();

/*
        String[] recipe = {
                "Засушенная чешуя василиска",
                "Частичка души лесной феи",
                "Капля сока вампирской розы",
                "Яд шершавого ядозуба",
                "Осколок кометы",
                "Слеза феникса"};

        String[] potion = new String [6];
        potion[2] = "Капля сока вампирской розы";
        potion[5] = "Слеза феникса";
        potion[0] = "Засушенная чешуя василиска";
        potion[1] = "Частичка души лесной феи";
        potion[3] = "Яд шершавого ядозуба";
        potion[4] = "Осколок кометы";
        System.out.println(Arrays.equals(recipe,potion));
        */

        /*
        SortingHat sortingHat = new SortingHat();
        sortingHat.sort();
        Quidditch quidditch = new Quidditch();
        quidditch.getBalls();
        quidditch.playGame();


        randomAssignments.generateSum();
        */

/*
        System.out.println("Oh you`re a magician, friend! Welcome to Hogwarts!");
        String dumbledoreName = "Dumbledore";
        String mcgonagallName = "Mcgonagall";
        String SnapeName = "Snape";
        String LupinName = "Lupin";
        String HugridName = "Hugrid";
        String teachers = "School teachers";

        int grade1 = new Random().nextInt(1, 10);
        int grade2 = new Random().nextInt(1, 10);
        System.out.println("grade1: " + grade1);
        System.out.println("grade2: " + grade2);

        boolean result = grade1 > 5 && grade2 > 5;
        System.out.println(result);

        double averageResult = (grade1 + grade2)/2;
        System.out.println("averageResult: " + averageResult);

        int number = 4199;
        int result1 = number % 13;
        int result2 = number % 14;
        int result3 = number % 15;
        int result4 = number % 16;
        int result5 = number % 17;
        int result6 = number % 19;

        double sumResult = result1 + result2 + result3 + result4 + result5 + result6;
        System.out.println("sumResult: " + sumResult);

        String wingardium = "Wingardium ";
        String leviosa= "Leviosa";

        // Будет равно "Wingardium Leviosa"
        String combination = wingardium + leviosa;

        // \\n - перенос строки
        String equations = "2 + 2 = 4" + "\\n" + "3 + 3 = 9" + "\\n";

        // \\t - табуляция
        String tabs = "Заголовок!" +
                "\\n" + "\\t" + "Абзац 1" +
                "\\n" + "\\t" + "Абзац 2";

        System.out.println(equations + tabs);

        String lines = """
			Protego Maxima!
			Repello Inimicum!
			Fianto Duri!
        """;

        String s1 = "Wingardium Leviosa";
        String s2 = "Wingardium" + " " + "Leviosa";
        String s3 = "Wingardium Leviosa Wingardium Leviosa";

        // Получим true
        System.out.println(s1.equals(s2));
        // Получим false
        System.out.println(s1.equals(s3));

        String s11 = "REDUCIO";
        String s22 = "inflatus";

        // Получится "reducio"
        System.out.println(s11.toLowerCase());
        // Получится "INFLATUS";
        System.out.println(s22.toUpperCase());

        String charm1 = "CHARM";

        // Получим 'C'
        System.out.println(charm1.charAt(0));

        // Получим 'M'
        System.out.println(charm1.charAt(4));

        // Получим ошибку, так как в строке нет символа под номером 8
        // System.out.println(charm1.charAt(8));
        // Получим ошибку, так как не поддерживаются отрицательные индексы
        //System.out.println(charm1.charAt(-1));

        String str = "Bombarda Maxima!";
        // Получим 16. Пробелы и символы - считаются!
        System.out.println(str.length());

        String charm = "Bombarda Maxima!";

        // Получим true
        boolean charmStart1 = charm.startsWith("Bom");
        // Получим false
        boolean charmStart2 = charm.startsWith("ard");

        // Получим true
        boolean charmEnd1 = charm.endsWith("xima!");
        // Получим false
        boolean charmEnd2 = charm.endsWith("Max");

       // String charm = "Bombarda Maxima!";

        // Получим 9, начиная с 9-го символа в строке содержится "Maxima"
        System.out.println(charm.indexOf("Maxima"));
        // Получим -1, потому что такой подстроки нет
        System.out.println(charm.indexOf("schooooooool"));

        // contains вернёт true, если подстрока содержится в строке
        System.out.println(charm.contains("Bom"));
        // contains вернёт false, если подстрока НЕ содержится в строке
        System.out.println(charm.contains("Bum"));

       // String charm = "Bombarda Maxima!";
        String result11 = charm.replace("Bombarda", "Wow!"); // заменяет "Bombarda" на "Wow!"
        System.out.println(result1); // получим "Wow! Maxima!"

        String result22 = charm.replaceAll("a", "0"); // заменяет все a в строке charm на 0
        System.out.println(result2); // получим "Bomb0rd0 M0xim0!"

        // STRINGS homework
        // _____________________________
        // #1
       // StringBuilder builder = new StringBuilder();
        String randomDigits = String.valueOf(new Random().nextInt());
        String substringOfRandomDigits = randomDigits.substring(0,5);
        System.out.println("String of random digits of length 5 is: " + substringOfRandomDigits);
        // # 2
        String replace = substringOfRandomDigits.replaceAll( "1", "i" );
        String replaceDashes = replace.replace("-","");
        String replaceToO = replaceDashes.replaceAll("0", "o");
        String replaceToB = replaceToO.replaceAll("6", "b");
        System.out.println("replaceToB: " + replaceToB);

        Boolean is23There = replaceToB.contains("23");
        System.out.println("is23There: " + is23There);
        castSpell();

        int newNumber1 = new Random().nextInt(0, 100);
        boolean isFirstEven = newNumber1 % 2 == 0;
        int newNumber2 = new Random().nextInt();
        boolean isSecondEven = newNumber2  % 2 == 0;
        if (isFirstEven & isSecondEven == true) {
            int sum1 = (newNumber1/2) + (newNumber2/2);
            System.out.println("both even: " + sum1);
        } else if (isFirstEven == true) {
            int sum2 = (newNumber1/2) + newNumber2;
            System.out.println("first even: " + sum2);
        } else if (isSecondEven == true) {
            int sum3 = newNumber1 + (newNumber2/2);
            System.out.println("second even: " + sum3);
        } else {
            int finalSum = newNumber1 + newNumber2;
            System.out.println("the total sum: " + finalSum);
        }
        System.out.println("newNumber1 and newNumber2: " + newNumber1 + " and " + newNumber2);
    }

    public static void castSpell() {
        String anyString = "ARDENTIS VERUM LUMINOS ET FULGUR SYLVESTRA ELIXIA";
        String anyStringToLower =  anyString.toLowerCase();
        System.out.println("anyStringToLower: " + anyStringToLower);

        int start = new Random().nextInt(0, 50);
        System.out.println("random number 'start' : " + start);

        String subString = anyString.substring(0, start);
        System.out.println("random number 'subString' : " + subString);

        StringBuilder spell = new StringBuilder();

        // 6. Разверните строку задом наперед.
        StringBuilder stringBuilder = new StringBuilder(anyString);
        stringBuilder.reverse();
        String reversedString = stringBuilder.toString();
        System.out.println("reversedString : " + reversedString);

        // 7. В полученной строке поменяйте местами символы под 0 и 1 индексами. *
        // (обратитесь к методу replace: сначала получите символы (одна буква или символ пробела)
        // под этими индексами с помощью метода charAt, а затем используйте их для замены).

        // Должно получиться что-то такое:
        // builder.replace(0, 1, String.valueOf(one));
        // builder.replace(1,2, String.valueOf(zero));
        // stringBuilder.replace(0,1, String.valueOf());

 */
    }
}