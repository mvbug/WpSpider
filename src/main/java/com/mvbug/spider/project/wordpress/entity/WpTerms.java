package com.mvbug.spider.project.wordpress.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class WpTerms implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long termId;
    private String name;
    private String slug;
    private Long termGroup;

}
