package com.ylsq.frame.tianze.remoting.tranfer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.ylsq.frame.tianze.strategy.dao.model.TzStrategyEncrypt;
import com.ylsq.frame.tianze.strategy.dao.model.TzStrategySoftware;
import com.ylsq.frame.tianze.strategy.dao.model.TzStrategyWatermark;

public class StrategyEncrypt {
	
    @SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
    
    public StrategyEncrypt(){
    	
    }
    
    public StrategyEncrypt(TzStrategyEncrypt strategy, TzStrategyWatermark watermark){
    	if(strategy != null) {
    		setId(strategy.getId());
    		setAllowCopy(strategy.getAllowCopy());
    		setAllowHackerSoftware(strategy.getAllowHackerSoftware());
    		setAllowOffline(strategy.getAllowOffline());
    		setAllowPrint(strategy.getAllowPrint());
    		setAllowScreen(strategy.getAllowScreen());
    		setAllowSendout(strategy.getAllowSendout());
    		setEncryptFlag(strategy.getEncryptFlag());
    		setStrategyName(strategy.getStrategyName());
    		setStrategyRemark(strategy.getStrategyRemark());
    		setWatermark(strategy.getWatermark());
    		setCreateTime(strategy.getCreateTime());
    		setCreateUser(strategy.getCreateUser());
    		setRecStatus(strategy.getRecStatus());
    	}
    	
    	if(watermark != null) {
    		setDisplayCondition(watermark.getDisplayCondition());
    		setDisplayIp(watermark.getDisplayIp());
    		setDisplayLoginTime(watermark.getDisplayLoginTime());
    		setDisplayPcname(watermark.getDisplayPcname());
    		setDisplayUsrname(watermark.getDisplayUsrname());
    		setLayout(watermark.getLayout());
    		setPosCenter(watermark.getPosCenter());
    		setPosLeftbottom(watermark.getPosLeftbottom());
    		setPosLefttop(watermark.getPosLefttop());
    		setPosRightbottom(watermark.getPosRightbottom());
    		setPosRighttop(watermark.getPosRighttop());
    		setWatermarkContent(watermark.getContent());
    		setTransparency(watermark.getTransparency());
    	}
    }
    
	/**
     * 编号
     *
     * @mbg.generated
     */
    private Long id;
    
    private Long watermarkId;

    private String selectedAppIds;
    
    public String getSelectedAppIds() {
		return selectedAppIds;
	}

	public void setSelectedAppIds(String selectedAppIds) {
		this.selectedAppIds = selectedAppIds;
	}

	/**
     * 策略名
     *
     * @mbg.generated
     */
    private String strategyName;

    /**
     * 允许拷贝
     *
     * @mbg.generated
     */
    private Integer allowCopy;

    /**
     * 允许截屏
     *
     * @mbg.generated
     */
    private Integer allowScreen;

    /**
     * 允许打印
     *
     * @mbg.generated
     */
    private Integer allowPrint;

    /**
     * 水印
     *
     * @mbg.generated
     */
    private Integer watermark;

    /**
     * 允许外发转加密
     *
     * @mbg.generated
     */
    private Integer allowSendout;

    /**
     * 标识加密文件
     *
     * @mbg.generated
     */
    private Integer encryptFlag;

    /**
     * 允许运行黑客软件
     *
     * @mbg.generated
     */
    private Integer allowHackerSoftware;

    /**
     * 允许脱机
     *
     * @mbg.generated
     */
    private Integer allowOffline;

    /**
     * 备注
     *
     * @mbg.generated
     */
    private String strategyRemark;

    /**
     * 水印内容
     *
     * @mbg.generated
     */
    private String watermarkContent;

    /**
     * 显示用户名
     *
     * @mbg.generated
     */
    private Integer displayUsrname;

    /**
     * 显示计算机名
     *
     * @mbg.generated
     */
    private Integer displayPcname;

