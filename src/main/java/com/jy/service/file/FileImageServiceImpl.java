package com.jy.service.file;

import com.jy.entity.file.FileImage;
import com.jy.repository.file.FileImageDao;
import com.jy.service.base.BaseServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by spring on 2017/1/4.
 */
@Service
public class FileImageServiceImpl extends BaseServiceImp<FileImage> implements FileImageService {
    @Autowired
    private FileImageDao fileImageDao;
    @Override
    public void deleteFile(FileImage fileImage) {
        //事务删除
        fileImageDao.delete(fileImage);
    }
}
