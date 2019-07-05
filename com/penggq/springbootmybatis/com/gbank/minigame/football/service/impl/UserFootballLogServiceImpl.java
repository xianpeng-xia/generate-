package com.gbank.minigame.football.service.impl;

import com.gbank.minigame.football.entity.UserFootballLog;
import com.gbank.minigame.football.mapper.UserFootballLogMapper;
import com.gbank.minigame.football.service.UserFootballLogService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 玩家每局游戏的押注与输赢结果记录 服务实现类
 * </p>
 *
 * @author penggq
 * @since 2019-06-20
 */
@Service
public class UserFootballLogServiceImpl extends ServiceImpl<UserFootballLogMapper, UserFootballLog> implements UserFootballLogService {

}
