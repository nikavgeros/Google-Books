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
        "containsEpubBubbles",
        "containsImageBubbles"
})
@Generated("jsonschema2pojo")
public class PanelizationSummary {

    @JsonProperty("containsEpubBubbles")
    private Boolean containsEpubBubbles;
    @JsonProperty("containsImageBubbles")
    private Boolean containsImageBubbles;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public PanelizationSummary() {
    }

    /**
     *
     * @param containsImageBubbles
     * @param containsEpubBubbles
     */
    public PanelizationSummary(Boolean containsEpubBubbles, Boolean containsImageBubbles) {
        super();
        this.containsEpubBubbles = containsEpubBubbles;
        this.containsImageBubbles = containsImageBubbles;
    }

    @JsonProperty("containsEpubBubbles")
    public Boolean getContainsEpubBubbles() {
        return containsEpubBubbles;
    }

    @JsonProperty("containsEpubBubbles")
    public void setContainsEpubBubbles(Boolean containsEpubBubbles) {
        this.containsEpubBubbles = containsEpubBubbles;
    }

    @JsonProperty("containsImageBubbles")
    public Boolean getContainsImageBubbles() {
        return containsImageBubbles;
    }

    @JsonProperty("containsImageBubbles")
    public void setContainsImageBubbles(Boolean containsImageBubbles) {
        this.containsImageBubbles = containsImageBubbles;
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
        return "PanelizationSummary{" +
                "containsEpubBubbles=" + containsEpubBubbles +
                ", containsImageBubbles=" + containsImageBubbles +
                ", additionalProperties=" + additionalProperties +
                '}';
    }

}