package dtsvetkov.tools.netdata.enums;

public enum GetDataOptions {

    NON_ZERO("nonzero"), FLIP("flip"), JSON_WRAP("jsonwrap"), MIN2MAX("min2max"), SECONDS("seconds"),
    MILLISECONDS("milliseconds"), ABS("abs"), ABSOLUTE("absolute"), ABSOLUTE_SUM("absolute-sum"),
    NULL_2_ZERO("null2zero"), OBJECT_ROWS("objectrows"), GOOGLE_JSON("google_json"), PERCENTAGE("percentage"),
    UNALIGNED("unaligned"), MATCH_IDS("match-ids"), MATCH_NAMES("match-names");


    private String name;

    GetDataOptions(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
