package com.lzj_seckill.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lzj_seckill.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author feng
 * @since 2022-12-31
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
