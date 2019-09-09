package dtsvetkov.tools.netdata.beans.simple;

public class CpuLoad {

    protected Double user;
    protected Double system;
    protected Double softirq;
    protected Double nice;
    protected Double iowait;

    public CpuLoad() {
    }

    public Double getUser() {
        return user;
    }

    public void setUser(Double user) {
        this.user = user;
    }

    public Double getSystem() {
        return system;
    }

    public void setSystem(Double system) {
        this.system = system;
    }

    public Double getSoftirq() {
        return softirq;
    }

    public void setSoftirq(Double softirq) {
        this.softirq = softirq;
    }

    public Double getNice() {
        return nice;
    }

    public void setNice(Double nice) {
        this.nice = nice;
    }

    public Double getIowait() {
        return iowait;
    }

    public void setIowait(Double iowait) {
        this.iowait = iowait;
    }
}
