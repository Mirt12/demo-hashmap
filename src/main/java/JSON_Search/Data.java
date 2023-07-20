package JSON_Search;

import java.util.HashMap;

public class Data {
    public static void main(String[] args) {
        Images images1 = new Images("https://api.y-r.by/storage/products/27300_0.webp");
        Images images2 = new Images("https://api.y-r.by/storage/products/26885_0.webp");
        Creme creme1 = new Creme(
                1982,
                "Крем для рук «Кокосовый Орех»",
                "14.55",
                "14.55 Br",
                "14.55",
                "14.55 Br",
                "14.55",
                "14.55 Br",
                "0", images1);
        Creme creme2 = new Creme(
                1983,
                "Крем для рук «Бурбонская Ваниль»",
                "14.55",
                "14.55 Br",
                "14.55",
                "14.55 Br",
                "14.55",
                "14.55 Br",
                "0",
                images1
        );
        ArrayOfCremes array = new ArrayOfCremes(creme1, creme2);
        HashMap<String, Object> data = new HashMap<>();
        data.put("data", array);
        System.out.println(data);
    }
}
