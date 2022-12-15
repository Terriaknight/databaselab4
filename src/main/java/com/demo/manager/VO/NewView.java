package com.demo.manager.VO;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author luzikai
 * @ClassName NewView.java
 * @Mail 1158523349@qq.com
 * @createTime 2022年06月04日 15:49:00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NewView {
    private int id;
    private String author;
    private String title;
    private String info;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:SS")
    private Date time;
    private int catagory;
}
