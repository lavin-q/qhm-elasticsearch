package com.qhm.elasticsearch.mapper;

import com.qhm.elasticsearch.entity.IotHihModeRunData;
import com.qhm.elasticsearch.entity.IotHihModeRunDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IotHihModeRunDataMapper {
    long countByExample(IotHihModeRunDataExample example);

    int deleteByExample(IotHihModeRunDataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IotHihModeRunData record);

    int insertSelective(IotHihModeRunData record);

    List<IotHihModeRunData> selectByExample(IotHihModeRunDataExample example);

    IotHihModeRunData selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IotHihModeRunData record, @Param("example") IotHihModeRunDataExample example);

    int updateByExample(@Param("record") IotHihModeRunData record, @Param("example") IotHihModeRunDataExample example);

    int updateByPrimaryKeySelective(IotHihModeRunData record);

    int updateByPrimaryKey(IotHihModeRunData record);
}