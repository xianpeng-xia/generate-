package com.gbank.minigame.football.service.impl;

import com.gbank.minigame.football.entity.LoginLog;
import com.gbank.minigame.football.mapper.LoginLogMapper;
import com.gbank.minigame.football.service.LoginLogService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户连接记录表 服务实现类
 * </p>
 *
 * @author penggq
 * @since 2019-06-20
 */
@Service
public class LoginLogServiceImpl extends ServiceImpl<LoginLogMapper, LoginLog> implements LoginLogService {

}
