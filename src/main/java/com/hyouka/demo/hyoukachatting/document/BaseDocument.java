package com.hyouka.demo.hyoukachatting.document;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Id;
import java.io.Serializable;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public abstract class BaseDocument implements Serializable {
    @Id
    private String id;
    private Instant createdAt = Instant.now();
    @LastModifiedDate
    private Instant updatedAt = Instant.now();
    private Map<String, Object> others;
    public Map<String, Object> getOthers() {
        return this.others == null ? new HashMap<>() : this.others;
    }
    @JsonAnySetter
    private void add(String key, Object value) {
        if (null == others) {
            others = new HashMap<>();
        }
        others.put(key, value);
    }

    @JsonAnyGetter
    private Map<String, Object> get() {
        return others;
    }

}
