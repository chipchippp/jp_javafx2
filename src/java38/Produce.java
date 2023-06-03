package java38;

public class Produce {
    private  String produce;
    private Nation nation;

    public Produce(String produce, Nation nation) {
        this.produce = produce;
        this.nation = nation;
    }

    public String getProduce() {
        return produce;
    }

    public void setProduce(String produce) {
        this.produce = produce;
    }

    public Nation getNation() {
        return nation;
    }

    public void setNation(Nation nation) {
        this.nation = nation;
    }

}
