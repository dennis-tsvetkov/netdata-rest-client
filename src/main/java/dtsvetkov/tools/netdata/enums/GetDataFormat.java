package dtsvetkov.tools.netdata.enums;

public enum GetDataFormat {

    JSON("json"), JSONP("jsonp"), CSV("csv"), TSV("tsv"), TSV_EXCEL("tsv-excel"), SSV("ssv"),
    SSV_COMMA("ssvcomma"), DATA_TABLE("datatable"), DATA_SOURCE("datasource"), HTML("html"),
    MARK_DOWN("markdown"), ARRAY("array"), CSV_JSON_ARRAY("csvjsonarray");

    private String name;

    GetDataFormat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
