package dtsvetkov.tools.netdata.enums;

public enum GetAllmetricsDatasource {

    AS_COLLECTED("as-collected"),AVERAGE("average"),SUM("sum");

    private String name;

    GetAllmetricsDatasource(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
