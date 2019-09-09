package dtsvetkov.tools.netdata.beans.responses;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "version",
        "uid",
        "mirrored_hosts",
        "alarms",
        "os_name",
        "os_id",
        "os_id_like",
        "os_version",
        "os_version_id",
        "os_detection",
        "kernel_name",
        "kernel_version",
        "architecture",
        "virtualization",
        "virt_detection",
        "container",
        "container_detection",
        "collectors"
})
public class InfoResponse {

    @JsonProperty("version")
    private String version;
    @JsonProperty("uid")
    private String uid;
    @JsonProperty("mirrored_hosts")
    private List<String> mirroredHosts = null;
    @JsonProperty("alarms")
    private Alarms alarms;
    @JsonProperty("os_name")
    private String osName;
    @JsonProperty("os_id")
    private String osId;
    @JsonProperty("os_id_like")
    private String osIdLike;
    @JsonProperty("os_version")
    private String osVersion;
    @JsonProperty("os_version_id")
    private String osVersionId;
    @JsonProperty("os_detection")
    private String osDetection;
    @JsonProperty("kernel_name")
    private String kernelName;
    @JsonProperty("kernel_version")
    private String kernelVersion;
    @JsonProperty("architecture")
    private String architecture;
    @JsonProperty("virtualization")
    private String virtualization;
    @JsonProperty("virt_detection")
    private String virtDetection;
    @JsonProperty("container")
    private String container;
    @JsonProperty("container_detection")
    private String containerDetection;
    @JsonProperty("collectors")
    private List<Collector> collectors = null;

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty("uid")
    public String getUid() {
        return uid;
    }

    @JsonProperty("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    @JsonProperty("mirrored_hosts")
    public List<String> getMirroredHosts() {
        return mirroredHosts;
    }

    @JsonProperty("mirrored_hosts")
    public void setMirroredHosts(List<String> mirroredHosts) {
        this.mirroredHosts = mirroredHosts;
    }

    @JsonProperty("alarms")
    public Alarms getAlarms() {
        return alarms;
    }

    @JsonProperty("alarms")
    public void setAlarms(Alarms alarms) {
        this.alarms = alarms;
    }

    @JsonProperty("os_name")
    public String getOsName() {
        return osName;
    }

    @JsonProperty("os_name")
    public void setOsName(String osName) {
        this.osName = osName;
    }

    @JsonProperty("os_id")
    public String getOsId() {
        return osId;
    }

    @JsonProperty("os_id")
    public void setOsId(String osId) {
        this.osId = osId;
    }

    @JsonProperty("os_id_like")
    public String getOsIdLike() {
        return osIdLike;
    }

    @JsonProperty("os_id_like")
    public void setOsIdLike(String osIdLike) {
        this.osIdLike = osIdLike;
    }

    @JsonProperty("os_version")
    public String getOsVersion() {
        return osVersion;
    }

    @JsonProperty("os_version")
    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    @JsonProperty("os_version_id")
    public String getOsVersionId() {
        return osVersionId;
    }

    @JsonProperty("os_version_id")
    public void setOsVersionId(String osVersionId) {
        this.osVersionId = osVersionId;
    }

    @JsonProperty("os_detection")
    public String getOsDetection() {
        return osDetection;
    }

    @JsonProperty("os_detection")
    public void setOsDetection(String osDetection) {
        this.osDetection = osDetection;
    }

    @JsonProperty("kernel_name")
    public String getKernelName() {
        return kernelName;
    }

    @JsonProperty("kernel_name")
    public void setKernelName(String kernelName) {
        this.kernelName = kernelName;
    }

    @JsonProperty("kernel_version")
    public String getKernelVersion() {
        return kernelVersion;
    }

    @JsonProperty("kernel_version")
    public void setKernelVersion(String kernelVersion) {
        this.kernelVersion = kernelVersion;
    }

    @JsonProperty("architecture")
    public String getArchitecture() {
        return architecture;
    }

    @JsonProperty("architecture")
    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    @JsonProperty("virtualization")
    public String getVirtualization() {
        return virtualization;
    }

    @JsonProperty("virtualization")
    public void setVirtualization(String virtualization) {
        this.virtualization = virtualization;
    }

    @JsonProperty("virt_detection")
    public String getVirtDetection() {
        return virtDetection;
    }

    @JsonProperty("virt_detection")
    public void setVirtDetection(String virtDetection) {
        this.virtDetection = virtDetection;
    }

    @JsonProperty("container")
    public String getContainer() {
        return container;
    }

    @JsonProperty("container")
    public void setContainer(String container) {
        this.container = container;
    }

    @JsonProperty("container_detection")
    public String getContainerDetection() {
        return containerDetection;
    }

    @JsonProperty("container_detection")
    public void setContainerDetection(String containerDetection) {
        this.containerDetection = containerDetection;
    }

    @JsonProperty("collectors")
    public List<Collector> getCollectors() {
        return collectors;
    }

    @JsonProperty("collectors")
    public void setCollectors(List<Collector> collectors) {
        this.collectors = collectors;
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "normal",
            "warning",
            "critical"
    })
    public static class Alarms {

        @JsonProperty("normal")
        private Integer normal;
        @JsonProperty("warning")
        private Integer warning;
        @JsonProperty("critical")
        private Integer critical;

        @JsonProperty("normal")
        public Integer getNormal() {
            return normal;
        }

        @JsonProperty("normal")
        public void setNormal(Integer normal) {
            this.normal = normal;
        }

        @JsonProperty("warning")
        public Integer getWarning() {
            return warning;
        }

        @JsonProperty("warning")
        public void setWarning(Integer warning) {
            this.warning = warning;
        }

        @JsonProperty("critical")
        public Integer getCritical() {
            return critical;
        }

        @JsonProperty("critical")
        public void setCritical(Integer critical) {
            this.critical = critical;
        }

    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "plugin",
            "module"
    })
    public static class Collector {

        @JsonProperty("plugin")
        private String plugin;
        @JsonProperty("module")
        private String module;

        @JsonProperty("plugin")
        public String getPlugin() {
            return plugin;
        }

        @JsonProperty("plugin")
        public void setPlugin(String plugin) {
            this.plugin = plugin;
        }

        @JsonProperty("module")
        public String getModule() {
            return module;
        }

        @JsonProperty("module")
        public void setModule(String module) {
            this.module = module;
        }

    }

}