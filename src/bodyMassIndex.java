public class bodyMassIndex {
    public static void main(String[] args) {

        BmiService bmiService = new BmiService();
        double a = bmiService.calculate(70.0, 169.0);

        System.out.println("-ВАШ ИНДЕКС МАССЫ ТЕЛА (ИМТ): " + a + "\n" +

                "-Норма меньше 25\n" +
                "-Избыточный вес 25-29,9\n" +
                "-I степень ожирения 30-34,9\n" +
                "-II степень ожирения 35-39,9\n" +
                "-III степень ожирения более 40");

    }
}
