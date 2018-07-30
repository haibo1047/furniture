package com.ylsq.common.base;

import java.util.Date;

public interface BaseModel {
	
    public Long getId();
    
    public void setId(Long id);

    public Date getCreateTime();
    
    public void setCreateTime(Date date);
    
    public String getCreateUser();
    
    public void setCreateUser(String user);

    public String getRecStatus();
    
    public void setRecStatus(String status);

}
