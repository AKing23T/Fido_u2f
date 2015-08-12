package u2f.data.messages.json;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

public interface Persistable extends Serializable {
    @JsonIgnore
    String getRequestId();

    String toJson();
}
