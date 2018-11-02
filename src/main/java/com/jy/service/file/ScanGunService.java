package com.jy.service.file;

import com.jy.common.utils.tree.entity.ZNodes;
import com.jy.entity.file.File;
import com.jy.entity.file.Filevirtual;
import com.jy.entity.file.ScanGun;
import com.jy.service.base.BaseService;

import java.util.List;

public interface ScanGunService extends BaseService<ScanGun>{
    /**
     * @param gunNo
     * @return
     */
    public ScanGun findFormatByGunNo(String gunNo);
    /**
     * 新增文件(后台)
     * @param file
     * @return
     */
    public int insertGun(ScanGun file) throws Exception;
    /**
     * 获得角色树
     * @return
     */
    public List<ZNodes> getOrgs();
	 /**
     * 删除文件
     * @param scanGun
     * @return
     */
	public void deleteGun(ScanGun scanGun);
	 /**
     * 批量删除文件
     * @param chks 人员id 
     * @return
     */
	public void deleteBatchGun(String chks);
}
