package com.dmall.orderservice.adapter.inventory;

/**
 * @Author: Abby
 * @Description:
 * @Date: Create in 4:07 PM 6/20/2019
 * @Modified By:
 */
public class InventoryClientFallback implements InventoryClient{

    @Override
    public String lock(Lock lock) {
        return "fall back";
    }

    @Override
    public void unlock(String lockId) {

    }
}
