package com.xbc.cloud.xbcsystem.service.impl;

import com.xbc.cloud.xbcsystem.dao.StationDao;
import com.xbc.cloud.xbcsystem.dao.UserDao;
import com.xbc.cloud.xbcsystem.entity.Station;
import com.xbc.cloud.xbcsystem.entity.User;
import com.xbc.cloud.xbcsystem.service.StationService;
import com.xbc.cloud.xbcsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述：
 *
 * @author weizeng
 * @date 2019/4/30 16:38
 */
@Service
public class StationServiceImpl implements StationService {

    @Autowired
    StationDao stationDao;


    @Override
    public void add(Station station) {
        stationDao.add(station);
    }


}
