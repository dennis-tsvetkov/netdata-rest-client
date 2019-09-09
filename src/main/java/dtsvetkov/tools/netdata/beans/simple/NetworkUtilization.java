package dtsvetkov.tools.netdata.beans.simple;

public class NetworkUtilization {
    protected Double sent;
    protected Double received;

    public Double getSent() {
        return sent;
    }

    public void setSent(Double sent) {
        this.sent = sent;
    }

    public Double getReceived() {
        return received;
    }

    public void setReceived(Double received) {
        this.received = received;
    }
}
