
class AccountWorker implements Accountable<Integer, Double> {
    private Integer id;
    private Double sum;

    AccountWorker(Integer id, Double sum) {
        this.id = id;
        this.sum = sum;
    }

    public Integer getId() {
        return id;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }
}
