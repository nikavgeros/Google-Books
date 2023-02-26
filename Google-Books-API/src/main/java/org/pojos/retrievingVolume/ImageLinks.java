package org.pojos.retrievingVolume;


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
        "smallThumbnail",
        "thumbnail",
        "small",
        "medium",
        "large",
        "extraLarge"
})
@Generated("jsonschema2pojo")
public class ImageLinks {

    @JsonProperty("smallThumbnail")
    private String smallThumbnail;
    @JsonProperty("thumbnail")
    private String thumbnail;
    @JsonProperty("small")
    private String small;
    @JsonProperty("medium")
    private String medium;
    @JsonProperty("large")
    private String large;
    @JsonProperty("extraLarge")
    private String extraLarge;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("smallThumbnail")
    public String getSmallThumbnail() {
        return smallThumbnail;
    }

    @JsonProperty("smallThumbnail")
    public void setSmallThumbnail(String smallThumbnail) {
        this.smallThumbnail = smallThumbnail;
    }

    @JsonProperty("thumbnail")
    public String getThumbnail() {
        return thumbnail;
    }

    @JsonProperty("thumbnail")
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    @JsonProperty("small")
    public String getSmall() {
        return small;
    }

    @JsonProperty("small")
    public void setSmall(String small) {
        this.small = small;
    }

    @JsonProperty("medium")
    public String getMedium() {
        return medium;
    }

    @JsonProperty("medium")
    public void setMedium(String medium) {
        this.medium = medium;
    }

    @JsonProperty("large")
    public String getLarge() {
        return large;
    }

    @JsonProperty("large")
    public void setLarge(String large) {
        this.large = large;
    }

    @JsonProperty("extraLarge")
    public String getExtraLarge() {
        return extraLarge;
    }

    @JsonProperty("extraLarge")
    public void setExtraLarge(String extraLarge) {
        this.extraLarge = extraLarge;
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
        return "ImageLinks{" +
                "smallThumbnail='" + smallThumbnail + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                ", small='" + small + '\'' +
                ", medium='" + medium + '\'' +
                ", large='" + large + '\'' +
                ", extraLarge='" + extraLarge + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }

}
