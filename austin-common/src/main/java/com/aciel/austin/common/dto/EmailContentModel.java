package com.aciel.austin.common.dto;

import lombok.*;

/**
 * @author Aciel
 * @date
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmailContentModel extends ContentModel {
    /**
     * 标题
     */
    private String title;

    /**
     * 内容（可写入HTML）
     */
    private String content;
}
