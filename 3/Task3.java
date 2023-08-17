public class Task3 {

    public static void main(String[] args) {
        boolean result;
        String text = "Ной и вера - шанс у Сиона\n" +
                "но Исус на шаре - Вийон";
        String str1 = text.replaceAll("\\n", "").replaceAll("\\p{P}", "").replaceAll(" ", "").toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(str1).reverse();

        if (str1.equals(stringBuilder.toString())){
            System.out.println("Строка является палиндромом.");
            result = true;
        }
        else {
            System.out.println("Строка не является палиндромом.");
            result = false;
        }
    }
}
