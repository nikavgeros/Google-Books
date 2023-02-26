package org.pojos.retrievingBookshelfVolume;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "isAvailable",
        "acsTokenLink"
})
@Generated("jsonschema2pojo")
public class Pdf {

    @JsonProperty("isAvailable")
    private Boolean isAvailable;
    @JsonProperty("acsTokenLink")
    private String acsTokenLink;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Pdf() {
    }

    /**
     * @param isAvailable
     * @param acsTokenLink
     */
    public Pdf(Boolean isAvailable, String acsTokenLink) {
        super();
        this.isAvailable = isAvailable;
        this.acsTokenLink = acsTokenLink;
    }

    @JsonProperty("isAvailable")
    public Boolean getIsAvailable() {
        return isAvailable;
    }

    @JsonProperty("isAvailable")
    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    @JsonProperty("acsTokenLink")
    public String getAcsTokenLink() {
        return acsTokenLink;
    }

    @JsonProperty("acsTokenLink")
    public void setAcsTokenLink(String acsTokenLink) {
        this.acsTokenLink = acsTokenLink;
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
        return "Pdf{" +
                "isAvailable=" + isAvailable +
                ", acsTokenLink='" + acsTokenLink + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }

}
