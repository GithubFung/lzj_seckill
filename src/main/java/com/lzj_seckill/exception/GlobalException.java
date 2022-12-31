package com.lzj_seckill.exception;

import com.lzj_seckill.vo.RespBeanEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 全局异常
 * Created by 小冯 on 2022/12/31 18:05
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GlobalException extends  RuntimeException{
    private RespBeanEnum respBeanEnum;
}
