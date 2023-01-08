package com.lzj_seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lzj_seckill.pojo.SeckillOrder;
import com.lzj_seckill.pojo.User;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author feng
 * @since 2023-01-02
 */
public interface ISeckillOrderService extends IService<SeckillOrder> {
    /**
     * 获取秒杀结果
     * @param user
     * @param goodsId
     * @return orderId:成功；-1:秒杀失败：0:排队中
     */
    Long getResult(User user, Long goodsId);
}
