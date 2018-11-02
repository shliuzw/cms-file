package com.jy.service.file;

import com.jy.entity.file.FileImage;
import com.jy.service.base.BaseService;

/**
 * Created by spring on 2017/1/4.
 */
public interface FileImageService extends BaseService<FileImage> {
    public void deleteFile(FileImage fileImage);
}
