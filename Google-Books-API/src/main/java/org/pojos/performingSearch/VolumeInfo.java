package org.pojos.performingSearch;

import java.util.HashMap;
import java.util.List;
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
        "title",
        "subtitle",
        "authors",
        "publisher",
        "publishedDate",
        "description",
        "industryIdentifiers",
        "readingModes",
        "pageCount",
        "printType",
        "categories",
        "maturityRating",
        "allowAnonLogging",
        "contentVersion",
        "panelizationSummary",
        "imageLinks",
        "language",
        "previewLink",
        "infoLink",
        "canonicalVolumeLink"
})
@Generated("jsonschema2pojo")
public class VolumeInfo {

    @JsonProperty("title")
    private String title;
    @JsonProperty("subtitle")
    private String subtitle;
    @JsonProperty("authors")
    private List<String> authors = null;
    @JsonProperty("publisher")
    private String publisher;
    @JsonProperty("publishedDate")
    private String publishedDate;
    @JsonProperty("description")
    private String description;
    @JsonProperty("industryIdentifiers")
    private List<IndustryIdentifier> industryIdentifiers = null;
    @JsonProperty("readingModes")
    private ReadingModes readingModes;
    @JsonProperty("pageCount")
    private Integer pageCount;
    @JsonProperty("printType")
    private String printType;
    @JsonProperty("categories")
    private List<String> categories = null;
    @JsonProperty("maturityRating")
    private String maturityRating;
    @JsonProperty("allowAnonLogging")
    private Boolean allowAnonLogging;
    @JsonProperty("contentVersion")
    private String contentVersion;
    @JsonProperty("panelizationSummary")
    private PanelizationSummary panelizationSummary;
    @JsonProperty("imageLinks")
    private ImageLinks imageLinks;
    @JsonProperty("language")
    private String language;
    @JsonProperty("previewLink")
    private String previewLink;
    @JsonProperty("infoLink")
    private String infoLink;
    @JsonProperty("canonicalVolumeLink")
    private String canonicalVolumeLink;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public VolumeInfo() {
    }

