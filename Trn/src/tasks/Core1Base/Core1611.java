package tasks.Core1Base;

public class Core1611 {
    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder replicas = new StringBuilder();
        for (String role : roles) {
            replicas.append(role + ":" + "\n");
            for (int i = 0; i < textLines.length; i++) {
                if (textLines[i].startsWith(role + ":")) {
                    replicas.append((i + 1) + ")" + textLines[i].substring(role.length() + 1) + "\n");
                }
            }
            replicas.append("\n");
        }
        System.out.println(replicas.toString());
        return replicas.toString();
    }

    public static void main(String[] args) {
        String[] roles = {"Городничий", "Аммос Федорович",
                "Артемий Филиппович", "Лука Лукич"};
        String[] textLines = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?", "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!", "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

        printTextPerRole(roles, textLines);
    }
}
