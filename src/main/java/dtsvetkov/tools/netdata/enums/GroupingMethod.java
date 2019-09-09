package dtsvetkov.tools.netdata.enums;

public enum GroupingMethod {

    MAX("max"), MIN("min"), AVERAGE("average"), SUM("sum"), INCREMENTAL_SUM("incremental-sum");

    private String name;

    GroupingMethod(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