    /**
     * @param industryIdentifiers
     * @param pageCount
     * @param printType
     * @param readingModes
     * @param previewLink
     * @param canonicalVolumeLink
     * @param description
     * @param language
     * @param title
     * @param imageLinks
     * @param subtitle
     * @param panelizationSummary
     * @param publisher
     * @param publishedDate
     * @param categories
     * @param maturityRating
     * @param allowAnonLogging
     * @param contentVersion
     * @param authors
     * @param infoLink
     */
    public VolumeInfo(String title, String subtitle, List<String> authors, String publisher, String publishedDate, String description, List<IndustryIdentifier> industryIdentifiers, ReadingModes readingModes, Integer pageCount, String printType, List<String> categories, String maturityRating, Boolean allowAnonLogging, String contentVersion, PanelizationSummary panelizationSummary, ImageLinks imageLinks, String language, String previewLink, String infoLink, String canonicalVolumeLink) {
        super();
        this.title = title;
        this.subtitle = subtitle;
        this.authors = authors;
        this.publisher = publisher;
        this.publishedDate = publishedDate;
        this.description = description;
        this.industryIdentifiers = industryIdentifiers;
        this.readingModes = readingModes;
        this.pageCount = pageCount;
        this.printType = printType;
        this.categories = categories;
        this.maturityRating = maturityRating;
        this.allowAnonLogging = allowAnonLogging;
        this.contentVersion = contentVersion;
        this.panelizationSummary = panelizationSummary;
        this.imageLinks = imageLinks;
        this.language = language;
        this.previewLink = previewLink;
        this.infoLink = infoLink;
        this.canonicalVolumeLink = canonicalVolumeLink;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("subtitle")
    public String getSubtitle() {
        return subtitle;
    }

    @JsonProperty("subtitle")
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    @JsonProperty("authors")
    public List<String> getAuthors() {
        return authors;
    }

    @JsonProperty("authors")
    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    @JsonProperty("publisher")
    public String getPublisher() {
        return publisher;
    }

    @JsonProperty("publisher")
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @JsonProperty("publishedDate")
    public String getPublishedDate() {
        return publishedDate;
    }

    @JsonProperty("publishedDate")
    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("industryIdentifiers")
    public List<IndustryIdentifier> getIndustryIdentifiers() {
        return industryIdentifiers;
    }

    @JsonProperty("industryIdentifiers")
    public void setIndustryIdentifiers(List<IndustryIdentifier> industryIdentifiers) {
        this.industryIdentifiers = industryIdentifiers;
    }

    @JsonProperty("readingModes")
    public ReadingModes getReadingModes() {
        return readingModes;
    }

    @JsonProperty("readingModes")
    public void setReadingModes(ReadingModes readingModes) {
        this.readingModes = readingModes;
    }

    @JsonProperty("pageCount")
    public Integer getPageCount() {
        return pageCount;
    }

    @JsonProperty("pageCount")
    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    @JsonProperty("printType")
    public String getPrintType() {
        return printType;
    }

    @JsonProperty("printType")
    public void setPrintType(String printType) {
        this.printType = printType;
    }

    @JsonProperty("categories")
    public List<String> getCategories() {
        return categories;
    }

    @JsonProperty("categories")
    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    @JsonProperty("maturityRating")
    public String getMaturityRating() {
        return maturityRating;
    }

    @JsonProperty("maturityRating")
    public void setMaturityRating(String maturityRating) {
        this.maturityRating = maturityRating;
    }

    @JsonProperty("allowAnonLogging")
    public Boolean getAllowAnonLogging() {
        return allowAnonLogging;
    }

    @JsonProperty("allowAnonLogging")
    public void setAllowAnonLogging(Boolean allowAnonLogging) {
        this.allowAnonLogging = allowAnonLogging;
    }

    @JsonProperty("contentVersion")
    public String getContentVersion() {
        return contentVersion;
    }

    @JsonProperty("contentVersion")
    public void setContentVersion(String contentVersion) {
        this.contentVersion = contentVersion;
    }

    @JsonProperty("panelizationSummary")
    public PanelizationSummary getPanelizationSummary() {
        return panelizationSummary;
    }

    @JsonProperty("panelizationSummary")
    public void setPanelizationSummary(PanelizationSummary panelizationSummary) {
        this.panelizationSummary = panelizationSummary;
    }

    @JsonProperty("imageLinks")
    public ImageLinks getImageLinks() {
        return imageLinks;
    }

    @JsonProperty("imageLinks")
    public void setImageLinks(ImageLinks imageLinks) {
        this.imageLinks = imageLinks;
    }

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("previewLink")
    public String getPreviewLink() {
        return previewLink;
    }

    @JsonProperty("previewLink")
    public void setPreviewLink(String previewLink) {
        this.previewLink = previewLink;
    }

    @JsonProperty("infoLink")
    public String getInfoLink() {
        return infoLink;
    }

    @JsonProperty("infoLink")
    public void setInfoLink(String infoLink) {
        this.infoLink = infoLink;
    }

    @JsonProperty("canonicalVolumeLink")
    public String getCanonicalVolumeLink() {
        return canonicalVolumeLink;
    }

    @JsonProperty("canonicalVolumeLink")
    public void setCanonicalVolumeLink(String canonicalVolumeLink) {
        this.canonicalVolumeLink = canonicalVolumeLink;
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
        return "VolumeInfo{" +
                "title='" + title + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", authors=" + authors +
                ", publisher='" + publisher + '\'' +
                ", publishedDate='" + publishedDate + '\'' +
                ", description='" + description + '\'' +
                ", industryIdentifiers=" + industryIdentifiers +
                ", readingModes=" + readingModes +
                ", pageCount=" + pageCount +
                ", printType='" + printType + '\'' +
                ", categories=" + categories +
                ", maturityRating='" + maturityRating + '\'' +
                ", allowAnonLogging=" + allowAnonLogging +
                ", contentVersion='" + contentVersion + '\'' +
                ", panelizationSummary=" + panelizationSummary +
                ", imageLinks=" + imageLinks +
                ", language='" + language + '\'' +
                ", previewLink='" + previewLink + '\'' +
                ", infoLink='" + infoLink + '\'' +
                ", canonicalVolumeLink='" + canonicalVolumeLink + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }

}
