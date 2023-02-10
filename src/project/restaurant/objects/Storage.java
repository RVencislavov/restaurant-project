package project.restaurant.objects;

import project.restaurant.interfaces.ColorAble;

import java.util.Map;

public class Storage implements ColorAble {
    public Map<String, Double> availableProducts;

    public Storage(Map<String, Double> availableProducts) {
        this.availableProducts = availableProducts;
    }

    public Map<String, Double> getAvailableProducts() {
        return availableProducts;
    }

    public void printStorage() {
        System.out.println(ANSI_YELLOW + "Складова наличност:" + "\n");

        for (Map.Entry<String, Double> product : availableProducts.entrySet()) {
            if (product.getKey().equalsIgnoreCase("Минерална вода") || product.getKey().equalsIgnoreCase("Студен чай") ||
                    product.getKey().equalsIgnoreCase("Кока Кола") || product.getKey().equalsIgnoreCase("Бира Starobrno") ||
                    product.getKey().equalsIgnoreCase("Бира Heineken")) {
                System.out.printf("%-40s  %.2f бр. \n", product.getKey(), product.getValue());
            } else if (product.getKey().equalsIgnoreCase("Уиски Jameson") || product.getKey().equalsIgnoreCase("Уиски Glenfiddich") ||
                    product.getKey().equalsIgnoreCase("Росиди Розе де Пино") || product.getKey().equalsIgnoreCase("Червено вино - Еленово Каберне Совеньон") ||
                    product.getKey().equalsIgnoreCase("Бяло вино - Еленово Шардоне") || product.getKey().equalsIgnoreCase("Готварска сметана")) {
                System.out.printf("%-40s  %.2f л. \n", product.getKey(), product.getValue());
            } else {
                System.out.printf("%-40s  %.2f кг. \n", product.getKey(), product.getValue());
            }
        }
        System.out.println(ANSI_RESET);
    }

