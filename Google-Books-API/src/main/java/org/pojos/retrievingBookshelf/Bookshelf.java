package org.pojos.retrievingBookshelf;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "kind",
        "id",
        "selfLink",
        "title",
        "description",
        "access",
        "updated",
        "created",
        "volumeCount",
        "volumesLastUpdated"
})
@Generated("jsonschema2pojo")
public class Bookshelf {

    @JsonProperty("kind")
    private String kind;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("selfLink")
    private String selfLink;
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
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
     *
     */
    public Bookshelf() {
    }

    /**
     *
     * @param access
     * @param kind
     * @param created
     * @param description
     * @param volumeCount
     * @param id
     * @param title
     * @param updated
     * @param volumesLastUpdated
     * @param selfLink
     */
    public Bookshelf(String kind, Integer id, String selfLink, String title, String description, String access, String updated, String created, Integer volumeCount, String volumesLastUpdated) {
        super();
        this.kind = kind;
        this.id = id;
        this.selfLink = selfLink;
        this.title = title;
        this.description = description;
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

    @JsonProperty("selfLink")
    public String getSelfLink() {
        return selfLink;
    }

    @JsonProperty("selfLink")
    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
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
        return "Bookshelf{" +
                "kind='" + kind + '\'' +
                ", id=" + id +
                ", selfLink='" + selfLink + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", access='" + access + '\'' +
                ", updated='" + updated + '\'' +
                ", created='" + created + '\'' +
                ", volumeCount=" + volumeCount +
                ", volumesLastUpdated='" + volumesLastUpdated + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }


}
