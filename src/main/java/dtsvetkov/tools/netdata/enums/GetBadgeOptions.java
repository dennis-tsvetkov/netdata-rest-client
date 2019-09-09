package dtsvetkov.tools.netdata.enums;

public enum GetBadgeOptions {
    ABS("abs"),ABSOLUTE("absolute"),DISPLAY_ABSOLUTE("display-absolute"),ABSOLUTE_SUM("absolute-sum"),
    NULL_2_ZERO("null2zero"),PERCENTAGE("percentage"),UNALIGNED("unaligned");

    private String name;

    GetBadgeOptions(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
