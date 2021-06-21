package com.example.seckill_mybatis_reverse_engineering.web;

import com.example.seckill_mybatis_reverse_engineering.services.SeckillActivityService;
import com.example.seckill_mybatis_reverse_engineering.services.SeckillOverSellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SeckillOverSellController {
    @Autowired
    private SeckillOverSellService seckillOverSellService;

    @Autowired
    private SeckillActivityService seckillActivityService;

    /**
     * 使用 lua 脚本处理抢购请求
     * @param seckillActivityId
     * @return
     */
    @ResponseBody
    @RequestMapping("/seckill/{seckillActivityId}")
    public String seckillCommodity(@PathVariable long seckillActivityId) {
        boolean stockValidateResult =
                seckillActivityService.seckillStockValidator(seckillActivityId);
        return stockValidateResult ? "恭喜你秒杀成功" : "商品已经售完，下次再来";
    }

    /**
     * 简单 处理抢购请求
     * @param seckillActivityId
     * @return
     */
//    @ResponseBody
//    @RequestMapping("/seckill/{seckillActivityId}")
    public String seckil(@PathVariable long seckillActivityId){
        return seckillOverSellService.processSeckill(seckillActivityId);
    }
}
