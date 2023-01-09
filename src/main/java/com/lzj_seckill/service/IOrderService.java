package com.lzj_seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lzj_seckill.pojo.Order;
import com.lzj_seckill.pojo.User;
import com.lzj_seckill.vo.GoodsVo;
import com.lzj_seckill.vo.OrderDetailVo;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author feng
 * @since 2023-01-02
 */
public interface IOrderService extends IService<Order> {
    /**
     * 秒杀
     *
     * @param user
     * @param goods
     * @return
     */
    Order seckill(User user, GoodsVo goods);

    /**
     * 订单详情
     *
     * @param orderId
     * @return
     */
    OrderDetailVo detail(Long orderId);

    /**
     * 获取秒杀地址
     *
     * @param user
     * @param goodsId
     */
    String createPath(User user, Long goodsId);

    /**
     * 校验秒杀地址
     *
     * @param user
     * @param goodsId
     * @param path
     * @return
     */
    boolean checkPath(User user, Long goodsId, String path);

    /**
     * 校验验证码
     *
     * @param user
     * @param goodsId
     * @param captcha
     * @return
     */
    boolean checkCaptche(User user, Long goodsId, String captcha);
}
