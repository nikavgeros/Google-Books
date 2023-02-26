package org.pojos.performingSearch;

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
        "isAvailable",
        "acsTokenLink"
})
@Generated("jsonschema2pojo")
public class Epub {

    @JsonProperty("isAvailable")
    private Boolean isAvailable;
    @JsonProperty("acsTokenLink")
    private String acsTokenLink;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Epub() {
    }

    /**
     *
     * @param isAvailable
     * @param acsTokenLink
     */
    public Epub(Boolean isAvailable, String acsTokenLink) {
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
        return "Epub{" +
                "isAvailable=" + isAvailable +
                ", acsTokenLink='" + acsTokenLink + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }

}