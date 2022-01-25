package pre.DomainDrivenDesign.dao;

import pre.DomainDrivenDesign.entity.VirtualWalletEntity;

import java.math.BigDecimal;

/**
 * @Description:
 * @Author: yanzhihao
 * @Date: 2022/1/24 2:17 下午
 */
public class VirtualWalletRepository {
    public VirtualWalletEntity getWalletEntity(Long walletId) {
        return new VirtualWalletEntity();
    }

    public BigDecimal getBalance(Long walletId) {
        return new BigDecimal(1);
    }

    public void updateBalance(Long walletId, BigDecimal balance) {
    }
}
