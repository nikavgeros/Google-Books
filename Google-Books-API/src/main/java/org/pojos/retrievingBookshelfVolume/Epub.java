package org.pojos.retrievingBookshelfVolume;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "isAvailable"
})
@Generated("jsonschema2pojo")
public class Epub {

    @JsonProperty("isAvailable")
    private Boolean isAvailable;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Epub() {
    }

    /**
     * @param isAvailable
     */
    public Epub(Boolean isAvailable) {
        super();
        this.isAvailable = isAvailable;
    }

    @JsonProperty("isAvailable")
    public Boolean getIsAvailable() {
        return isAvailable;
    }

    @JsonProperty("isAvailable")
    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
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
                ", additionalProperties=" + additionalProperties +
                '}';
    }

}