    public Map<String, Double> rechargeProducts() { // Metodi.T
        if (availableProducts.get("Свинско месо") <= 10.0) {
            availableProducts.computeIfPresent("Свинско месо", (k, v) -> v + 30.0);
//            availableProducts.put("Свинско месо", 50.0);
        }
        if (availableProducts.get("Моцарела") <= 10.0) {
            availableProducts.computeIfPresent("Моцарела", (k, v) -> v + 30.0);
//            availableProducts.put("Моцарела", 50.0);
        }
        if (availableProducts.get("Пилешко месо") <= 10.0) {
            availableProducts.computeIfPresent("Пилешко месо", (k, v) -> v + 50.0);
//            availableProducts.put("Пилешко месо", 50.0);
        }
        if (availableProducts.get("Телешко месо") <= 10.0) {
            availableProducts.computeIfPresent("Телешко месо", (k, v) -> v + 50.0);
//            availableProducts.put("Телешко месо", 50.0);
        }
        if (availableProducts.get("Риба тон") <= 10.0) {
            availableProducts.computeIfPresent("Риба тон", (k, v) -> v + 30.0);
//            availableProducts.put("Риба тон", 50.0);
        }
        if (availableProducts.get("Гъби") <= 10.0) {
            availableProducts.computeIfPresent("Гъби", (k, v) -> v + 30.0);
//            availableProducts.put("Гъби", 50.0);
        }
        if (availableProducts.get("Картофи") <= 10.0) {
            availableProducts.computeIfPresent("Картофи", (k, v) -> v + 30.0);
//            availableProducts.put("Картофи", 50.0);
        }
        if (availableProducts.get("Червени пиперки") <= 10.0) {
            availableProducts.computeIfPresent("Червени пиперки", (k, v) -> v + 30.0);
//            availableProducts.put("Червени пиперки", 50.0);
        }
        if (availableProducts.get("Моркови") <= 10.0) {
            availableProducts.computeIfPresent("Моркови", (k, v) -> v + 30.0);
//            availableProducts.put("Моркови", 50.0);
        }
        if (availableProducts.get("Тиквички") <= 10.0) {
            availableProducts.computeIfPresent("Тиквички", (k, v) -> v + 30.0);
//            availableProducts.put("Тиквички", 50.0);
        }
        if (availableProducts.get("Домати") <= 10.0) {
            availableProducts.computeIfPresent("Домати", (k, v) -> v + 30.0);
//            availableProducts.put("Домати", 50.0);
        }
        if (availableProducts.get("Чери домати") <= 10.0) {
            availableProducts.computeIfPresent("Чери домати", (k, v) -> v + 30.0);
//            availableProducts.put("Чери домати", 50.0);
        }
        if (availableProducts.get("Краставици") <= 10.0) {
            availableProducts.computeIfPresent("Краставици", (k, v) -> v + 30.0);
//            availableProducts.put("Краставици", 50.0);
        }
        if (availableProducts.get("Айсберг") <= 10.0) {
            availableProducts.computeIfPresent("Айсберг", (k, v) -> v + 30.0);
//            availableProducts.put("Айсберг", 50.0);
        }
        if (availableProducts.get("Царевица") <= 10.0) {
            availableProducts.computeIfPresent("Царевица", (k, v) -> v + 30.0);
//            availableProducts.put("Царевица", 50.0);
        }
        if (availableProducts.get("Червен лук") <= 10.0) {
            availableProducts.computeIfPresent("Червен лук", (k, v) -> v + 30.0);
//            availableProducts.put("Червен лук", 50.0);
        }
        if (availableProducts.get("Лук") <= 10.0) {
            availableProducts.computeIfPresent("Лук", (k, v) -> v + 30.0);
//            availableProducts.put("Лук", 50.0);
        }
        if (availableProducts.get("Маслини") <= 10.0) {
            availableProducts.computeIfPresent("Маслини", (k, v) -> v + 30.0);
//            availableProducts.put("Маслини", 50.0);

        }
        if (availableProducts.get("Сирене") <= 10.0) {
            availableProducts.computeIfPresent("Сирене", (k, v) -> v + 30.0);
//            availableProducts.put("Сирене", 50.0);
        }
        if (availableProducts.get("Моцарела") <= 10.0) {
            availableProducts.computeIfPresent("Моцарела", (k, v) -> v + 30.0);
//            availableProducts.put("Моцарела", 50.0);
        }
        if (availableProducts.get("Колекция сирена") <= 10.0) {
            availableProducts.computeIfPresent("Колекция сирена", (k, v) -> v + 30.0);
//            availableProducts.put("Колекция сирена", 50.0);
        }
        if (availableProducts.get("Готварска сметана") <= 10.0) {
            availableProducts.computeIfPresent("Готварска сметана", (k, v) -> v + 30.0);
//            availableProducts.put("Готварска сметана", 50.0);
        }
        if (availableProducts.get("Тесто") <= 10.0) {
            availableProducts.computeIfPresent("Тесто", (k, v) -> v + 30.0);
//            availableProducts.put("Тесто", 50.0);
        }
        if (availableProducts.get("Течен шоколад") <= 10.0) {
            availableProducts.computeIfPresent("Течен шоколад", (k, v) -> v + 30.0);
//            availableProducts.put("Течен шоколад", 50.0);
        }
        if (availableProducts.get("Еклерова торта") <= 10.0) {
            availableProducts.computeIfPresent("Еклерова торта", (k, v) -> v + 30.0);
//            availableProducts.put("Еклерова торта", 50.0);
        }
        if (availableProducts.get("Шоколадово суфле") <= 10.0) {
            availableProducts.computeIfPresent("Шоколадово суфле", (k, v) -> v + 30.0);
//            availableProducts.put("Шоколадово суфле", 50.0);
        }
        if (availableProducts.get("Бяло вино - Еленово Шардоне") <= 10.0) {
            availableProducts.computeIfPresent("Бяло вино - Еленово Шардоне", (k, v) -> v + 60.0);
//            availableProducts.put("Бяло вино - Еленово Шардоне", 50.0);
        }
        if (availableProducts.get("Червено вино - Еленово Каберне Совиньон") <= 10.0) {
            availableProducts.computeIfPresent("Червено вино - Еленово Каберне Совиньон", (k, v) -> v + 60.0);
//            availableProducts.put("Червено вино - Еленово Каберне Совиньон", 50.0);
        }
        if (availableProducts.get("Росиди Розе де Пино") <= 10.0) {
            availableProducts.computeIfPresent("Росиди Розе де Пино", (k, v) -> v + 60.0);
//            availableProducts.put("Росиди Розе де Пино", 50.0);
        }
        if (availableProducts.get("Уиски Glenfiddich") <= 10.0) {
            availableProducts.computeIfPresent("Уиски Glenfiddich", (k, v) -> v + 40.0);
//            availableProducts.put("Уиски Glenfiddich", 50.0);
        }
        if (availableProducts.get("Уиски Jameson") <= 10.0) {
            availableProducts.computeIfPresent("Уиски Jameson", (k, v) -> v + 40.0);
//            availableProducts.put("Уиски Jameson", 50.0);
        }
        if (availableProducts.get("Бира Heineken") <= 50.0) {
            availableProducts.computeIfPresent("Бира Heineken", (k, v) -> v + 200.0);
//            availableProducts.put("Бира Heineken", 50.0);
        }
        if (availableProducts.get("Бира Starobrno") <= 50.0) {
            availableProducts.computeIfPresent("Бира Starobrno", (k, v) -> v + 200.0);
//            availableProducts.put("Бира Starobrno", 50.0);
        }
        if (availableProducts.get("Кока Кола") <= 50.0) {
            availableProducts.computeIfPresent("Кока Кола", (k, v) -> v + 200.0);
//            availableProducts.put("Кока Кола", 50.0);
        }
        if (availableProducts.get("Студен чай") <= 50.0) {
            availableProducts.computeIfPresent("Студен чай", (k, v) -> v + 200.0);
//            availableProducts.put("Студен чай", 50.0);
        }
        if (availableProducts.get("Минерална вода") <= 50.0) {
            availableProducts.computeIfPresent("Минерална вода", (k, v) -> v + 200.0);
//            availableProducts.put("Минерална вода", 50.0);
        }
        System.out.println("Наличност за следващия ден");
        return availableProducts;
    }
}
