package com.ylsq.common.base;

public enum SysParamEnum {
	Rec_Status("record_status"),
	Menu_Module("menu_module"),
	Param_Data_type("param_data_type"),
	Alternative("alternative"),
	
	;
	
	private final String constant;

	SysParamEnum(String c) {
		this.constant = c;
	}

	public String getConstant() {
		return constant;
	}
}
