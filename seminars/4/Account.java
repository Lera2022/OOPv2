
class Account implements Accountable<String, Integer> {

    private String id;
    private Integer sum;

    Account(String id, Integer sum) {
        this.id = id;
        this.sum = sum;
    }

    public String getId() {
        return id;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

}
