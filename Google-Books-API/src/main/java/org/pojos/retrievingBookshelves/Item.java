package org.pojos.retrievingBookshelves;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "kind",
        "id",
        "title",
        "access",
        "updated",
        "created",
        "volumeCount",
        "volumesLastUpdated"
})
@Generated("jsonschema2pojo")
public class Item {

    @JsonProperty("kind")
    private String kind;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("access")
    private String access;
    @JsonProperty("updated")
    private String updated;
    @JsonProperty("created")
    private String created;
    @JsonProperty("volumeCount")
    private Integer volumeCount;
    @JsonProperty("volumesLastUpdated")
    private String volumesLastUpdated;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Item() {
    }

    /**
     * @param access
     * @param kind
     * @param created
     * @param volumeCount
     * @param id
     * @param title
     * @param updated
     * @param volumesLastUpdated
     */
    public Item(String kind, Integer id, String title, String access, String updated, String created, Integer volumeCount, String volumesLastUpdated) {
        super();
        this.kind = kind;
        this.id = id;
        this.title = title;
        this.access = access;
        this.updated = updated;
        this.created = created;
        this.volumeCount = volumeCount;
        this.volumesLastUpdated = volumesLastUpdated;
    }

    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("access")
    public String getAccess() {
        return access;
    }

    @JsonProperty("access")
    public void setAccess(String access) {
        this.access = access;
    }

    @JsonProperty("updated")
    public String getUpdated() {
        return updated;
    }

    @JsonProperty("updated")
    public void setUpdated(String updated) {
        this.updated = updated;
    }

    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    @JsonProperty("volumeCount")
    public Integer getVolumeCount() {
        return volumeCount;
    }

    @JsonProperty("volumeCount")
    public void setVolumeCount(Integer volumeCount) {
        this.volumeCount = volumeCount;
    }

    @JsonProperty("volumesLastUpdated")
    public String getVolumesLastUpdated() {
        return volumesLastUpdated;
    }

    @JsonProperty("volumesLastUpdated")
    public void setVolumesLastUpdated(String volumesLastUpdated) {
        this.volumesLastUpdated = volumesLastUpdated;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Item{" +
                "kind='" + kind + '\'' +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", access='" + access + '\'' +
                ", updated='" + updated + '\'' +
                ", created='" + created + '\'' +
                ", volumeCount=" + volumeCount +
                ", volumesLastUpdated='" + volumesLastUpdated + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }

}
