package com.lzj_seckill.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lzj_seckill.pojo.Goods;
import com.lzj_seckill.vo.GoodsVo;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author feng
 * @since 2023-01-02
 */
public interface GoodsMapper extends BaseMapper<Goods> {
    /**
     * 获取商品列表
     * @return
     */
    List<GoodsVo> findGoodsVo();

    /**
     * 获取商品详情
     * @return
     * @param goodsId
     */
    GoodsVo findGoodsVoByGoodsId(Long goodsId);
}
