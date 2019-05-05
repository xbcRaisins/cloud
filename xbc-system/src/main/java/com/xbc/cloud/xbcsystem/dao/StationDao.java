package com.xbc.cloud.xbcsystem.dao;

import com.xbc.cloud.xbcsystem.entity.Station;
import org.springframework.stereotype.Repository;

/**
 * 描述：
 *
 * @author xbcRaisins
 * @date 2019/5/1 15:04
 */
@Repository
public interface StationDao {

    void add(Station station);

}
