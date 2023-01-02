package com.lzj_seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lzj_seckill.pojo.Order;
import com.lzj_seckill.pojo.User;
import com.lzj_seckill.vo.GoodsVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author feng
 * @since 2023-01-02
 */
public interface IOrderService extends IService<Order> {
    /**
     * 秒杀
     * @param user
     * @param goods
     * @return
     */
    Order seckill(User user, GoodsVo goods);
}
