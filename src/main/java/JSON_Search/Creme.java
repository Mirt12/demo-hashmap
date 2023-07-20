package JSON_Search;

public class Creme {
    int id;
    String title;
    String cost;
    String cost_for_human;
    String discount_cost;
    String discount_cost_for_human;
    String current_cost;
    String current_cost_for_human;
    String discount;
    Images images;

    public Creme(int id, String title, String cost, String cost_for_human, String discount_cost, String discount_cost_for_human, String current_cost, String current_cost_for_human, String discount, Images images) {
        this.id = id;
        this.title = title;
        this.cost = cost;
        this.cost_for_human = cost_for_human;
        this.discount_cost = discount_cost;
        this.discount_cost_for_human = discount_cost_for_human;
        this.current_cost = current_cost;
        this.current_cost_for_human = current_cost_for_human;
        this.discount = discount;
        this.images = images;
    }

    @Override
    public String toString() {
        return "Creme{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", cost=" + cost +
                ", cost_for_human=" + cost_for_human +
                ", discount_cost=" + discount_cost +
                ", discount_cost_for_human=" + discount_cost_for_human +
                ", current_cost=" + current_cost +
                ", current_cost_for_human=" + current_cost_for_human +
                ", discount=" + discount +
                ", images=" + images +
                '}';
    }
}
