package com.example.sys.entity;

import java.io.Serializable;
import java.util.List;

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
public class Mainmenu implements Serializable {

    private static final long serialVersionUID=1L;

      private Integer id;

    private String title;

    private String path;

    private List<Submenu> sList;



}
