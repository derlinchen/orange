package com.orange.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.orange.entity.PmtXtype;

/**
 * Dao层就对应MyBatis的mapper层,这里必须使用@Mapper注解才能由MyBatis自动调用
 * @author Derlin
 *
 */
@Mapper
public interface BusDao {

	public List<PmtXtype> getXtype(PmtXtype item);

}
