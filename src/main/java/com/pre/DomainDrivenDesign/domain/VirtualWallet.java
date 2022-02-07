package com.pre.DomainDrivenDesign.domain;

import com.pre.DomainDrivenDesign.exception.InsufficientBalanceException;
import com.pre.DomainDrivenDesign.exception.InvalidAmountException;

import java.math.BigDecimal;

/**
 * @Description:
 * @Author: yanzhihao
 * @Date: 2022/1/24 2:09 下午
 */
public class VirtualWallet {
    // Domain 领域模型 (充血模型)
    private Long id;
    private Long createTime = System.currentTimeMillis();
    private BigDecimal balance = BigDecimal.ZERO;

    public VirtualWallet(Long preAllocatedId) {
        this.id = preAllocatedId;
    }

    public BigDecimal balance() {
        return this.balance;
    }

    public void debit(BigDecimal amount) throws InsufficientBalanceException {
        if (this.balance.compareTo(amount) < 0) {
            throw new InsufficientBalanceException("");
        }
        this.balance.subtract(amount);
    }

    public void credit(BigDecimal amount) throws InvalidAmountException {
        if (amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new InvalidAmountException("");
        }
        this.balance.add(amount);
    }
}
