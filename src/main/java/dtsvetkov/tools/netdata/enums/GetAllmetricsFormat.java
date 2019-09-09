package dtsvetkov.tools.netdata.enums;

public enum GetAllmetricsFormat {
    SHELL("shell"),PROMETHEUS("prometheus"),PROMETHEUS_ALL_HOSTS("prometheus_all_hosts"),JSON("json");

    private String name;

    GetAllmetricsFormat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
