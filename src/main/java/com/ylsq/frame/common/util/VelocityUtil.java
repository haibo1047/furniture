package com.ylsq.frame.common.util;

import java.io.File;
import java.util.Properties;

import org.apache.commons.io.output.FileWriterWithEncoding;
import org.apache.commons.lang.StringUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;

/**
 * Velocity工具类
 * Created by ZhangShuzheng on 2017/1/10.
 */
public class VelocityUtil {

	/**
	 * 根据模板生成文件
	 * @param inputVmFilePath 模板路径
	 * @param outputFilePath 输出文件路径
	 * @param context
	 * @throws Exception
	 */
	public static void generate(String inputVmFilePath, String outputFilePath, VelocityContext context) throws Exception {
		try {
			Properties properties = new Properties();
			properties.setProperty(VelocityEngine.FILE_RESOURCE_LOADER_PATH, "");
			properties.setProperty(VelocityEngine.RUNTIME_LOG_REFERENCE_LOG_INVALID, "null");
			Velocity.init(properties);
			//VelocityEngine engine = new VelocityEngine();
			Template template = Velocity.getTemplate(inputVmFilePath, "utf-8");
			File outputFile = new File(outputFilePath);
			File folder = new File(outputFile.getParent());
			if(!folder.exists())
				folder.mkdirs();
			FileWriterWithEncoding writer = new FileWriterWithEncoding(outputFile, "utf-8");
			template.merge(context, writer);
			writer.close();
		} catch (Exception ex) {
			throw ex;
		}
	}

}
