package com.aciel.austin.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * @author Aciel
 *
 * 审核状态
 */
@Getter
@ToString
@AllArgsConstructor
public enum AuditStatus {
    /**
     * 10：待审核 20：审核成功 30：被拒绝
     */
    WAIT_AUDIT(10, "待审核"),
    AUDIT_SUCCESS(20, "审核成功"),
    AUDIT_REJECT(30, "被拒绝");

    private Integer code;
    private String description;
}