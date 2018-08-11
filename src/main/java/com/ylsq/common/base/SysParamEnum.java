package com.ylsq.common.base;

public enum SysParamEnum {
	Rec_Status("record_status"),
	Menu_Module("menu_module")
	
	;
	
	private final String constant;

	SysParamEnum(String c) {
		this.constant = c;
	}

	public String getConstant() {
		return constant;
	}
}
