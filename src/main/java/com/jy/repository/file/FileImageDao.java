package com.jy.repository.file;

import com.jy.common.mybatis.Page;
import com.jy.common.utils.tree.entity.ZNodes;
import com.jy.entity.file.File;
import com.jy.entity.file.FileImage;
import com.jy.repository.base.BaseDao;
import com.jy.repository.base.JYBatis;
import org.apache.ibatis.annotations.Param;
import org.apache.poi.ss.formula.functions.T;

import java.util.List;


/**
 * 用户数据层
 */
@JYBatis
public interface FileImageDao extends BaseDao<FileImage>{
    /**
     * 根据登录帐号查找loginName和accountType，正常只有一条数据
     * and a.isvalid='1' and a.account_type='1'需要该条件
     * @param fileName
     * @return
     */
    public File findFormatByFileName(String fileName);
    /**
     * 根据登录帐号ID,正常只有一条数据
     * @param fileId
     * @return
     */
    public File findFileById(String fileId);
    /**
     * 获得角色树
     * @return
     */
    public List<ZNodes> getOrgs();
    /**
     * 通过登录名查找用户数量
     * @param fileName 文件名
     * @return
     */
    public int findCountByFileName(@Param("fileName") String fileName);

    /**
     * 获得对象列表
     * @param o 对象
     * @param page 分页对象
     * @return List
     */
    public List<T> findByPage(@Param("param")T o,Page<T> page);

}