    /**
     * 显示终端IP
     *
     * @mbg.generated
     */
    private Integer displayIp;

    /**
     * 显示登录时间
     *
     * @mbg.generated
     */
    private Integer displayLoginTime;

    /**
     * 位置-居中
     *
     * @mbg.generated
     */
    private Integer posCenter;

    /**
     * 位置-左上
     *
     * @mbg.generated
     */
    private Integer posLefttop;

    /**
     * 位置-左下
     *
     * @mbg.generated
     */
    private Integer posLeftbottom;

    /**
     * 位置-右上
     *
     * @mbg.generated
     */
    private Integer posRighttop;

    /**
     * 位置-右下
     *
     * @mbg.generated
     */
    private Integer posRightbottom;

    /**
     * 版式
     *
     * @mbg.generated
     */
    private String layout;

    /**
     * 显示条件
     *
     * @mbg.generated
     */
    private String displayCondition;

    /**
     * 透明度
     *
     * @mbg.generated
     */
    private Integer transparency;
    

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * 创建人
     *
     * @mbg.generated
     */
    private String createUser;

    /**
     * 记录状态
     *
     * @mbg.generated
     */
    private Integer recStatus;

    public String getWatermarkContent() {
        return watermarkContent;
    }

    public void setWatermarkContent(String content) {
        this.watermarkContent = content;
    }

    public Integer getDisplayUsrname() {
        return displayUsrname;
    }

    public void setDisplayUsrname(Integer displayUsrname) {
        this.displayUsrname = displayUsrname;
    }

    public Integer getDisplayPcname() {
        return displayPcname;
    }

    public void setDisplayPcname(Integer displayPcname) {
        this.displayPcname = displayPcname;
    }

    public Integer getDisplayIp() {
        return displayIp;
    }

    public void setDisplayIp(Integer displayIp) {
        this.displayIp = displayIp;
    }

    public Integer getDisplayLoginTime() {
        return displayLoginTime;
    }

    public void setDisplayLoginTime(Integer displayLoginTime) {
        this.displayLoginTime = displayLoginTime;
    }

    public Integer getPosCenter() {
        return posCenter;
    }

    public void setPosCenter(Integer posCenter) {
        this.posCenter = posCenter;
    }

    public Integer getPosLefttop() {
        return posLefttop;
    }

    public void setPosLefttop(Integer posLefttop) {
        this.posLefttop = posLefttop;
    }

    public Integer getPosLeftbottom() {
        return posLeftbottom;
    }

    public void setPosLeftbottom(Integer posLeftbottom) {
        this.posLeftbottom = posLeftbottom;
    }

    public Integer getPosRighttop() {
        return posRighttop;
    }

    public void setPosRighttop(Integer posRighttop) {
        this.posRighttop = posRighttop;
    }

    public Integer getPosRightbottom() {
        return posRightbottom;
    }

