package demo.domain;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

@ApiModel
public class Entity {

    @ApiModelProperty(value = "id description", required = true, position = 1)
    private int id;
    @ApiModelProperty(value = "status description", required = true, position = 2)
    private String status;
    @ApiModelProperty(value = "description", required = false, position = 3)
    private String description;
    @ApiModelProperty(value = "comment description", required = false, position = 4)
    private String comment;

    public Entity(final int id) {
        this.id = id;
        this.status = "status" + id;
        this.description = "description" + id;
        this.comment = "comment" + id;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(final String comment) {
        this.comment = comment;
    }
}
