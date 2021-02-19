package com.example.sys.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @author example
 * @since 2021-02-17
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
public class Submenu implements Serializable {

    private static final long serialVersionUID=1L;

      private Integer id;

    private String title;

    private String path;

    private Integer mid;

    @Override
    public String toString() {
        return "Submenu{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", path='" + path + '\'' +
                ", mid=" + mid +
                '}';
    }
}