    public void setPosRightbottom(Integer posRightbottom) {
        this.posRightbottom = posRightbottom;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public String getDisplayCondition() {
        return displayCondition;
    }

    public void setDisplayCondition(String displayCondition) {
        this.displayCondition = displayCondition;
    }

    public Integer getTransparency() {
        return transparency;
    }

    public void setTransparency(Integer transparency) {
        this.transparency = transparency;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStrategyName() {
        return strategyName;
    }

    public void setStrategyName(String strategyName) {
        this.strategyName = strategyName;
    }

    public Integer getAllowCopy() {
        return allowCopy;
    }

    public void setAllowCopy(Integer allowCopy) {
        this.allowCopy = allowCopy;
    }

    public Integer getAllowScreen() {
        return allowScreen;
    }

    public void setAllowScreen(Integer allowScreen) {
        this.allowScreen = allowScreen;
    }

    public Integer getAllowPrint() {
        return allowPrint;
    }

    public void setAllowPrint(Integer allowPrint) {
        this.allowPrint = allowPrint;
    }

    public Integer getWatermark() {
        return watermark;
    }

    public void setWatermark(Integer watermark) {
        this.watermark = watermark;
    }

    public Integer getAllowSendout() {
        return allowSendout;
    }

    public void setAllowSendout(Integer allowSendout) {
        this.allowSendout = allowSendout;
    }

    public Integer getEncryptFlag() {
        return encryptFlag;
    }

    public void setEncryptFlag(Integer encryptFlag) {
        this.encryptFlag = encryptFlag;
    }

    public Integer getAllowHackerSoftware() {
        return allowHackerSoftware;
    }

    public void setAllowHackerSoftware(Integer allowHackerSoftware) {
        this.allowHackerSoftware = allowHackerSoftware;
    }

    public Integer getAllowOffline() {
        return allowOffline;
    }

    public void setAllowOffline(Integer allowOffline) {
        this.allowOffline = allowOffline;
    }

    public String getStrategyRemark() {
        return strategyRemark;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Integer getRecStatus() {
        return recStatus;
    }

    public void setRecStatus(Integer recStatus) {
        this.recStatus = recStatus;
    }

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setStrategyRemark(String strategyRemark) {
		this.strategyRemark = strategyRemark;
	}

	public Long getWatermarkId() {
		return watermarkId;
	}

	public void setWatermarkId(Long watermarkId) {
		this.watermarkId = watermarkId;
	}
	
	public List<TzStrategySoftware> toSoftwares(){
		String names = StringUtils.defaultIfBlank(getSelectedAppIds(),"");
		String[] nameArray = StringUtils.split(names, ",");
		List<TzStrategySoftware> softwares = new ArrayList<>();
		for(String name: nameArray) {
			if(name.startsWith("j") && name.indexOf("_")>1) //jstree default node id
				continue;
			TzStrategySoftware one = new TzStrategySoftware();
			one.setStrategyName(getStrategyName());
			one.setSoftwareCode(name);
			softwares.add(one);
		}
		return softwares;
	}
	
	public TzStrategyEncrypt toStrategy() {
		TzStrategyEncrypt tse = new TzStrategyEncrypt();
		tse.setId(getId());
		tse.setAllowCopy(getAllowCopy());
		tse.setAllowHackerSoftware(getAllowHackerSoftware());
		tse.setAllowOffline(getAllowOffline());
		tse.setAllowPrint(getAllowPrint());
		tse.setAllowSendout(getAllowSendout());
		tse.setAllowScreen(getAllowScreen());
		tse.setEncryptFlag(getEncryptFlag());
		tse.setStrategyName(getStrategyName());
		tse.setStrategyRemark(getStrategyRemark());
		tse.setWatermark(getWatermark());
		tse.setCreateTime(getCreateTime());
		tse.setCreateUser(getCreateUser());
		tse.setRecStatus(getRecStatus());
		return tse;
	}
	
	public TzStrategyWatermark toWatermark() {
		TzStrategyWatermark tsw = new TzStrategyWatermark();
		tsw.setId(getWatermarkId());
		tsw.setStrategyId(getId());
		tsw.setContent(getWatermarkContent());
		tsw.setDisplayCondition(getDisplayCondition());
		tsw.setDisplayIp(getDisplayIp());
		tsw.setDisplayLoginTime(getDisplayLoginTime());
		tsw.setDisplayPcname(getDisplayPcname());
		tsw.setDisplayUsrname(getDisplayUsrname());
		tsw.setLayout(getLayout());
		tsw.setPosCenter(getPosCenter());
		tsw.setPosLeftbottom(getPosLeftbottom());
		tsw.setPosLefttop(getPosLefttop());
		tsw.setPosRightbottom(getPosRightbottom());
		tsw.setPosRighttop(getPosRighttop());
		tsw.setTransparency(getTransparency());
		
		tsw.setCreateTime(getCreateTime());
		tsw.setCreateUser(getCreateUser());
		tsw.setRecStatus(getRecStatus());
		return tsw;
	}
}
