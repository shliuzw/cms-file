package com.jy.service.file;

import com.jy.common.utils.tree.entity.ZNodes;
import com.jy.entity.file.File;
import com.jy.entity.file.Filevirtual;
import com.jy.entity.file.FilevirtualTracker;
import com.jy.service.base.BaseService;

import java.util.List;

public interface FilevirtualTrackerService extends BaseService<FilevirtualTracker>{
    /**
     * @param fileName
     * @return
     */
    public File findFormatByFileName(String fileName);
    /**
     * 新增文件(后台)
     * @param file
     * @return
     */
    public int insertTracker(FilevirtualTracker file) throws Exception;
    /**
     * 获得角色树
     * @return
     */
    public List<ZNodes> getOrgs();
	 /**
     * 删除文件
     * @param file
     * @return
     */
	public void deleteTracker(FilevirtualTracker file);
	 /**
     * 批量删除文件
     * @param chks 人员id 
     * @return
     */
	public void deleteBatchTracker(String chks);
}
