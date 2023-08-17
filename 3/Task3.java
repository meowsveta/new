public class Task3 {

    public static void main(String[] args) {
        String text = "Ной и вера - шанс у Сиона\n" +
                "но Исус на шаре - Вийон";

        if (palindrom(text)){
            System.out.println("Строка является палиндромом.");
        }
        else {
            System.out.println("Строка не является палиндромом.");
        }
    }

    public static boolean palindrom (String string){
        boolean result;
        String str1 = string.replaceAll("\\n", "").replaceAll("\\p{P}", "").replaceAll(" ", "").toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(str1).reverse();
        result = str1.equals(stringBuilder.toString());
        return result;
    }
}
