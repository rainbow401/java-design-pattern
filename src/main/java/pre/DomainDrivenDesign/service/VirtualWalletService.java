package pre.DomainDrivenDesign.service;

import pre.DomainDrivenDesign.domain.VirtualWallet;
import pre.DomainDrivenDesign.dao.VirtualWalletTransactionRepository;
import pre.DomainDrivenDesign.dao.VirtualWalletRepository;
import pre.DomainDrivenDesign.entity.VirtualWalletEntity;
import pre.DomainDrivenDesign.exception.InsufficientBalanceException;
import pre.DomainDrivenDesign.exception.InvalidAmountException;

import java.math.BigDecimal;

/**
 * @Description:
 * @Author: yanzhihao
 * @Date: 2022/1/24 2:16 下午
 */
public class VirtualWalletService {// 通过构造函数或者 IOC 框架注入
    private VirtualWalletRepository walletRepo;
    private VirtualWalletTransactionRepository transactionRepo;

    public VirtualWallet getVirtualWallet(Long walletId) {
        VirtualWalletEntity walletEntity = walletRepo.getWalletEntity(walletId);
        VirtualWallet wallet = convert(walletEntity);
        return wallet;
    }

    public BigDecimal getBalance(Long walletId) {
        return walletRepo.getBalance(walletId);
    }

    // 增加某钱包金额
    public void debit(Long walletId, BigDecimal amount) throws InsufficientBalanceException {
        VirtualWalletEntity walletEntity = walletRepo.getWalletEntity(walletId);
        VirtualWallet wallet = convert(walletEntity);
        wallet.debit(amount);
        walletRepo.updateBalance(walletId, wallet.balance());
    }

    //减少某钱包金额
    public void credit(Long walletId, BigDecimal amount) throws InvalidAmountException {
        VirtualWalletEntity walletEntity = walletRepo.getWalletEntity(walletId);
        VirtualWallet wallet = convert(walletEntity);
        wallet.credit(amount);
        walletRepo.updateBalance(walletId, wallet.balance());
    }

    public void transfer(Long fromWalletId, Long toWalletId, BigDecimal amount) {
    }

    private VirtualWallet convert(VirtualWalletEntity walletEntity) {
        return new VirtualWallet(1L);
    }
}
