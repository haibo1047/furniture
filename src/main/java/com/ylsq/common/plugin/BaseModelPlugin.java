package com.ylsq.common.plugin;

import java.util.List;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.TopLevelClass;

public class BaseModelPlugin extends PluginAdapter {
	private FullyQualifiedJavaType baseModelJavaType;
	
	public BaseModelPlugin() {
		super();
	}

	@Override
	public boolean validate(List<String> warnings) {
		return true;
	}

	@Override
	public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		String baseModelClass = getProperties().getProperty("baseModelClass");
		baseModelJavaType = new FullyQualifiedJavaType(baseModelClass);
		addBaseModel(topLevelClass,introspectedTable);
		return super.modelBaseRecordClassGenerated(topLevelClass, introspectedTable);
	}

	protected void addBaseModel(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		topLevelClass.addImportedType(baseModelJavaType);
		topLevelClass.addSuperInterface(baseModelJavaType);
		
	}
}
