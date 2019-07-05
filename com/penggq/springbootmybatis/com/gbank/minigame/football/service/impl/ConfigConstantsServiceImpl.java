package com.gbank.minigame.football.service.impl;

import com.gbank.minigame.football.entity.ConfigConstants;
import com.gbank.minigame.football.mapper.ConfigConstantsMapper;
import com.gbank.minigame.football.service.ConfigConstantsService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 常量配置表 服务实现类
 * </p>
 *
 * @author penggq
 * @since 2019-06-20
 */
@Service
public class ConfigConstantsServiceImpl extends ServiceImpl<ConfigConstantsMapper, ConfigConstants> implements ConfigConstantsService {

}
