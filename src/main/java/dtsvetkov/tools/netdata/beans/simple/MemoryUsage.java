package dtsvetkov.tools.netdata.beans.simple;

public class MemoryUsage {

    protected Double free;
    protected Double used;
    protected Double cached;
    protected Double buffers;

    public Double getFree() {
        return free;
    }

    public void setFree(Double free) {
        this.free = free;
    }

    public Double getUsed() {
        return used;
    }

    public void setUsed(Double used) {
        this.used = used;
    }

    public Double getCached() {
        return cached;
    }

    public void setCached(Double cached) {
        this.cached = cached;
    }

    public Double getBuffers() {
        return buffers;
    }

    public void setBuffers(Double buffers) {
        this.buffers = buffers;
    }
}
