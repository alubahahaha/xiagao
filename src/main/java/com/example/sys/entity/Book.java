package com.example.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
 * @since 2021-02-14
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
public class Book implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "book_id", type = IdType.AUTO)
      private Integer bookId;

    private String name;

    private String press;


}
